package com.bt.lmis.controller.form;
import com.bt.lmis.page.QueryParameter;

public class NvitationRealuseanmountDataQueryParam extends QueryParameter {
	
		private Integer id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String store_code;			//店铺代码	private String store_name;			//店铺名称	private String cost_center;			//成本中心	private String use_time;			//账单周期	private String sku_code;			//耗材编码	private String sku_name;			//耗材名称	private java.math.BigDecimal use_amount;			//使用量	private String use_amountunit;			//使用量单位	private Integer settle_flag;			//结算标识(0:未结算；1：已结算)	public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getStore_code() {	    return this.store_code;	}	public void setStore_code(String store_code) {	    this.store_code=store_code;	}	public String getStore_name() {	    return this.store_name;	}	public void setStore_name(String store_name) {	    this.store_name=store_name;	}	public String getCost_center() {	    return this.cost_center;	}	public void setCost_center(String cost_center) {	    this.cost_center=cost_center;	}	public String getUse_time() {	    return this.use_time;	}	public void setUse_time(String use_time) {	    this.use_time=use_time;	}	public String getSku_code() {	    return this.sku_code;	}	public void setSku_code(String sku_code) {	    this.sku_code=sku_code;	}	public String getSku_name() {	    return this.sku_name;	}	public void setSku_name(String sku_name) {	    this.sku_name=sku_name;	}	public java.math.BigDecimal getUse_amount() {	    return this.use_amount;	}	public void setUse_amount(java.math.BigDecimal use_amount) {	    this.use_amount=use_amount;	}	public String getUse_amountunit() {	    return this.use_amountunit;	}	public void setUse_amountunit(String use_amountunit) {	    this.use_amountunit=use_amountunit;	}	public Integer getSettle_flag() {	    return this.settle_flag;	}	public void setSettle_flag(Integer settle_flag) {	    this.settle_flag=settle_flag;	}
	
}
