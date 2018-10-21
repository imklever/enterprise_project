package com.bt.lmis.controller.form;
import com.bt.lmis.page.QueryParameter;

public class StorageChargeQueryParam extends QueryParameter {
	
		private Integer ssc_id;			//	private java.util.Date ssc_starttime;			//存储开始时间	private java.util.Date ssc_endtime;			//存储结束时间	private Integer ssc_whs_id;			//仓库ID	private Integer ssc_area_id;			//区域ID	private Integer ssc_item_type;			//商品类型	private Integer ssc_sc_type;			//0固定费用 1按面积结算 2按体积结算 3按商品的体积推算 4按件数结算 5按件数反推所占面积 6按托盘结算 7按单个托盘的存放数量推算	private String ssc_fixedcost;			//固定费用	private Integer ssc_occupied_area_type;			//商品实际占用面积类型 1无阶梯2超过部分面积阶梯3总占用面积阶梯	private String ssc_area_price;			//面积单价	private Integer ssc_area_price_unit;			//面积	private Integer ssc_total_area_tableid;			//总占用面积阶梯	private Integer ssc_over_part_area_tableid;			//超过部分占用面积表ID	private Integer ssc_volume_type;			//占用体积类型	private Integer ssc_total_volume_tableid;			//总占用体积阶梯表ID	private Integer ssc_over_part_volume_tableid;			//超过部分占用体积表ID	private Integer ssc_volume_calculation_type;			//体积推算	private Integer ssc_total_volume_calculation_tableid;			//超过部分体积反推结算表ID	private Integer ssc_over_part_volume_calculation_tableid;			//总占用体积反推结算表ID	private String ssc_number_price;			//件数单价	private Integer ssc_number_price_unit;			//件数单位	private String ssc_square_hold_the_number;			//单平方所容纳件数	private Integer ssc_square_hold_the_number_unit;			//单平方所容纳件数单位	private String ssc_square_price;			//平方单价	private Integer ssc_square_price_unit;			//平方单价单位	private Integer ssc_tray_balance_type;			//按托盘结算类型	private String ssc_tray_price;			//托盘单价	private Integer ssc_tray_price_unit;			//托盘单价单位	private Integer ssc_over_part_tray_tableid;			//总占用托盘数表格ID	private Integer ssc_total_tray_tableid;			//超过部分托盘数阶梯表格ID	private Integer ssc_single_tray_balance_type;			//按单个托盘结算类型	private String ssc_single_tray_number;			//单个托盘可放商品数量	private String ssc_single_tray_number_unit;			//单个托盘可放商品数单位	private Integer ssc_over_part_single_tray_tableid;			//超过部分托盘数表ID
	private Integer ssc_total_single_tray_tableid;			//总占用托盘数表ID	private Integer ssc_cb_id;			//	public Integer getSsc_id() {	    return this.ssc_id;	}	public void setSsc_id(Integer ssc_id) {	    this.ssc_id=ssc_id;	}	public java.util.Date getSsc_starttime() {	    return this.ssc_starttime;	}	public void setSsc_starttime(java.util.Date ssc_starttime) {	    this.ssc_starttime=ssc_starttime;	}	public java.util.Date getSsc_endtime() {	    return this.ssc_endtime;	}	public void setSsc_endtime(java.util.Date ssc_endtime) {	    this.ssc_endtime=ssc_endtime;	}	public Integer getSsc_whs_id() {	    return this.ssc_whs_id;	}	public void setSsc_whs_id(Integer ssc_whs_id) {	    this.ssc_whs_id=ssc_whs_id;	}	public Integer getSsc_area_id() {	    return this.ssc_area_id;	}	public void setSsc_area_id(Integer ssc_area_id) {	    this.ssc_area_id=ssc_area_id;	}	public Integer getSsc_item_type() {	    return this.ssc_item_type;	}	public void setSsc_item_type(Integer ssc_item_type) {	    this.ssc_item_type=ssc_item_type;	}	public Integer getSsc_sc_type() {	    return this.ssc_sc_type;	}	public void setSsc_sc_type(Integer ssc_sc_type) {	    this.ssc_sc_type=ssc_sc_type;	}	public String getSsc_fixedcost() {	    return this.ssc_fixedcost;	}	public void setSsc_fixedcost(String ssc_fixedcost) {	    this.ssc_fixedcost=ssc_fixedcost;	}	public Integer getSsc_occupied_area_type() {	    return this.ssc_occupied_area_type;	}	public void setSsc_occupied_area_type(Integer ssc_occupied_area_type) {	    this.ssc_occupied_area_type=ssc_occupied_area_type;	}	public String getSsc_area_price() {	    return this.ssc_area_price;	}	public void setSsc_area_price(String ssc_area_price) {	    this.ssc_area_price=ssc_area_price;	}	public Integer getSsc_area_price_unit() {	    return this.ssc_area_price_unit;	}	public void setSsc_area_price_unit(Integer ssc_area_price_unit) {	    this.ssc_area_price_unit=ssc_area_price_unit;	}	public Integer getSsc_total_area_tableid() {	    return this.ssc_total_area_tableid;	}	public void setSsc_total_area_tableid(Integer ssc_total_area_tableid) {	    this.ssc_total_area_tableid=ssc_total_area_tableid;	}	public Integer getSsc_over_part_area_tableid() {	    return this.ssc_over_part_area_tableid;	}	public void setSsc_over_part_area_tableid(Integer ssc_over_part_area_tableid) {	    this.ssc_over_part_area_tableid=ssc_over_part_area_tableid;	}	public Integer getSsc_volume_type() {	    return this.ssc_volume_type;	}	public void setSsc_volume_type(Integer ssc_volume_type) {	    this.ssc_volume_type=ssc_volume_type;	}	public Integer getSsc_total_volume_tableid() {	    return this.ssc_total_volume_tableid;	}	public void setSsc_total_volume_tableid(Integer ssc_total_volume_tableid) {	    this.ssc_total_volume_tableid=ssc_total_volume_tableid;	}	public Integer getSsc_over_part_volume_tableid() {	    return this.ssc_over_part_volume_tableid;	}	public void setSsc_over_part_volume_tableid(Integer ssc_over_part_volume_tableid) {	    this.ssc_over_part_volume_tableid=ssc_over_part_volume_tableid;	}	public Integer getSsc_volume_calculation_type() {	    return this.ssc_volume_calculation_type;	}	public void setSsc_volume_calculation_type(Integer ssc_volume_calculation_type) {	    this.ssc_volume_calculation_type=ssc_volume_calculation_type;	}	public Integer getSsc_total_volume_calculation_tableid() {	    return this.ssc_total_volume_calculation_tableid;	}	public void setSsc_total_volume_calculation_tableid(Integer ssc_total_volume_calculation_tableid) {	    this.ssc_total_volume_calculation_tableid=ssc_total_volume_calculation_tableid;	}	public Integer getSsc_over_part_volume_calculation_tableid() {	    return this.ssc_over_part_volume_calculation_tableid;	}	public void setSsc_over_part_volume_calculation_tableid(Integer ssc_over_part_volume_calculation_tableid) {	    this.ssc_over_part_volume_calculation_tableid=ssc_over_part_volume_calculation_tableid;	}	public String getSsc_number_price() {	    return this.ssc_number_price;	}	public void setSsc_number_price(String ssc_number_price) {	    this.ssc_number_price=ssc_number_price;	}	public Integer getSsc_number_price_unit() {	    return this.ssc_number_price_unit;	}	public void setSsc_number_price_unit(Integer ssc_number_price_unit) {	    this.ssc_number_price_unit=ssc_number_price_unit;	}	public String getSsc_square_hold_the_number() {	    return this.ssc_square_hold_the_number;	}	public void setSsc_square_hold_the_number(String ssc_square_hold_the_number) {	    this.ssc_square_hold_the_number=ssc_square_hold_the_number;	}	public Integer getSsc_square_hold_the_number_unit() {	    return this.ssc_square_hold_the_number_unit;	}	public void setSsc_square_hold_the_number_unit(Integer ssc_square_hold_the_number_unit) {	    this.ssc_square_hold_the_number_unit=ssc_square_hold_the_number_unit;	}	public String getSsc_square_price() {	    return this.ssc_square_price;	}	public void setSsc_square_price(String ssc_square_price) {	    this.ssc_square_price=ssc_square_price;	}	public Integer getSsc_square_price_unit() {	    return this.ssc_square_price_unit;	}	public void setSsc_square_price_unit(Integer ssc_square_price_unit) {	    this.ssc_square_price_unit=ssc_square_price_unit;	}	public Integer getSsc_tray_balance_type() {	    return this.ssc_tray_balance_type;	}	public void setSsc_tray_balance_type(Integer ssc_tray_balance_type) {	    this.ssc_tray_balance_type=ssc_tray_balance_type;	}	public String getSsc_tray_price() {	    return this.ssc_tray_price;	}	public void setSsc_tray_price(String ssc_tray_price) {	    this.ssc_tray_price=ssc_tray_price;	}	public Integer getSsc_tray_price_unit() {	    return this.ssc_tray_price_unit;	}	public void setSsc_tray_price_unit(Integer ssc_tray_price_unit) {	    this.ssc_tray_price_unit=ssc_tray_price_unit;	}	public Integer getSsc_over_part_tray_tableid() {	    return this.ssc_over_part_tray_tableid;	}	public void setSsc_over_part_tray_tableid(Integer ssc_over_part_tray_tableid) {	    this.ssc_over_part_tray_tableid=ssc_over_part_tray_tableid;	}	public Integer getSsc_total_tray_tableid() {	    return this.ssc_total_tray_tableid;	}	public void setSsc_total_tray_tableid(Integer ssc_total_tray_tableid) {	    this.ssc_total_tray_tableid=ssc_total_tray_tableid;	}	public Integer getSsc_single_tray_balance_type() {	    return this.ssc_single_tray_balance_type;	}	public void setSsc_single_tray_balance_type(Integer ssc_single_tray_balance_type) {	    this.ssc_single_tray_balance_type=ssc_single_tray_balance_type;	}	public String getSsc_single_tray_number() {	    return this.ssc_single_tray_number;	}	public void setSsc_single_tray_number(String ssc_single_tray_number) {	    this.ssc_single_tray_number=ssc_single_tray_number;	}	public String getSsc_single_tray_number_unit() {	    return this.ssc_single_tray_number_unit;	}	public void setSsc_single_tray_number_unit(String ssc_single_tray_number_unit) {	    this.ssc_single_tray_number_unit=ssc_single_tray_number_unit;	}	public Integer getSsc_over_part_single_tray_tableid() {	    return this.ssc_over_part_single_tray_tableid;	}	public void setSsc_over_part_single_tray_tableid(Integer ssc_over_part_single_tray_tableid) {	    this.ssc_over_part_single_tray_tableid=ssc_over_part_single_tray_tableid;	}	public Integer getSsc_total_single_tray_tableid() {	    return this.ssc_total_single_tray_tableid;	}	public void setSsc_total_single_tray_tableid(Integer ssc_total_single_tray_tableid) {	    this.ssc_total_single_tray_tableid=ssc_total_single_tray_tableid;	}	public Integer getSsc_cb_id() {	    return this.ssc_cb_id;	}	public void setSsc_cb_id(Integer ssc_cb_id) {	    this.ssc_cb_id=ssc_cb_id;	}
	
}
