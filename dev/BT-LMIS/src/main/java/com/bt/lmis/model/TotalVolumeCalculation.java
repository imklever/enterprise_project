package com.bt.lmis.model;

/**
* @ClassName: TotalVolumeCalculation
* @Description: TODO(TotalVolumeCalculation)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class TotalVolumeCalculation {
	
		private Integer stvc_id;			//	private String stvc_cb_id;			//合同ID	private String stvc_section;			//区间	private String stvc_price;			//单价	private Integer stvc_price_unit;			//单价单位	private Integer stvc_status;			//类型0停用1启用	public Integer getStvc_id() {	    return this.stvc_id;	}	public void setStvc_id(Integer stvc_id) {	    this.stvc_id=stvc_id;	}	public String getStvc_section() {	    return this.stvc_section;	}	public void setStvc_section(String stvc_section) {	    this.stvc_section=stvc_section;	}	public String getStvc_price() {	    return this.stvc_price;	}	public void setStvc_price(String stvc_price) {	    this.stvc_price=stvc_price;	}	public Integer getStvc_price_unit() {	    return this.stvc_price_unit;	}	public void setStvc_price_unit(Integer stvc_price_unit) {	    this.stvc_price_unit=stvc_price_unit;	}	public Integer getStvc_status() {	    return this.stvc_status;	}	public void setStvc_status(Integer stvc_status) {	    this.stvc_status=stvc_status;	}
	public String getStvc_cb_id() {
		return stvc_cb_id;
	}
	public void setStvc_cb_id(String stvc_cb_id) {
		this.stvc_cb_id = stvc_cb_id;
	}
	
}
