package com.bt.lmis.controller.form;
import com.bt.lmis.page.QueryParameter;

public class TotalVolumeQueryParam extends QueryParameter {
	
		private Integer ctv_id;			//	private Integer ctv_cb_id;			//合同ID	private String ctv_section;			//区间ID	private String ctv_price;			//体积单价	private Integer ctv_price_unit;			//体积单价单位	private Integer ctv_status;			//状态0停用1启用	public Integer getCtv_id() {	    return this.ctv_id;	}	public void setCtv_id(Integer ctv_id) {	    this.ctv_id=ctv_id;	}	public Integer getCtv_cb_id() {	    return this.ctv_cb_id;	}	public void setCtv_cb_id(Integer ctv_cb_id) {	    this.ctv_cb_id=ctv_cb_id;	}	public String getCtv_section() {	    return this.ctv_section;	}	public void setCtv_section(String ctv_section) {	    this.ctv_section=ctv_section;	}	public String getCtv_price() {	    return this.ctv_price;	}	public void setCtv_price(String ctv_price) {	    this.ctv_price=ctv_price;	}	public Integer getCtv_price_unit() {	    return this.ctv_price_unit;	}	public void setCtv_price_unit(Integer ctv_price_unit) {	    this.ctv_price_unit=ctv_price_unit;	}	public Integer getCtv_status() {	    return this.ctv_status;	}	public void setCtv_status(Integer ctv_status) {	    this.ctv_status=ctv_status;	}
	
}
