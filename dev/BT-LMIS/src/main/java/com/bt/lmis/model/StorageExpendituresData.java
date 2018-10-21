package com.bt.lmis.model;

import java.math.BigDecimal;

/**
* @ClassName: StorageExpendituresData
* @Description: TODO(StorageExpendituresData)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class StorageExpendituresData {
	
	
	private String end_time;
	
	private BigDecimal acreage_size;
	private BigDecimal volume_size;
	private Integer qty_size;
	
    private String park_code;
    private String park_name;
    private String park_cost_center;
	
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public Integer getId() {
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
	public BigDecimal getAcreage_size() {
		return acreage_size;
	}
	public void setAcreage_size(BigDecimal acreage_size) {
		this.acreage_size = acreage_size;
	}
	public BigDecimal getVolume_size() {
		return volume_size;
	}
	public void setVolume_size(BigDecimal volume_size) {
		this.volume_size = volume_size;
	}
	public Integer getQty_size() {
		return qty_size;
	}
	public void setQty_size(Integer qty_size) {
		this.qty_size = qty_size;
	}
}