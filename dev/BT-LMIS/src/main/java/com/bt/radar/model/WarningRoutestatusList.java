package com.bt.radar.model;

/**
* @ClassName: WarningRoutestatusList
* @Description: TODO(WarningRoutestatusList)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class WarningRoutestatusList {
	
		private String id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String transport_code;			//物流服务商代码	private String routestatus_code;			//路由状态代码	private String warningtype_code;			//预警类型代码	private Integer dl_flag;			//删除标识	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getTransport_code() {	    return this.transport_code;	}	public void setTransport_code(String transport_code) {	    this.transport_code=transport_code;	}	public String getRoutestatus_code() {	    return this.routestatus_code;	}	public void setRoutestatus_code(String routestatus_code) {	    this.routestatus_code=routestatus_code;	}	public String getWarningtype_code() {	    return this.warningtype_code;	}	public void setWarningtype_code(String warningtype_code) {	    this.warningtype_code=warningtype_code;	}	public Integer getDl_flag() {	    return this.dl_flag;	}	public void setDl_flag(Integer dl_flag) {	    this.dl_flag=dl_flag;	}
}
