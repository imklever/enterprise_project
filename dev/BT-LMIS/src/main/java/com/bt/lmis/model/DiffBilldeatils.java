package com.bt.lmis.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
* @ClassName: DiffBilldeatils
* @Description: TODO(DiffBilldeatils)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class DiffBilldeatils  implements Serializable   {
	
	
	 * 
	 */
	private static final long serialVersionUID = -6253319187032533139L;
	private Integer id;			//
	private java.math.BigDecimal insurance1;			//保价货值（订单金额）
	private java.math.BigDecimal volumn_charged_weight;			//体积计费重量（mm3）
	private String cal_batid;
	private String express_name;
	private String producttype_name;
	
	private String store;			//店铺
	private String account_id;
	private String master_id;
	
	// 计抛基数（报价）
	// 体积重量（计算得）
	// 体积核算重量（计算得）
	// 计费重量（报价）
	// 计费重量（计算得）
	// 首重（报价）
	// 首重价格（报价）
	// 续重（计算得）
	// 续重价格（查询续重报价区间得）
	// 标准运费
	// 单运单折扣（报价，顺丰不需赋值）
	private java.math.BigDecimal discount;
	// 折后运费（计算得）	
	// 保价费
	//
	
	// 0-未结算 1-结算成功 2-结算失败
	private int settleFlag;
	// 结算异常日志
	private String settleErrorReason;
	
	private java.math.BigDecimal total_discount;  //总运费折扣
	
		return master_id;
	}
	public void setMaster_id(String master_id) {
		this.master_id = master_id;
	}
	public Integer getId() {
	public int getSettleFlag() {
		return settleFlag;
	}
	public void setSettleFlag(int settleFlag) {
		this.settleFlag = settleFlag;
	}
	public String getSettleErrorReason() {
		return settleErrorReason;
	}
	public void setSettleErrorReason(String settleErrorReason) {
		this.settleErrorReason = settleErrorReason;
	}
	public BigDecimal getJpNum() {
		return jpNum;
	}
	public void setJpNum(BigDecimal jpNum) {
		this.jpNum = jpNum;
	}
	public BigDecimal getVolumnWeight() {
		return volumnWeight;
	}
	public void setVolumnWeight(BigDecimal volumnWeight) {
		this.volumnWeight = volumnWeight;
	}
	public BigDecimal getVolumnAccountWeight() {
		return volumnAccountWeight;
	}
	public void setVolumnAccountWeight(BigDecimal volumnAccountWeight) {
		this.volumnAccountWeight = volumnAccountWeight;
	}
	public BigDecimal getJfWeight() {
		return jfWeight;
	}
	public void setJfWeight(BigDecimal jfWeight) {
		this.jfWeight = jfWeight;
	}
	public BigDecimal getFirstWeightPrice() {
		return firstWeightPrice;
	}
	public void setFirstWeightPrice(BigDecimal firstWeightPrice) {
		this.firstWeightPrice = firstWeightPrice;
	}
	public BigDecimal getAddedWeightPrice() {
		return addedWeightPrice;
	}
	public void setAddedWeightPrice(BigDecimal addedWeightPrice) {
		this.addedWeightPrice = addedWeightPrice;
	}
	public java.math.BigDecimal getTotal_discount() {
		return total_discount;
	}
	public void setTotal_discount(java.math.BigDecimal total_discount) {
		this.total_discount = total_discount;
	}
	public String getMonth_account() {
		return month_account;
	}
	public void setMonth_account(String month_account) {
		this.month_account = month_account;
	}
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getCal_batid() {
		return cal_batid;
	}
	public void setCal_batid(String cal_batid) {
		this.cal_batid = cal_batid;
	}
	public String getExpress_name() {
		return express_name;
	}
	public void setExpress_name(String express_name) {
		this.express_name = express_name;
	}
	public String getProducttype_name() {
		return producttype_name;
	}
	public void setProducttype_name(String producttype_name) {
		this.producttype_name = producttype_name;
	}
	@Override
	public String toString() {
		return "DiffBilldeatils [id=" + id + ", create_time=" + create_time + ", create_user=" + create_user
				+ ", update_time=" + update_time + ", update_user=" + update_user + ", billingCycle=" + billingCycle
				+ ", month_account=" + month_account + ", transport_time=" + transport_time + ", waybill=" + waybill
				+ ", transport_weight=" + transport_weight + ", transport_volumn=" + transport_volumn
				+ ", origin_province=" + origin_province + ", origin_city=" + origin_city + ", origin_state="
				+ origin_state + ", dest_province=" + dest_province + ", dest_city=" + dest_city + ", dest_state="
				+ dest_state + ", charged_weight=" + charged_weight + ", express_code=" + express_code
				+ ", producttype_code=" + producttype_code + ", insurance=" + insurance + ", freight=" + freight
				+ ", insurance_fee=" + insurance_fee + ", other_value_added_service_charges="
				+ other_value_added_service_charges + ", total_charge=" + total_charge + ", insurance1=" + insurance1
				+ ", volumn_charged_weight=" + volumn_charged_weight + ", transport_warehouse=" + transport_warehouse
				+ ", store=" + store + ", cost_center=" + cost_center + ", epistatic_order=" + epistatic_order
				+ ", platform_no=" + platform_no + ", sku_number=" + sku_number + ", length=" + length + ", width="
				+ width + ", height=" + height + ", volumn=" + volumn + ", transport_time1=" + transport_time1
				+ ", origin_province1=" + origin_province1 + ", origin_city1=" + origin_city1 + ", dest_province1="
				+ dest_province1 + ", dest_city1=" + dest_city1 + ", transport_weight1=" + transport_weight1
				+ ", express_code1=" + express_code1 + ", producttype_code1=" + producttype_code1 + ", account_id="
				+ account_id + ", master_id=" + master_id + ", jpNum=" + jpNum + ", volumnWeight=" + volumnWeight
				+ ", volumnAccountWeight=" + volumnAccountWeight + ", jfWeight=" + jfWeight + ", charged_weight1="
				+ charged_weight1 + ", firstWeight=" + firstWeight + ", firstWeightPrice=" + firstWeightPrice
				+ ", addedWeight=" + addedWeight + ", addedWeightPrice=" + addedWeightPrice + ", standard_freight="
				+ standard_freight + ", discount=" + discount + ", afterdiscount_freight=" + afterdiscount_freight
				+ ", insurance_fee1=" + insurance_fee1 + ", additional_fee=" + additional_fee + ", last_fee=" + last_fee
				+ ", settleFlag=" + settleFlag + ", settleErrorReason=" + settleErrorReason + ", is_verification="
				+ is_verification + ", reason=" + reason + ", remarks=" + remarks + ", total_discount=" + total_discount
				+ "]";
	}
	
}