package com.bt.lmis.balance.model;

/**
* @ClassName: AddservicefeeDataSettlement
* @Description: TODO(AddservicefeeDataSettlement)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class AddservicefeeEstimateSettlement {
	
		private String id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String cost_code;			//成本中心代码	private String cost_name;			//成本中心名称	private String system_warehousename;			//系统仓名称	private Integer numer;			//序号	private java.util.Date date;			//日期	private String area_code;			//	private String area;			//区域	private String warehouse_id;			//仓库id	private String physical_warehouse;			//物理仓	private String department;			//部门	private Integer store_id;			//店铺id	private String store_name;			//店铺名称	private String addservice_code;			//增值服务代码	private String addservice_name;			//增值服务名称	private String service_instruction;			//服务说明	private String wmsaddservice_order;			//WMS增值指令	private String unit;			//	private java.math.BigDecimal qty;			//数量	private java.math.BigDecimal price;			//单价	private String store_applicant;			//店铺申请人	private String warehouse_confirmer;			//仓库确认人	private String remark;			//备注	private java.math.BigDecimal amount;			//金额	private java.math.BigDecimal notax_amount;			//不含税金额	private Integer data_id;			//原数据ID
	private String starttime;
	private String endtime;
	private String batch_number;
	private int contract_id;
	
		public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public String getBatch_number() {
		return batch_number;
	}
	public void setBatch_number(String batch_number) {
		this.batch_number = batch_number;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getCost_code() {	    return this.cost_code;	}	public void setCost_code(String cost_code) {	    this.cost_code=cost_code;	}	public String getCost_name() {	    return this.cost_name;	}	public void setCost_name(String cost_name) {	    this.cost_name=cost_name;	}	public String getSystem_warehousename() {	    return this.system_warehousename;	}	public void setSystem_warehousename(String system_warehousename) {	    this.system_warehousename=system_warehousename;	}	public Integer getNumer() {	    return this.numer;	}	public void setNumer(Integer numer) {	    this.numer=numer;	}	public java.util.Date getDate() {	    return this.date;	}	public void setDate(java.util.Date date) {	    this.date=date;	}	public String getArea_code() {	    return this.area_code;	}	public void setArea_code(String area_code) {	    this.area_code=area_code;	}	public String getArea() {	    return this.area;	}	public void setArea(String area) {	    this.area=area;	}	public String getWarehouse_id() {	    return this.warehouse_id;	}	public void setWarehouse_id(String warehouse_id) {	    this.warehouse_id=warehouse_id;	}	public String getPhysical_warehouse() {	    return this.physical_warehouse;	}	public void setPhysical_warehouse(String physical_warehouse) {	    this.physical_warehouse=physical_warehouse;	}	public String getDepartment() {	    return this.department;	}	public void setDepartment(String department) {	    this.department=department;	}	public Integer getStore_id() {	    return this.store_id;	}	public void setStore_id(Integer store_id) {	    this.store_id=store_id;	}	public String getStore_name() {	    return this.store_name;	}	public void setStore_name(String store_name) {	    this.store_name=store_name;	}	public String getAddservice_code() {	    return this.addservice_code;	}	public void setAddservice_code(String addservice_code) {	    this.addservice_code=addservice_code;	}	public String getAddservice_name() {	    return this.addservice_name;	}	public void setAddservice_name(String addservice_name) {	    this.addservice_name=addservice_name;	}	public String getService_instruction() {	    return this.service_instruction;	}	public void setService_instruction(String service_instruction) {	    this.service_instruction=service_instruction;	}	public String getWmsaddservice_order() {	    return this.wmsaddservice_order;	}	public void setWmsaddservice_order(String wmsaddservice_order) {	    this.wmsaddservice_order=wmsaddservice_order;	}	public String getUnit() {	    return this.unit;	}	public void setUnit(String unit) {	    this.unit=unit;	}	public java.math.BigDecimal getQty() {	    return this.qty;	}	public void setQty(java.math.BigDecimal qty) {	    this.qty=qty;	}	public java.math.BigDecimal getPrice() {	    return this.price;	}	public void setPrice(java.math.BigDecimal price) {	    this.price=price;	}	public String getStore_applicant() {	    return this.store_applicant;	}	public void setStore_applicant(String store_applicant) {	    this.store_applicant=store_applicant;	}	public String getWarehouse_confirmer() {	    return this.warehouse_confirmer;	}	public void setWarehouse_confirmer(String warehouse_confirmer) {	    this.warehouse_confirmer=warehouse_confirmer;	}	public String getRemark() {	    return this.remark;	}	public void setRemark(String remark) {	    this.remark=remark;	}	public java.math.BigDecimal getAmount() {	    return this.amount;	}	public void setAmount(java.math.BigDecimal amount) {	    this.amount=amount;	}	public java.math.BigDecimal getNotax_amount() {	    return this.notax_amount;	}	public void setNotax_amount(java.math.BigDecimal notax_amount) {	    this.notax_amount=notax_amount;	}	public Integer getData_id() {	    return this.data_id;	}	public void setData_id(Integer data_id) {	    this.data_id=data_id;	}
}
