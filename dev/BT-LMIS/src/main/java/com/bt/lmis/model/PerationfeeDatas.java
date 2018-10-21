package com.bt.lmis.model;

public class PerationfeeDatas {
	
	
	private Integer id;			//主键
	private java.util.Date create_time;			//创建时间
	private String create_user;			//创建人
	private java.util.Date update_time;			//更新时间
	private String update_user;			//更新人
	private String order_type;			//订单类型
	private java.util.Date operation_time;			//操作时间戳
	private String store_name;			//店铺名称
	private String job_orderno;			//作业单号
	private String related_orderno;			//相关单号
	private String job_type;			//作业类型名称
	private String storaggelocation_code;			//库位编码
	private java.math.BigDecimal in_num;			//入库数量
	private java.math.BigDecimal out_num;			//出库数量
	private String item_number;			//商品编码
	private String sku_number;			//sku编码
	private String art_no;			//货号
	private String item_name;			//商品名称
	private String item_size;			//商品大小
	private String inventory_status;			//库存状态
	private String operator;			//操作员
	private Integer store_id;			//所属店铺id
	private Integer settle_flag;			//结算标识
	private Integer ctnum;
    private String start_time;
    private String end_time;
	
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public Integer getCtnum() {
		return ctnum;
	}
	public void setCtnum(Integer ctnum) {
		this.ctnum = ctnum;
	}
	public Integer getId() {
	    return this.id;
	}
	public void setId(Integer id) {
	    this.id=id;
	}
	public java.util.Date getCreate_time() {
	    return this.create_time;
	}
	public void setCreate_time(java.util.Date create_time) {
	    this.create_time=create_time;
	}
	public String getCreate_user() {
	    return this.create_user;
	}
	public void setCreate_user(String create_user) {
	    this.create_user=create_user;
	}
	public java.util.Date getUpdate_time() {
	    return this.update_time;
	}
	public void setUpdate_time(java.util.Date update_time) {
	    this.update_time=update_time;
	}
	public String getUpdate_user() {
	    return this.update_user;
	}
	public void setUpdate_user(String update_user) {
	    this.update_user=update_user;
	}
	public String getOrder_type() {
	    return this.order_type;
	}
	public void setOrder_type(String order_type) {
	    this.order_type=order_type;
	}
	public java.util.Date getOperation_time() {
	    return this.operation_time;
	}
	public void setOperation_time(java.util.Date operation_time) {
	    this.operation_time=operation_time;
	}
	public String getStore_name() {
	    return this.store_name;
	}
	public void setStore_name(String store_name) {
	    this.store_name=store_name;
	}
	public String getJob_orderno() {
	    return this.job_orderno;
	}
	public void setJob_orderno(String job_orderno) {
	    this.job_orderno=job_orderno;
	}
	public String getRelated_orderno() {
	    return this.related_orderno;
	}
	public void setRelated_orderno(String related_orderno) {
	    this.related_orderno=related_orderno;
	}
	public String getJob_type() {
	    return this.job_type;
	}
	public void setJob_type(String job_type) {
	    this.job_type=job_type;
	}
	public String getStoraggelocation_code() {
	    return this.storaggelocation_code;
	}
	public void setStoraggelocation_code(String storaggelocation_code) {
	    this.storaggelocation_code=storaggelocation_code;
	}
	public java.math.BigDecimal getIn_num() {
	    return this.in_num;
	}
	public void setIn_num(java.math.BigDecimal in_num) {
	    this.in_num=in_num;
	}
	public java.math.BigDecimal getOut_num() {
	    return this.out_num;
	}
	public void setOut_num(java.math.BigDecimal out_num) {
	    this.out_num=out_num;
	}
	public String getItem_number() {
	    return this.item_number;
	}
	public void setItem_number(String item_number) {
	    this.item_number=item_number;
	}
	public String getSku_number() {
	    return this.sku_number;
	}
	public void setSku_number(String sku_number) {
	    this.sku_number=sku_number;
	}
	public String getArt_no() {
	    return this.art_no;
	}
	public void setArt_no(String art_no) {
	    this.art_no=art_no;
	}
	public String getItem_name() {
	    return this.item_name;
	}
	public void setItem_name(String item_name) {
	    this.item_name=item_name;
	}
	public String getItem_size() {
	    return this.item_size;
	}
	public void setItem_size(String item_size) {
	    this.item_size=item_size;
	}
	public String getInventory_status() {
	    return this.inventory_status;
	}
	public void setInventory_status(String inventory_status) {
	    this.inventory_status=inventory_status;
	}
	public String getOperator() {
	    return this.operator;
	}
	public void setOperator(String operator) {
	    this.operator=operator;
	}
	public Integer getStore_id() {
	    return this.store_id;
	}
	public void setStore_id(Integer store_id) {
	    this.store_id=store_id;
	}
	public Integer getSettle_flag() {
	    return this.settle_flag;
	}
	public void setSettle_flag(Integer settle_flag) {
	    this.settle_flag=settle_flag;
	}
}
