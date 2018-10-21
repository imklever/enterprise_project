package com.bt.lmis.model;

/**
* @ClassName: ExpressSf
* @Description: TODO(ExpressSf)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class ExpressSf {
	
		private String id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String cost_center;			//成本中心编码	private String store_code;			//店铺代码	private String store_name;			//店铺名称	private String warehouse;			//	private String transport_code;			//运输公司代码	private String transport_name;			//快递名称	private String delivery_order;			//发货指令	private String epistatic_order;			//上位系统订单号	private String order_type;			//订单类型	private String express_number;			//运单号	private String transport_direction;			//运输方向(0:正向；1：逆向)	private String itemtype_code;			//产品类型代码	private String itemtype_name;			//	private java.util.Date transport_time;			//运输时间	private java.math.BigDecimal collection_on_delivery;			//代收货款金额	private java.math.BigDecimal order_amount;			//订单金额	private String sku_number;			//耗材SKU编码	private java.math.BigDecimal weight;			//实际重量	private java.math.BigDecimal length;			//长	private java.math.BigDecimal width;			//宽	private java.math.BigDecimal higth;			//高	private java.math.BigDecimal volumn;			//体积	private String delivery_address;			//始发地	private String province;			//省份	private String city;			//城市	private String state;			//区县	private String street;			//街道	private String insurance_flag;			//	private String cod_flag;			//是否COD（0：是；1：否）	private String balance_subject;			//	private java.math.BigDecimal jp_num;			//计抛基数	private java.math.BigDecimal volumn_weight;			//体积重量	private java.math.BigDecimal jf_weight;			//计费重量（报价）	private java.math.BigDecimal charged_weight;			//计费重量	private java.math.BigDecimal first_weight;			//首重价格	private java.math.BigDecimal first_weight_price;			//首重	private java.math.BigDecimal added_weight;			//续重价格	private java.math.BigDecimal added_weight_price;			//续重	private java.math.BigDecimal standard_freight;			//标准运费	private java.math.BigDecimal discount;			//折扣率	private java.math.BigDecimal afterdiscount_freight;			//折后运费	private java.math.BigDecimal insurance_fee;			//保价费	private java.math.BigDecimal cod;			//	private java.math.BigDecimal delegated_pickup;			//	private java.math.BigDecimal extend_prop1;			//扩展字段1	private java.math.BigDecimal extend_prop2;			//扩展字段2	private java.math.BigDecimal total_fee;			//总费用	private String remark;			//	private Integer data_id;			//原数据ID	private Integer contract_id;			//结算对象	private Integer dFlag;			//删除标记 0 正常1 已删除	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getCost_center() {	    return this.cost_center;	}	public void setCost_center(String cost_center) {	    this.cost_center=cost_center;	}	public String getStore_code() {	    return this.store_code;	}	public void setStore_code(String store_code) {	    this.store_code=store_code;	}	public String getStore_name() {	    return this.store_name;	}	public void setStore_name(String store_name) {	    this.store_name=store_name;	}	public String getWarehouse() {	    return this.warehouse;	}	public void setWarehouse(String warehouse) {	    this.warehouse=warehouse;	}	public String getTransport_code() {	    return this.transport_code;	}	public void setTransport_code(String transport_code) {	    this.transport_code=transport_code;	}	public String getTransport_name() {	    return this.transport_name;	}	public void setTransport_name(String transport_name) {	    this.transport_name=transport_name;	}	public String getDelivery_order() {	    return this.delivery_order;	}	public void setDelivery_order(String delivery_order) {	    this.delivery_order=delivery_order;	}	public String getEpistatic_order() {	    return this.epistatic_order;	}	public void setEpistatic_order(String epistatic_order) {	    this.epistatic_order=epistatic_order;	}	public String getOrder_type() {	    return this.order_type;	}	public void setOrder_type(String order_type) {	    this.order_type=order_type;	}	public String getExpress_number() {	    return this.express_number;	}	public void setExpress_number(String express_number) {	    this.express_number=express_number;	}	public String getTransport_direction() {	    return this.transport_direction;	}	public void setTransport_direction(String transport_direction) {	    this.transport_direction=transport_direction;	}	public String getItemtype_code() {	    return this.itemtype_code;	}	public void setItemtype_code(String itemtype_code) {	    this.itemtype_code=itemtype_code;	}	public String getItemtype_name() {	    return this.itemtype_name;	}	public void setItemtype_name(String itemtype_name) {	    this.itemtype_name=itemtype_name;	}	public java.util.Date getTransport_time() {	    return this.transport_time;	}	public void setTransport_time(java.util.Date transport_time) {	    this.transport_time=transport_time;	}	public java.math.BigDecimal getCollection_on_delivery() {	    return this.collection_on_delivery;	}	public void setCollection_on_delivery(java.math.BigDecimal collection_on_delivery) {	    this.collection_on_delivery=collection_on_delivery;	}	public java.math.BigDecimal getOrder_amount() {	    return this.order_amount;	}	public void setOrder_amount(java.math.BigDecimal order_amount) {	    this.order_amount=order_amount;	}	public String getSku_number() {	    return this.sku_number;	}	public void setSku_number(String sku_number) {	    this.sku_number=sku_number;	}	public java.math.BigDecimal getWeight() {	    return this.weight;	}	public void setWeight(java.math.BigDecimal weight) {	    this.weight=weight;	}	public java.math.BigDecimal getLength() {	    return this.length;	}	public void setLength(java.math.BigDecimal length) {	    this.length=length;	}	public java.math.BigDecimal getWidth() {	    return this.width;	}	public void setWidth(java.math.BigDecimal width) {	    this.width=width;	}	public java.math.BigDecimal getHigth() {	    return this.higth;	}	public void setHigth(java.math.BigDecimal higth) {	    this.higth=higth;	}	public java.math.BigDecimal getVolumn() {	    return this.volumn;	}	public void setVolumn(java.math.BigDecimal volumn) {	    this.volumn=volumn;	}	public String getDelivery_address() {	    return this.delivery_address;	}	public void setDelivery_address(String delivery_address) {	    this.delivery_address=delivery_address;	}	public String getProvince() {	    return this.province;	}	public void setProvince(String province) {	    this.province=province;	}	public String getCity() {	    return this.city;	}	public void setCity(String city) {	    this.city=city;	}	public String getState() {	    return this.state;	}	public void setState(String state) {	    this.state=state;	}	public String getStreet() {	    return this.street;	}	public void setStreet(String street) {	    this.street=street;	}	public String getInsurance_flag() {	    return this.insurance_flag;	}	public void setInsurance_flag(String insurance_flag) {	    this.insurance_flag=insurance_flag;	}	public String getCod_flag() {	    return this.cod_flag;	}	public void setCod_flag(String cod_flag) {	    this.cod_flag=cod_flag;	}	public String getBalance_subject() {	    return this.balance_subject;	}	public void setBalance_subject(String balance_subject) {	    this.balance_subject=balance_subject;	}	public java.math.BigDecimal getJp_num() {	    return this.jp_num;	}	public void setJp_num(java.math.BigDecimal jp_num) {	    this.jp_num=jp_num;	}	public java.math.BigDecimal getVolumn_weight() {	    return this.volumn_weight;	}	public void setVolumn_weight(java.math.BigDecimal volumn_weight) {	    this.volumn_weight=volumn_weight;	}	public java.math.BigDecimal getJf_weight() {	    return this.jf_weight;	}	public void setJf_weight(java.math.BigDecimal jf_weight) {	    this.jf_weight=jf_weight;	}	public java.math.BigDecimal getCharged_weight() {	    return this.charged_weight;	}	public void setCharged_weight(java.math.BigDecimal charged_weight) {	    this.charged_weight=charged_weight;	}	public java.math.BigDecimal getFirst_weight() {	    return this.first_weight;	}	public void setFirst_weight(java.math.BigDecimal first_weight) {	    this.first_weight=first_weight;	}	public java.math.BigDecimal getFirst_weight_price() {	    return this.first_weight_price;	}	public void setFirst_weight_price(java.math.BigDecimal first_weight_price) {	    this.first_weight_price=first_weight_price;	}	public java.math.BigDecimal getAdded_weight() {	    return this.added_weight;	}	public void setAdded_weight(java.math.BigDecimal added_weight) {	    this.added_weight=added_weight;	}	public java.math.BigDecimal getAdded_weight_price() {	    return this.added_weight_price;	}	public void setAdded_weight_price(java.math.BigDecimal added_weight_price) {	    this.added_weight_price=added_weight_price;	}	public java.math.BigDecimal getStandard_freight() {	    return this.standard_freight;	}	public void setStandard_freight(java.math.BigDecimal standard_freight) {	    this.standard_freight=standard_freight;	}	public java.math.BigDecimal getDiscount() {	    return this.discount;	}	public void setDiscount(java.math.BigDecimal discount) {	    this.discount=discount;	}	public java.math.BigDecimal getAfterdiscount_freight() {	    return this.afterdiscount_freight;	}	public void setAfterdiscount_freight(java.math.BigDecimal afterdiscount_freight) {	    this.afterdiscount_freight=afterdiscount_freight;	}	public java.math.BigDecimal getInsurance_fee() {	    return this.insurance_fee;	}	public void setInsurance_fee(java.math.BigDecimal insurance_fee) {	    this.insurance_fee=insurance_fee;	}	public java.math.BigDecimal getCod() {	    return this.cod;	}	public void setCod(java.math.BigDecimal cod) {	    this.cod=cod;	}	public java.math.BigDecimal getDelegated_pickup() {	    return this.delegated_pickup;	}	public void setDelegated_pickup(java.math.BigDecimal delegated_pickup) {	    this.delegated_pickup=delegated_pickup;	}	public java.math.BigDecimal getExtend_prop1() {	    return this.extend_prop1;	}	public void setExtend_prop1(java.math.BigDecimal extend_prop1) {	    this.extend_prop1=extend_prop1;	}	public java.math.BigDecimal getExtend_prop2() {	    return this.extend_prop2;	}	public void setExtend_prop2(java.math.BigDecimal extend_prop2) {	    this.extend_prop2=extend_prop2;	}	public java.math.BigDecimal getTotal_fee() {	    return this.total_fee;	}	public void setTotal_fee(java.math.BigDecimal total_fee) {	    this.total_fee=total_fee;	}	public String getRemark() {	    return this.remark;	}	public void setRemark(String remark) {	    this.remark=remark;	}	public Integer getData_id() {	    return this.data_id;	}	public void setData_id(Integer data_id) {	    this.data_id=data_id;	}	public Integer getContract_id() {	    return this.contract_id;	}	public void setContract_id(Integer contract_id) {	    this.contract_id=contract_id;	}	public Integer getDFlag() {	    return this.dFlag;	}	public void setDFlag(Integer dFlag) {	    this.dFlag=dFlag;	}
}
