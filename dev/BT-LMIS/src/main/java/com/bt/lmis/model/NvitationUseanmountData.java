package com.bt.lmis.model;

/**
* @ClassName: NvitationUseanmountData
* @Description: TODO(NvitationUseanmountData)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class NvitationUseanmountData {
	
	
	private String sku_name;
	private String starttime;
	private String endtime;
	
	private String park_code;
	private String park_name;
	private String park_cost_center;
	
	private Integer firstResult;
	private Integer maxResult;
	
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
	public String getSku_name() {
		return sku_name;
	}
	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}
	public Integer getId() {
	public Integer getFirstResult() {
		return firstResult;
	}
	public void setFirstResult(Integer firstResult) {
		this.firstResult = firstResult;
	}
	public Integer getMaxResult() {
		return maxResult;
	}
	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
	}
	public String getPark_code() {
		return park_code;
	}
	public void setPark_code(String park_code) {
		this.park_code = park_code;
	}
	public String getPark_name() {
		return park_name;
	}
	public void setPark_name(String park_name) {
		this.park_name = park_name;
	}
	public String getPark_cost_center() {
		return park_cost_center;
	}
	public void setPark_cost_center(String park_cost_center) {
		this.park_cost_center = park_cost_center;
	}
}