package com.bt.lmis.model;

/**
* @ClassName: InternalPrice
* @Description: TODO(InternalPrice)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class InternalPrice {
	
		private Integer id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String internal;			//续重区间	private String internal_unit;			//续重单位	private java.math.BigDecimal price;			//单价	private String price_unit;			//单价单位	private Integer table_id;			//表格id	public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getInternal() {	    return this.internal;	}	public void setInternal(String internal) {	    this.internal=internal;	}	public String getInternal_unit() {	    return this.internal_unit;	}	public void setInternal_unit(String internal_unit) {	    this.internal_unit=internal_unit;	}	public java.math.BigDecimal getPrice() {	    return this.price;	}	public void setPrice(java.math.BigDecimal price) {	    this.price=price;	}	public String getPrice_unit() {	    return this.price_unit;	}	public void setPrice_unit(String price_unit) {	    this.price_unit=price_unit;	}	public Integer getTable_id() {	    return this.table_id;	}	public void setTable_id(Integer table_id) {	    this.table_id=table_id;	}
}
