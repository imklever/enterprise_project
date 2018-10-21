package com.lmis.basis.fixedAssetsDetail.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

/** 
 * @ClassName: ViewBasisFixedAssetsDetail
 * @Description: TODO(VIEW)
 * @author codeGenerator
 * @date 2018-03-23 17:12:34
 * 
 */
public class ViewBasisFixedAssetsDetail {
	
	@ApiModelProperty(value = "")
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@ApiModelProperty(value = "创建对象")
	private String createBy;
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@ApiModelProperty(value = "更新对象")
	private String updateBy;
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	
	@ApiModelProperty(value = "逻辑删除标志0-未删除 1-已删除")
	private Boolean isDeleted;
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	@ApiModelProperty(value = "启用 停用标志 1-已禁用 0-未禁用")
	private Boolean isDisabled;
	public Boolean getIsDisabled() {
		return isDisabled;
	}
	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	
	@ApiModelProperty(value = "版本号")
	private Integer version;
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@ApiModelProperty(value = "权限架构")
	private String pwrOrg;
	public String getPwrOrg() {
		return pwrOrg;
	}
	public void setPwrOrg(String pwrOrg) {
		this.pwrOrg = pwrOrg;
	}
	
	@ApiModelProperty(value = "固定资产编码（逻辑主键）")
	private String assetsCode;
	public String getAssetsCode() {
		return assetsCode;
	}
	public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
	}
	
	@ApiModelProperty(value = "固定资产名称")
	private String assetsName;
	public String getAssetsName() {
		return assetsName;
	}
	public void setAssetsName(String assetsName) {
		this.assetsName = assetsName;
	}
	
	@ApiModelProperty(value = "固定资产状态")
	private String assetsStatus;
	public String getAssetsStatus() {
		return assetsStatus;
	}
	public void setAssetsStatus(String assetsStatus) {
		this.assetsStatus = assetsStatus;
	}
	
	@ApiModelProperty(value = "常量名称")
	private String assetsStatusDisplay;
	public String getAssetsStatusDisplay() {
		return assetsStatusDisplay;
	}
	public void setAssetsStatusDisplay(String assetsStatusDisplay) {
		this.assetsStatusDisplay = assetsStatusDisplay;
	}
	
	@ApiModelProperty(value = "组织机构id")
	private String orgId;
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	@ApiModelProperty(value = "机构名称")
	private String orgIdDisplay;
	public String getOrgIdDisplay() {
		return orgIdDisplay;
	}
	public void setOrgIdDisplay(String orgIdDisplay) {
		this.orgIdDisplay = orgIdDisplay;
	}
	
	@ApiModelProperty(value = "采购日期")
	private String purchaseDate;
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	@ApiModelProperty(value = "采购日期开始")
	private String purchaseDateStart;
	
	public String getPurchaseDateStart() {
		return purchaseDateStart;
	}
	public void setPurchaseDateStart(String purchaseDateStart) {
		this.purchaseDateStart = purchaseDateStart;
	}
	
	@ApiModelProperty(value = "采购日期结束")
	private String purchaseDateEnd;
	public String getPurchaseDateEnd() {
		return purchaseDateEnd;
	}
	public void setPurchaseDateEnd(String purchaseDateEnd) {
		this.purchaseDateEnd = purchaseDateEnd;
	}
	
	@ApiModelProperty(value = "报废日期")
	private String expiryDate;
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	@ApiModelProperty(value = "报废日期开始")
	private String expiryDateStart;
	
	public String getExpiryDateStart() {
		return expiryDateStart;
	}
	public void setExpiryDateStart(String expiryDateStart) {
		this.expiryDateStart = expiryDateStart;
	}

	@ApiModelProperty(value = "报废日期结束")
	private String expiryDateEnd;
	public String getExpiryDateEnd() {
		return expiryDateEnd;
	}
	public void setExpiryDateEnd(String expiryDateEnd) {
		this.expiryDateEnd = expiryDateEnd;
	}
	
	@ApiModelProperty(value = "固定资产科目（编码）")
	private String assetsAccount;
	public String getAssetsAccount() {
		return assetsAccount;
	}
	public void setAssetsAccount(String assetsAccount) {
		this.assetsAccount = assetsAccount;
	}
	
	@ApiModelProperty(value = "预留字段1")
	private String field1Str;
	public String getField1Str() {
		return field1Str;
	}
	public void setField1Str(String field1Str) {
		this.field1Str = field1Str;
	}
	
	@ApiModelProperty(value = "预留字段2")
	private String field2Str;
	public String getField2Str() {
		return field2Str;
	}
	public void setField2Str(String field2Str) {
		this.field2Str = field2Str;
	}
	
	@ApiModelProperty(value = "预留字段3")
	private String field3Str;
	public String getField3Str() {
		return field3Str;
	}
	public void setField3Str(String field3Str) {
		this.field3Str = field3Str;
	}
	
	@ApiModelProperty(value = "预留字段4")
	private String field4Str;
	public String getField4Str() {
		return field4Str;
	}
	public void setField4Str(String field4Str) {
		this.field4Str = field4Str;
	}
	
	@ApiModelProperty(value = "预留字段5")
	private String field5Str;
	public String getField5Str() {
		return field5Str;
	}
	public void setField5Str(String field5Str) {
		this.field5Str = field5Str;
	}
	
	@ApiModelProperty(value = "预留字段6")
	private String field6Str;
	public String getField6Str() {
		return field6Str;
	}
	public void setField6Str(String field6Str) {
		this.field6Str = field6Str;
	}
	
	@ApiModelProperty(value = "预留字段7")
	private String field7Str;
	public String getField7Str() {
		return field7Str;
	}
	public void setField7Str(String field7Str) {
		this.field7Str = field7Str;
	}
	
	@ApiModelProperty(value = "预留字段8")
	private String field8Str;
	public String getField8Str() {
		return field8Str;
	}
	public void setField8Str(String field8Str) {
		this.field8Str = field8Str;
	}
	
	@ApiModelProperty(value = "预留字段9")
	private String field9Str;
	public String getField9Str() {
		return field9Str;
	}
	public void setField9Str(String field9Str) {
		this.field9Str = field9Str;
	}
	
	@ApiModelProperty(value = "预留字段10")
	private String field10Str;
	public String getField10Str() {
		return field10Str;
	}
	public void setField10Str(String field10Str) {
		this.field10Str = field10Str;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段11")
	private Date field11Dat;
	public Date getField11Dat() {
		return field11Dat;
	}
	public void setField11Dat(Date field11Dat) {
		this.field11Dat = field11Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段12")
	private Date field12Dat;
	public Date getField12Dat() {
		return field12Dat;
	}
	public void setField12Dat(Date field12Dat) {
		this.field12Dat = field12Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段13")
	private Date field13Dat;
	public Date getField13Dat() {
		return field13Dat;
	}
	public void setField13Dat(Date field13Dat) {
		this.field13Dat = field13Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段14")
	private Date field14Dat;
	public Date getField14Dat() {
		return field14Dat;
	}
	public void setField14Dat(Date field14Dat) {
		this.field14Dat = field14Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段15")
	private Date field15Dat;
	public Date getField15Dat() {
		return field15Dat;
	}
	public void setField15Dat(Date field15Dat) {
		this.field15Dat = field15Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段16")
	private Date field16Dat;
	public Date getField16Dat() {
		return field16Dat;
	}
	public void setField16Dat(Date field16Dat) {
		this.field16Dat = field16Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段17")
	private Date field17Dat;
	public Date getField17Dat() {
		return field17Dat;
	}
	public void setField17Dat(Date field17Dat) {
		this.field17Dat = field17Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段18")
	private Date field18Dat;
	public Date getField18Dat() {
		return field18Dat;
	}
	public void setField18Dat(Date field18Dat) {
		this.field18Dat = field18Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段19")
	private Date field19Dat;
	public Date getField19Dat() {
		return field19Dat;
	}
	public void setField19Dat(Date field19Dat) {
		this.field19Dat = field19Dat;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "预留字段20")
	private Date field20Dat;
	public Date getField20Dat() {
		return field20Dat;
	}
	public void setField20Dat(Date field20Dat) {
		this.field20Dat = field20Dat;
	}
	
	@ApiModelProperty(value = "预留字段21")
	private String field21Num;
	public String getField21Num() {
		return field21Num;
	}
	public void setField21Num(String field21Num) {
		this.field21Num = field21Num;
	}
	
	@ApiModelProperty(value = "预留字段22")
	private String field22Num;
	public String getField22Num() {
		return field22Num;
	}
	public void setField22Num(String field22Num) {
		this.field22Num = field22Num;
	}
	
	@ApiModelProperty(value = "预留字段23")
	private String field23Num;
	public String getField23Num() {
		return field23Num;
	}
	public void setField23Num(String field23Num) {
		this.field23Num = field23Num;
	}
	
	@ApiModelProperty(value = "预留字段24")
	private String field24Num;
	public String getField24Num() {
		return field24Num;
	}
	public void setField24Num(String field24Num) {
		this.field24Num = field24Num;
	}
	
	@ApiModelProperty(value = "预留字段25")
	private String field25Num;
	public String getField25Num() {
		return field25Num;
	}
	public void setField25Num(String field25Num) {
		this.field25Num = field25Num;
	}
	
	@ApiModelProperty(value = "预留字段26")
	private String field26Num;
	public String getField26Num() {
		return field26Num;
	}
	public void setField26Num(String field26Num) {
		this.field26Num = field26Num;
	}
	
	@ApiModelProperty(value = "预留字段27")
	private String field27Num;
	public String getField27Num() {
		return field27Num;
	}
	public void setField27Num(String field27Num) {
		this.field27Num = field27Num;
	}
	
	@ApiModelProperty(value = "预留字段28")
	private String field28Num;
	public String getField28Num() {
		return field28Num;
	}
	public void setField28Num(String field28Num) {
		this.field28Num = field28Num;
	}
	
	@ApiModelProperty(value = "预留字段29")
	private String field29Num;
	public String getField29Num() {
		return field29Num;
	}
	public void setField29Num(String field29Num) {
		this.field29Num = field29Num;
	}
	
	@ApiModelProperty(value = "预留字段30")
	private String field30Num;
	public String getField30Num() {
		return field30Num;
	}
	public void setField30Num(String field30Num) {
		this.field30Num = field30Num;
	}
	
}
