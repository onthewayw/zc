package com.zc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcBalance implements Serializable {

    private static final long serialVersionUID = 1573053171970L;


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
     * isNullAble:1
     */
    private String code;

    /**
     * 类型 1上级充值 2下级扣费  3后台充值套餐  4总后台扣除  5自动充值
     * isNullAble:1
     */
    private Integer type;

    /**
     * 金额 都是乘100之后
     * isNullAble:1
     */
    private Long amount;

    /**
     * 变更后余额 都是乘100之后
     * isNullAble:1
     */
    private Long balanceAfterChange;

    /**
     * 创建记录时间
     * isNullAble:1
     */
    private Date createTime;

    /**
     * 备注
     * isNullAble:1
     */
    private String remarks;
    /**
     * =====================辅助字段===========================
     */
    private String createStartTime;
    private String creteEndTime;

    private BigDecimal amountDecimal;
    private BigDecimal balanceAfterChangeDecimal;
}
