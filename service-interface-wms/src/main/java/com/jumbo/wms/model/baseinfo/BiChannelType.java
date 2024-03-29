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

package com.jumbo.wms.model.baseinfo;

/**
 * 渠道类型
 * 
 * @author dly
 * 
 */
public enum BiChannelType {
    NORMAL(1), // 正常
    VIRTUAL(5); // 虚拟
    private int value;

    private BiChannelType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static BiChannelType valueOf(int value) {
        switch (value) {
            case 1:
                return NORMAL;
            case 5:
                return VIRTUAL;
            default:
                return NORMAL;
        }
    }
}
