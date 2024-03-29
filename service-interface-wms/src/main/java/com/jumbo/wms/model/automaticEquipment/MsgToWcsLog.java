package com.jumbo.wms.model.automaticEquipment;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import com.jumbo.wms.model.BaseModel;

/**
 * 通用WMS到WCS通讯日志
 * 
 * @author jinlong.ke
 * @date 2016年6月6日下午5:39:36
 * 
 */
@Entity
@Table(name = "T_LG_MSG_TO_WCS")
public class MsgToWcsLog extends BaseModel {
    /**
     * 
     */
    private static final long serialVersionUID = 9041801265002248257L;
    private Long id;
    /**
     * 接口信息内容，JSON格式
     */
    private String context;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 记录时间
     */
    private Date logTime;
    /**
     * 接口类型
     */
    private WcsInterfaceType type;
    /**
     * 作业单号
     */
    private String staCode;
    /**
     * 配货波次号
     */
    private String pickingListCode;
    /**
     * 容器号
     */
    private String containerCode;
    /**
     * 运单号
     */
    private String trackingNo;
    /**
     * 错误日志
     */
    private String errorMsg;

    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "SEQ_WH_MSG_TO_WCS", sequenceName = "S_T_WH_MSG_TO_WCS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_WH_MSG_TO_WCS")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Lob
    @Column(name = "CONTEXT", columnDefinition = "CLOB")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "type", columnDefinition = "integer")
    @Type(type = "loxia.dao.support.GenericEnumUserType", parameters = {@Parameter(name = "enumClass", value = "com.jumbo.wms.model.automaticEquipment.WcsInterfaceType")})
    public WcsInterfaceType getType() {
        return type;
    }

    public void setType(WcsInterfaceType type) {
        this.type = type;
    }

    @Column(name = "STA_CODE", length = 50)
    public String getStaCode() {
        return staCode;
    }

    public void setStaCode(String staCode) {
        this.staCode = staCode;
    }

    @Column(name = "PICKING_LIST_CODE", length = 50)
    public String getPickingListCode() {
        return pickingListCode;
    }

    public void setPickingListCode(String pickingListCode) {
        this.pickingListCode = pickingListCode;
    }

    @Column(name = "CONTAINER_CODE")
    public String getContainerCode() {
        return containerCode;
    }

    public void setContainerCode(String containerCode) {
        this.containerCode = containerCode;
    }

    @Column(name = "TRACKING_NO", length = 50)
    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    @Column(name = "LOG_TIME")
    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    @Column(name = "ERROR_MSG", length = 2000)
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
