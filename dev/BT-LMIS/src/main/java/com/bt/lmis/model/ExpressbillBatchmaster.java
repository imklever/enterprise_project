package com.bt.lmis.model;

/**
* @ClassName: ExpressbillBatchmaster
* @Description: TODO(ExpressbillBatchmaster)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class ExpressbillBatchmaster {
	
	
	private String status;
	private String local_address;
	private String billingCycle;
		return billingCycle;
	}
	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getId() {
	public String getLocal_address() {
		return local_address;
	}
	public void setLocal_address(String local_address) {
		this.local_address = local_address;
	}
}