package com.bt.orderPlatform.model;

/**
* @ClassName: Area
* @Description: TODO(Area)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class Area {
	
		private Integer id;			//主键	private java.util.Date create_time;			//创建时间	private String create_user;			//创建人	private java.util.Date update_time;			//更新时间	private String update_user;			//更新人	private String area_code;			//代码	private String area_name;			//名称	private Integer level;			//级别	private Integer pid;			//父节点ID	private Integer haschild;			//存在子节点 存在-0 不存在-1
	
	public Area(){
		
	}
	
	public Area(Integer level){
		this.level= level;
		
	}	public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public java.util.Date getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.util.Date create_time) {	    this.create_time=create_time;	}	public String getCreate_user() {	    return this.create_user;	}	public void setCreate_user(String create_user) {	    this.create_user=create_user;	}	public java.util.Date getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.util.Date update_time) {	    this.update_time=update_time;	}	public String getUpdate_user() {	    return this.update_user;	}	public void setUpdate_user(String update_user) {	    this.update_user=update_user;	}	public String getArea_code() {	    return this.area_code;	}	public void setArea_code(String area_code) {	    this.area_code=area_code;	}	public String getArea_name() {	    return this.area_name;	}	public void setArea_name(String area_name) {	    this.area_name=area_name;	}	public Integer getLevel() {	    return this.level;	}	public void setLevel(Integer level) {	    this.level=level;	}	public Integer getPid() {	    return this.pid;	}	public void setPid(Integer pid) {	    this.pid=pid;	}	public Integer getHaschild() {	    return this.haschild;	}	public void setHaschild(Integer haschild) {	    this.haschild=haschild;	}
}
