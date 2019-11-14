package com.zc.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcApi implements Serializable {

    private static final long serialVersionUID = 1573053152747L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * api名称
    * isNullAble:1
    */
    private String apiName;

    /**
    * 有效期
    * isNullAble:1
    */
    private java.time.LocalDateTime endTime;

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

}
