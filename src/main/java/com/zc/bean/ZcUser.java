package com.zc.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcUser implements Serializable {

    private static final long serialVersionUID = 1573052957451L;


    /**
     * 主键
     * <p>
     * isNullAble:0
     */
    private Long id;

    /**
     * 登录账号
     * isNullAble:1
     */
    private String loginAccount;

    /**
     * 密码
     * isNullAble:1
     */
    @JsonIgnore
    @Length(min = 4, max = 30, message = "用户名只能在4~30位之间")
    private String password;

    /**
     * 姓名
     * isNullAble:1
     */
    private String userName;

    /**
     * 手机号码
     * isNullAble:1
     */
    @Pattern(regexp = "^1[35678]\\d{9}$", message = "手机号格式不正确")
    private String phoneNum;

    /**
     * 邮箱账号
     * isNullAble:1
     */
    private String mailAddress;

    /**
     * 0 不显示 1显示
     * isNullAble:1,defaultVal:0
     */
    private Integer show;

    /**
     * 0表示为一级代理 别的通过当前id查询
     * isNullAble:1
     */
    private Long parentId;

    /**
     * 账户余额  默认为0 展示需除100
     */
    private Long accountBalance;

    /**
     * 提现密码
     */
    @JsonIgnore
    @Length(min = 4, max = 30, message = "用户名只能在4~30位之间")
    private String cashOutPwd;

    //========辅助字段=========
    private String changePwd;
    /**
     * 金额除100之后
     */
    private BigDecimal accountBalanceDecimal;
}
