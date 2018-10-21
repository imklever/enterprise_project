package com.bt.lmis.model;

/**
* @ClassName: OriginDesitinationParamlist
* @Description: TODO(OriginDesitinationParamlist)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class OriginDesitinationParamlist {
	
	
	private String low_price; //最低价格
	private String low_weight;//最低起运量(KG)
	private String low_cubic;//最低起运量(立方米)
	private String province_origin;
	private String city_origin;
	private String state_origin;
	
	public String getLow_weight() {
		return low_weight;
	}
	public void setLow_weight(String low_weight) {
		this.low_weight = low_weight;
	}
	public String getLow_price() {
		return low_price;
	}
	public void setLow_price(String low_price) {
		this.low_price = low_price;
	}
	public String getLow_cubic() {
		return low_cubic;
	}
	public void setLow_cubic(String low_cubic) {
		this.low_cubic = low_cubic;
	}
	public String getProvince_origin() {
		return province_origin;
	}
	public void setProvince_origin(String province_origin) {
		this.province_origin = province_origin;
	}
	public String getCity_origin() {
		return city_origin;
	}
	public void setCity_origin(String city_origin) {
		this.city_origin = city_origin;
	}
	public String getState_origin() {
		return state_origin;
	}
	public void setState_origin(String state_origin) {
		this.state_origin = state_origin;
	}
}