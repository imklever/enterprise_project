package com.bt.lmis.model;

/**
* @ClassName: StorageDataGroup
* @Description: TODO(StorageDataGroup)
* @author Yuriy.Jiang
* @date 2016年6月22日 上午10:19:25
*
*/
public class StorageDataGroup {
	
	
	private String batch;
	
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public java.math.BigDecimal getFixed_qty() {
		return fixed_qty;
	}
	public void setFixed_qty(java.math.BigDecimal fixed_qty) {
		this.fixed_qty = fixed_qty;
	}
	public java.math.BigDecimal getTray_qty() {
		return tray_qty;
	}
	public void setTray_qty(java.math.BigDecimal tray_qty) {
		this.tray_qty = tray_qty;
	}
	
}