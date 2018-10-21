package com.bt.workOrder.model;

import java.util.Date;

public class GroupStorePower {
	private String id;
	private String create_by;
	private Date create_time;
	private String update_by;
	private Date update_time;
	private Integer group;
	private Boolean selfwarehouse;
	private Boolean outsourcedwarehouse;
	private String store;
	private Boolean dFlag;
	public GroupStorePower() {
		
	}
	public GroupStorePower(String id, String update_by, Boolean dFlag) {
		this.id= id;
		this.update_by= update_by;
		this.dFlag= dFlag;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Integer getGroup() {
		return group;
	}
	public void setGroup(Integer group) {
		this.group = group;
	}
	public Boolean getSelfwarehouse() {
		return selfwarehouse;
	}
	public void setSelfwarehouse(Boolean selfwarehouse) {
		this.selfwarehouse = selfwarehouse;
	}
	public Boolean getOutsourcedwarehouse() {
		return outsourcedwarehouse;
	}
	public void setOutsourcedwarehouse(Boolean outsourcedwarehouse) {
		this.outsourcedwarehouse = outsourcedwarehouse;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public Boolean getdFlag() {
		return dFlag;
	}
	public void setdFlag(Boolean dFlag) {
		this.dFlag = dFlag;
	}
	
}
