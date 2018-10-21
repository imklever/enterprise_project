package com.lmis.pos.common.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import com.lmis.framework.baseModel.PersistentObject;

import io.swagger.annotations.ApiModelProperty;

/** 
 * @ClassName: PosPurchaseOrderMain
 * @Description: TODO(NIKE-PO单主表)
 * @author codeGenerator
 * @date 2018-06-06 19:53:40
 * 
 */
public class PosPurchaseOrderMain extends PersistentObject {

    /** 
	 * @Fields serialVersionUID : TODO(序列号) 
	 */
	private static final long serialVersionUID = 1L;
	
    public static long getSerialversionuid() {
    	return serialVersionUID;	
    }
    
    @ApiModelProperty(value = "")
	private String batId;
	public String getBatId() {
		return batId;
	}
	public void setBatId(String batId) {
		this.batId = batId;
	}
	
    @ApiModelProperty(value = "")
	private String poNumber;
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	
    @ApiModelProperty(value = "")
	private String poNumberLike;
	public String getPoNumberLike() {
		return poNumberLike;
	}
	public void setPoNumberLike(String poNumberLike) {
		this.poNumberLike = poNumberLike;
	}

	@ApiModelProperty(value = "PO单号（未处理过的）")
	private String poNumber1;
	public String getPoNumber1() {
		return poNumber1;
	}
	public void setPoNumber1(String poNumber1) {
		this.poNumber1 = poNumber1;
	}
	
    @ApiModelProperty(value = "单据类型")
	private String orderType;
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
    @ApiModelProperty(value = "商品总数")
	private Integer totalQty;
	public Integer getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(Integer totalQty) {
		this.totalQty = totalQty;
	}
	
    @ApiModelProperty(value = "最晚到货日期")
	private String crdTime;
	public String getCrdTime() {
		return crdTime;
	}
	public void setCrdTime(String crdTime) {
		this.crdTime = crdTime;
	}
	
    @ApiModelProperty(value = "创建日期区间-开始")
	private String createTimeStart;
	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	@ApiModelProperty(value = "创建日期区间-结束")
	private String createTimeEnd;
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
	
    @ApiModelProperty(value = "最晚到货日期区间-开始")
	private String crdTimeStart;
    public String getCrdTimeStart() {
		return crdTimeStart;
	}
	public void setCrdTimeStart(String crdTimeStart) {
		this.crdTimeStart = crdTimeStart;
	}

	@ApiModelProperty(value = "最晚到货日期区间-结束")
	private String crdTimeEnd;
	public String getCrdTimeEnd() {
		return crdTimeEnd;
	}
	public void setCrdTimeEnd(String crdTimeEnd) {
		this.crdTimeEnd = crdTimeEnd;
	}
	
    @ApiModelProperty(value = "po单据状态 0:未分仓 1: 已分仓 2:分仓失败")
	private String poFlag;
	public String getPoFlag() {
		return poFlag;
	}
	public void setPoFlag(String poFlag) {
		this.poFlag = poFlag;
	}
	
    @ApiModelProperty(value = "日志")
	private String log;
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	
    @ApiModelProperty(value = "po_type 新货/旧货")
	private String poType;
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "分仓执行时间")
	private Date splitTime;
	public Date getSplitTime() {
		return splitTime;
	}
	public void setSplitTime(Date splitTime) {
		this.splitTime = splitTime;
	}
	
    @ApiModelProperty(value = "文件编号")
	private String fileNo;
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	
    @ApiModelProperty(value = "文件名称")
	private String fileName;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
    @ApiModelProperty(value = "明细条数")
	private Integer poQty;
	public Integer getPoQty() {
		return poQty;
	}
	public void setPoQty(Integer poQty) {
		this.poQty = poQty;
	}
	
    @ApiModelProperty(value = "已拆分商品总数")
	private Integer isSplitTotleQty;
	public Integer getIsSplitTotleQty() {
		return isSplitTotleQty;
	}
	public void setIsSplitTotleQty(Integer isSplitTotleQty) {
		this.isSplitTotleQty = isSplitTotleQty;
	}
	
    @ApiModelProperty(value = "已拆分明细数")
	private Integer isSplitPoQty;
	public Integer getIsSplitPoQty() {
		return isSplitPoQty;
	}
	public void setIsSplitPoQty(Integer isSplitPoQty) {
		this.isSplitPoQty = isSplitPoQty;
	}

    @ApiModelProperty(value = "创建人用户名")
	private String createByUserName;
	public String getCreateByUserName() {
		return createByUserName;
	}
	public void setCreateByUserName(String createByUserName) {
		this.createByUserName = createByUserName;
	}
	
	//PO拆分汇总所需要的子查询条件
	@ApiModelProperty(value = "商品类型 10-服饰、20-鞋、30-配饰")
    private String bu;

    
    public String getBu(){
        return bu;
    }
    
    public void setBu(String bu){
        this.bu = bu;
    }
	
	
	
}
