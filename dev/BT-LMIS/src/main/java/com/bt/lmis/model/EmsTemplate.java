package com.bt.lmis.model;

/**
* @ClassName: EmsTemplate
* @Description: TODO(EmsTemplate)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class EmsTemplate {
	
	
	private String bat_id;			//批次号
	
	
		return bat_id;
	}
	public void setBat_id(String bat_id) {
		this.bat_id = bat_id;
	}
	public Integer getId() {
	public EmsTemplate(String[] str,String bath_id) {
		this.bat_id = bath_id;
		this.delivery_time = str[0];
		this.express_number = str[1];
		this.reach = str[2];
		this.type = str[3];
		this.weight = str[4];
		this.postage = str[5];
		this.total_fee = str[6];
		this.balance_postage = str[7];
		this.standard_postage = str[8];
		this.other_fee = str[9];
		this.product = str[10];
		this.num = str[11];
		this.num_in = str[12];
		this.payment_amount = str[13];
		this.big_client = str[14];
		this.receiver = str[15];
		this.staff_name = str[16];
		this.pay_status = str[17];
		this.package_fee = str[18];
		this.premium = str[19];
		this.insurance = str[20];
		this.declare_fee = str[21];
		this.additional_fee = str[22];
		this.single_fee = str[23];
		this.airport_fee = str[24];
		this.return_fee = str[25];
		this.information_fee = str[26];
		this.receive_fee = str[27];
		this.other_postage = str[28];
		this.insurance_procedures = str[29];
		this.length = str[30];
		this.width = str[31];
		this.higth = str[32];
		this.volumn_weight = str[33];
		this.organization_number = str[34];
		this.system_discount = str[35];
		this.adjustment_discount = str[36];
		this.real_weight = str[37];
		this.real_standard_postage = str[38];
		this.balance_freight = str[39];
		this.weight_different = str[40];
		this.freight_different = str[41];
	}
	
	
}