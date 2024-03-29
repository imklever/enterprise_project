package com.jumbo.wms.model.hub2wms.threepl;

import java.io.Serializable;

public class StockOutCheckItem implements Serializable {

    private static final long serialVersionUID = -8515564020634031798L;

    /**
     * 出库单明细id
     */
    private String orderItemId;
    /**
     * 该商品实际出库总量
     */
    private Long quantity;

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

}
