package com.bt.orderPlatform.model;

/**
* @ClassName: TransportProductType
* @Description: TODO(TransportProductType)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class TransportProductType extends Jurisdiction{
	
	
	private String express_name;
	private String product_type_code;			//产品类型代码
	public String getExpress_name() {
		return express_name;
	}
	public void setExpress_name(String express_name) {
		this.express_name = express_name;
	}
	public String getExpress_code() {
		return express_code;
	}
	public void setExpress_code(String express_code) {
		this.express_code = express_code;
	}
}