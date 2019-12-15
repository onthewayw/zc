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
public class ZcSetMeal implements Serializable {

    private static final long serialVersionUID = 1573053152747L;


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
     * api Id
     */
    private Long apiId;

    /**
     * 有效期 单位月
     * isNullAble:1
     */
    private Integer periodTime;

    /**
     * 成本 价格 （用的话除100）
     * isNullAble:1
     */
    private Long costPrice;

    /**
     * 代理成本价格  （应除100）
     * isNullAble:1
     */
    private Long agentCostPrice;

    /**
     * 终端价格  （应除100）
     * isNullAble:1
     */
    private Long terminalPrice;

    /**
     * 套餐名称
     */
    private String setMealName;

    //========辅助字段===========
    /**
     * api name
     */
    private String apiName;

    /**
     * 1联通卡 2移动卡 3 电信卡
     */
    private Integer type;

    /**
     * costPrice 除100以后
     */
    private BigDecimal costPriceDecimal;

    /**
     * agentCostPrice 除100以后
     */
    private BigDecimal agentCostPriceDecimal;
    /**
     * terminalPrice 除100以后
     */
    private BigDecimal terminalPriceDecimal;

    /**
     * 过期时间
     * */
    private String periodTimeStr;
}
