package com.bt.lmis.controller.form;
import com.bt.lmis.page.QueryParameter;

public class ExpressbillMasterQueryParam extends QueryParameter {
	
	
	private String remarks;			//备注
	private String bf_flag;        //备份标识作业
	private String bf_reason;      //备份标识作业失败原因
	private String orderCondition;
	public String getBf_flag() {
		return bf_flag;
	}
	public void setBf_flag(String bf_flag) {
		this.bf_flag = bf_flag;
	}
	public String getBf_reason() {
		return bf_reason;
	}
	public void setBf_reason(String bf_reason) {
		this.bf_reason = bf_reason;
	}
		return con_id;
	}
	public void setCon_id(Integer con_id) {
		this.con_id = con_id;
	}
	public String getExpress_code() {
	public String getOrderCondition() {
		return orderCondition;
	}
	public void setOrderCondition(String orderCondition) {
		this.orderCondition = orderCondition;
	}
	
}