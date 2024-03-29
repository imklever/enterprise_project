package com.bt.lmis.balance.model;

/**
* @ClassName: AddservicefeeBilldataEstimate
* @Description: TODO(AddservicefeeBilldataEstimate)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class AddservicefeeBilldataEstimate {
	
		private Integer id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String batch_number;			//预估批次号	private String contract_id;			//合同id	private String addservice_name;			//订单操作类型(0:B2C订单处理费，1：B2B订单处理费，2：SN出库费，3：退换货入库费；4：收货上架费)	private Integer qty;			//数量	private String qty_unit;			//数量单位id	private java.math.BigDecimal amount;			//合计价格	private String amountunit_id;			//费用单位id	public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getBatch_number() {	    return this.batch_number;	}	public void setBatch_number(String batch_number) {	    this.batch_number=batch_number;	}	public String getContract_id() {	    return this.contract_id;	}	public void setContract_id(String contract_id) {	    this.contract_id=contract_id;	}	public String getAddservice_name() {	    return this.addservice_name;	}	public void setAddservice_name(String addservice_name) {	    this.addservice_name=addservice_name;	}	public Integer getQty() {	    return this.qty;	}	public void setQty(Integer qty) {	    this.qty=qty;	}	public String getQty_unit() {	    return this.qty_unit;	}	public void setQty_unit(String qty_unit) {	    this.qty_unit=qty_unit;	}	public java.math.BigDecimal getAmount() {	    return this.amount;	}	public void setAmount(java.math.BigDecimal amount) {	    this.amount=amount;	}	public String getAmountunit_id() {	    return this.amountunit_id;	}	public void setAmountunit_id(String amountunit_id) {	    this.amountunit_id=amountunit_id;	}
}
