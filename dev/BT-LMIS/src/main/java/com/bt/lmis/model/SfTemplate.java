package com.bt.lmis.model;

/**
* @ClassName: SfTemplate
* @Description: TODO(SfTemplate)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class SfTemplate {
	
	
	private String sumsung_project;			//三星项目
	private String return_goods;			//退货
	private String fragile_pieces;			//易碎件
	private String ts;						//特殊
	private String firstWeight;			//首重
	private String addedWeight;			//续重
	private String remark2;			//备注
	private String length;			//长
	private String width;			//宽
	private String height;			//高
	
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public Integer getId() {
	public String getReturn_goods() {
		return return_goods;
	}
	public void setReturn_goods(String return_goods) {
		this.return_goods = return_goods;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public SfTemplate(String[] row,String bath_id) {
		this.bat_id = bath_id;
		this.date = row[1];
		this.express_number = row[2];
		this.other_area = row[3];
		this.other_company_name = row[4];
		this.charge_weight = row[5];
		this.product_type = row[6];
		this.pay_method = row[7];
		this.fee = row[8];
		this.insurance = row[9];
		this.delegated_picked = row[10];
		this.sumsung_project = row[11];
		this.return_goods = row[12];
		this.fragile_pieces = row[13];
		this.ts = row[14];
		this.amount_payable = row[15];
		this.operator = row[16];
		this.source = row[17];
		this.deliver_company_name = row[18];
		this.deliver_company_phone = row[19];
		this.reach = row[20];
		this.reach_client_name = row[21];
		this.reach_client_phone = row[22];
		this.sender = row[23];
		this.send_time = row[24];
		this.origin_province = row[25];
		this.send_company_address = row[26];
		this.recipient_no = row[27];
		this.deliver_content = row[28];
		this.deliver_num = row[29];
		this.value = row[30];
		this.num = row[31];
		this.volumn = row[32];
		this.dest_province = row[33];
		this.recipient = row[34];
		this.recipient_address = row[35];
		this.courier_no = row[36];
		this.weight = row[37];
		this.return_order_no = row[38];
		this.receiver = row[39];
		this.recipient_time = row[40];
		this.return_related_express_number = row[41];
		this.default1 = row[42];
		this.default2 = row[43];
		this.default3 = row[44];
		this.balance_date = row[45];
		this.pay_net_node = row[46];
		this.subcompany_card_number = row[47];
		this.remark = row[48];
		this.express_content = row[49];
		this.reserve_column3 = row[50];
		this.reserve_column4 = row[51];
		this.reserve_column5 = row[52];
		this.delegated_picked_remark = row[53];
		this.firstWeight = row[54];
		this.addedWeight = row[55];
		this.remark2 = row[56];
		this.length = row[57];
		this.width = row[58];
		this.height = row[59];
	}
	
}