package com.bt.lmis.balance.model;

/**
* @ClassName: AddservicefeeDataSettlement
* @Description: TODO(AddservicefeeDataSettlement)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class AddservicefeeEstimateSettlement {
	
	
	private String starttime;
	private String endtime;
	private String batch_number;
	private int contract_id;
	
	
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public String getBatch_number() {
		return batch_number;
	}
	public void setBatch_number(String batch_number) {
		this.batch_number = batch_number;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getId() {
}