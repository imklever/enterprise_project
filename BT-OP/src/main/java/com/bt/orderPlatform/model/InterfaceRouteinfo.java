package com.bt.orderPlatform.model;

/**
* @ClassName: InterfaceRouteinfo
* @Description: TODO(InterfaceRouteinfo)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class InterfaceRouteinfo {
	
		private Integer id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String transport_code;			//	private String waybill;			//	private java.util.Date route_time;			//路由发生时间	private String route_city;			//路由发生地点	private String facility_no;			//路由发生网点代码	private String facility_name;			//路由发生网点名称	private String route_remark;			//路由节点具体描述	private String route_opcode;			//路由节点操作码	private Integer flag;			//解析批次号
	private String route_source;    //路由信息来源	public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getTransport_code() {	    return this.transport_code;	}	public void setTransport_code(String transport_code) {	    this.transport_code=transport_code;	}	public String getWaybill() {	    return this.waybill;	}	public void setWaybill(String waybill) {	    this.waybill=waybill;	}	public java.util.Date getRoute_time() {	    return this.route_time;	}	public void setRoute_time(java.util.Date route_time) {	    this.route_time=route_time;	}	public String getRoute_city() {	    return this.route_city;	}	public void setRoute_city(String route_city) {	    this.route_city=route_city;	}	public String getFacility_no() {	    return this.facility_no;	}	public void setFacility_no(String facility_no) {	    this.facility_no=facility_no;	}	public String getFacility_name() {	    return this.facility_name;	}	public void setFacility_name(String facility_name) {	    this.facility_name=facility_name;	}	public String getRoute_remark() {	    return this.route_remark;	}	public void setRoute_remark(String route_remark) {	    this.route_remark=route_remark;	}	public String getRoute_opcode() {	    return this.route_opcode;	}	public void setRoute_opcode(String route_opcode) {	    this.route_opcode=route_opcode;	}	public Integer getFlag() {	    return this.flag;	}	public void setFlag(Integer flag) {	    this.flag=flag;	}
	public String getRoute_source() {
		return route_source;
	}
	public void setRoute_source(String route_source) {
		this.route_source = route_source;
	}
}
