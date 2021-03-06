package com.zc.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class ZcCardManage implements Serializable {

    private static final long serialVersionUID = 1573053187981L;


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
     * 1联通卡 2移动卡 3 电信卡
     * isNullAble:1
     */
    private Integer type;

    /**
     * isNullAble:1
     */
    private String code;

    /**
     * isNullAble:1
     */
    private Long iccid;

    /**
     * 套餐余量
     */
    private Long allowance;

    /**
     * 所属代理
     * isNullAble:1
     */
    private String belongUser;

    /**
     * 1正常使用 2库存  3停用
     * isNullAble:1
     */
    private Integer status;

    /**
     * api名称
     * isNullAble:1
     */
    private String apiName;

    /**
     * api  id
     * isNullAble:1
     */
    private Long apiId;

    /**
     * 地区
     */
    private String area;

    /**
     * 已使用流量
     */
    private Long usedTraffic;

    //===========辅助查询字段 返回不需要展示=========================
    /**
     * 开始iccid
     */
    @JsonIgnore
    private Long beginIccid;

    /**
     * 结束iccid
     */
    @JsonIgnore
    private Long endIccid;
    /**
     * 小于套餐余量
     */
    @JsonIgnore
    private Long lessAllowance;

    /**
     * 套餐余量 （除100）
     */
    private BigDecimal allowanceDecimal;
    /**
     * 套餐已使用费量 （除100）
     */
    private BigDecimal usedTrafficDecimal;

    /**
     * 套餐Id
     */
    private Long setMealId;

}
