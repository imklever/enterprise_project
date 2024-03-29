/**
 * Copyright (c) 2010 Jumbomart All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Jumbomart. You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jumbo.
 * 
 * JUMBOMART MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. JUMBOMART SHALL NOT BE LIABLE FOR ANY
 * DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 * 
 */

package com.jumbo.wms.model.warehouse;

/**
 * 上架模式
 * 
 * @author wanghua
 * 
 */
public enum InboundStoreMode {
    SHELF_MANAGEMENT(33), // 保质期管理
    TOGETHER(11), // 批次混放
    RESPECTIVE(22); // 单批隔离

    private int value;

    private InboundStoreMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static InboundStoreMode valueOf(int value) {
        switch (value) {
            case 33:
                return SHELF_MANAGEMENT;
            case 11:
                return TOGETHER;
            case 22:
                return RESPECTIVE;
            default:
                throw new IllegalArgumentException();
        }
    }
}
