package com.bt.lmis.model;

/**
* @ClassName: StorageExpendituresDataSettlement
* @Description: TODO(StorageExpendituresDataSettlement)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class StorageExpendituresDataSettlement {
	
	
	private String end_time;
	private String contract_name;
	private String contract_no;
	private String billing_cycle;
	private String batch;
	
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getContract_name() {
		return contract_name;
	}
	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}
	public String getContract_no() {
		return contract_no;
	}
	public void setContract_no(String contract_no) {
		this.contract_no = contract_no;
	}
	public String getBilling_cycle() {
		return billing_cycle;
	}
	public void setBilling_cycle(String billing_cycle) {
		this.billing_cycle = billing_cycle;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public Integer getId() {
}