package com.bt.lmis.model;

/**
* @ClassName: CollectionDetail
* @Description: TODO(CollectionDetail)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class CollectionDetail {
	
	
	
	private Integer pid;			//主表id
		return freight;
	}
	public void setFreight(java.math.BigDecimal freight) {
		this.freight = freight;
	}
	
	public java.math.BigDecimal getFavourable_price_total() {
		return favourable_price_total;
	}
	public void setFavourable_price_total(java.math.BigDecimal favourable_price_total) {
		this.favourable_price_total = favourable_price_total;
	}
	public Integer getId() {
	@Override
	public String toString() {
		return "CollectionDetail [id=" + id + ", create_time=" + create_time + ", create_user=" + create_user
				+ ", update_time=" + update_time + ", update_user=" + update_user + ", producttype_code="
				+ producttype_code + ", sum=" + sum + ", favourable_price=" + favourable_price
				+ ", favourable_price_total=" + favourable_price_total + ", freight=" + freight + ", pid=" + pid + "]";
	}
	
	
}