package com.zc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @author author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcCommissionRecord implements Serializable {

    private static final long serialVersionUID = 1573053219375L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * code
     * isNullAble:1
     */
    private String code;

    /**
     * 记录创建时间
     * isNullAble:1
     */
    private String createTime;

    /**
     * 0增加 1减少
     * isNullAble:1
     */
    private Integer changeType;

    /**
     * 需除100  变更的金额
     * isNullAble:1
     */
    private Long changeAmount;

    /**
     * 需除100  变更后账户余额
     * isNullAble:1
     */
    private Long changeAfterAmount;

    /**
     * isNullAble:1
     */
    private String remark;

    //=======辅助字段=======
    //除100之后的数据
    private BigDecimal changeAmountDecimal;
    private BigDecimal changeAfterAmountDecimal;
}
