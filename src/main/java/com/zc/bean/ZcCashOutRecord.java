package com.zc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

/**
 * @author author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcCashOutRecord implements Serializable {

    private static final long serialVersionUID = 1573053199861L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * isNullAble:1
     */
    private String code;

    /**
     * 需除100 提现金额
     * isNullAble:1
     */
    private Long cashOutAmount;

    /**
     * 创建时间
     * isNullAble:1
     */
    private Date createTime;

    /**
     * 支付宝账号
     * isNullAble:1
     */
    private String alipayAccount;

    /**
     * 支付宝名字
     * isNullAble:1
     */
    private String alipayName;

    /**
     * 1支付宝
     * isNullAble:1
     */
    private Integer type;

    /**
     * 1申请中 2申请成功
     * isNullAble:1
     */
    private String remarkStatus;
}
