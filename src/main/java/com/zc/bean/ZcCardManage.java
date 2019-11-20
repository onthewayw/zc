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
public class ZcCardManage implements Serializable {

    private static final long serialVersionUID = 1573053187981L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
     * 用户Id
     * */
    private Long userId;


    /**
    * 1联通卡 2移动卡 3 电信卡
    * isNullAble:1
    */
    private Integer type;

    /**
    * 
    * isNullAble:1
    */
    private String code;

    /**
    * 
    * isNullAble:1
    */
    private String iccid;

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
}
