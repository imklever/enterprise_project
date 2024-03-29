package com.jumbo.wms.manager.vmi.warehouse;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.jumbo.dao.vmi.ids.IdsServerInformationDao;
import com.jumbo.dao.warehouse.MsgRaCancelDao;
import com.jumbo.mq.MarshallerUtil;
import com.jumbo.webservice.ids.manager.IdsManager;
import com.jumbo.webservice.ids.manager.IdsManagerProxy;
import com.jumbo.webservice.ids.service.ServiceType;
import com.jumbo.wms.Constants;
import com.jumbo.wms.exception.BusinessException;
import com.jumbo.wms.exception.ErrorCode;
import com.jumbo.wms.model.DefaultStatus;
import com.jumbo.wms.model.vmi.ids.IdsServerInformation;
import com.jumbo.wms.model.vmi.ids.OrderConfirm.ConfirmResult;
import com.jumbo.wms.model.vmi.ids.ReturnNewLookJD;
import com.jumbo.wms.model.vmi.ids.ReturnNewLookJD.Result;
import com.jumbo.wms.model.vmi.warehouse.MsgInboundOrder;
import com.jumbo.wms.model.vmi.warehouse.MsgOutboundOrderCancel;
import com.jumbo.wms.model.vmi.warehouse.MsgOutboundOrderCancelStatus;
import com.jumbo.wms.model.vmi.warehouse.MsgRaCancel;
import com.jumbo.wms.model.warehouse.InventoryStatus;
import com.jumbo.wms.model.warehouse.WarehouseLocation;

public class VmiWarehouseNewLookJD extends AbstractVmiWarehouse {

    /**
     * 
     */
    private static final long serialVersionUID = 8722375045200370732L;

    protected static final Logger log = LoggerFactory.getLogger(VmiWarehouseNewLookJD.class);
    @Autowired
    private IdsManagerProxy idsManagerProxy;
    @Autowired
    private IdsServerInformationDao idsServerInformationDao;
    @Autowired
    private IdsManager idsManager;
    @Autowired
    private MsgRaCancelDao msgRaCancelDao;

    @Override
    public boolean cancelSalesOutboundSta(String staCode, MsgOutboundOrderCancel msg) {
        log.debug("LF CaneleOrderToNewLookJDTask1..." + staCode);
        boolean isCancle = false;
        try {
            log.debug("LF CaneleOrderToNewLookJDTask1..." + Constants.VIM_WH_SOURCE_NEWLOOKJD_IDS);
            // 调用LF接口，获取取消结果
            ConfirmResult result = idsManagerProxy.siginOrderCancelResponseToLF(msg, Constants.VIM_WH_SOURCE_NEWLOOKJD_IDS);
            if (result != null) {
                if (result.getSuccess().equals("true")) {
                    isCancle = true;
                } else if (result.getSuccess().equals("false")) {
                    if (result.getReason().equals("B11")) {
                        isCancle = true;
                    } else {
                        isCancle = false;
                    }
                }
                if (isCancle) {
                    msg.setStatus(MsgOutboundOrderCancelStatus.FINISHED);
                    msg.setIsCanceled(true);
                    msg.setMsg(result.getDescription());
                    msg.setUpdateTime(new Date());
                    msg.setMsg("WMS推送LF实时取消");
                } else {
                    throw new BusinessException(ErrorCode.STA_CANCELED_ERROR_VMI_WH);
                }
            } else {
                throw new BusinessException(ErrorCode.STA_CANCELED_ERROR_VMI_WH);
            }
        } catch (Exception e) {
            throw new BusinessException(ErrorCode.STA_CANCELED_ERROR_VMI_WH);
        }
        return isCancle;
    }

    @Override
    public void inboundNotice(MsgInboundOrder msgInorder) {

    }

    @Override
    public void inboundReturnRequestAnsToWms(MsgInboundOrder msg) {

    }

    @Override
    public WarehouseLocation findLocByInvStatus(InventoryStatus invStatus) {
        return null;
    }

    @Override
    public boolean cancelReturnRequest(Long msgLog) {

        boolean isSuccess = false;
        // 查找外包仓服务信息
        IdsServerInformation idsServerInformation = idsServerInformationDao.findServerInformationBySource(Constants.VIM_WH_SOURCE_NEWLOOKJD_IDS);
        // 将退货信息生成指定格式
        String respXml = idsManager.cancelReturnResponseLF(idsServerInformation, msgLog);
        if (StringUtils.hasText(respXml)) {
            try {
                String resultXml = ServiceType.sendMsgtoIds(ServiceType.LOGISTIC_RETURN_CANCEL, respXml, idsServerInformation.getServerUrl(), idsServerInformation.getKey(), idsServerInformation.getSign());
                log.info("-- UA ReturnNewLookJDCancel Text--" + resultXml);
                if (StringUtils.hasText(resultXml)) {
                    ReturnNewLookJD orderConfirm = (ReturnNewLookJD) MarshallerUtil.buildJaxb(ReturnNewLookJD.class, resultXml);

                    if (orderConfirm != null) {
                        Result result = orderConfirm.getResult();

                        MsgRaCancel raCancel = msgRaCancelDao.getByPrimaryKey(msgLog);
                        if (raCancel != null) {
                            if (result.getSuccess().equals("true")) {
                                raCancel.setVersion(1);
                                raCancel.setUpdateTime(new Date());
                                raCancel.setStatus(DefaultStatus.FINISHED);
                                isSuccess = true;
                            } else if (result.getSuccess().equals("false")) {
                                if ("B11".equals(result.getReason()) || "B13".equals(result.getReason())) {
                                 raCancel.setVersion(1);
                                 raCancel.setUpdateTime(new Date());
                                 raCancel.setStatus(DefaultStatus.FINISHED);
                                 isSuccess = true;
                                 } else {
                                    throw new BusinessException(ErrorCode.STA_STATUS_ERROR);
                                }
                            }
                            msgRaCancelDao.save(raCancel);
                        } else {
                            msgRaCancelDao.updateStatusById(msgLog, DefaultStatus.INEXECUTION.getValue());
                        }

                    }
                }
            } catch (Exception e) {
                log.error("ReturnNewLookJDCancel+", e);
                throw new BusinessException(ErrorCode.STA_STATUS_ERROR);
            }
        }
        return isSuccess;

    }

}
