package com.zc.constant;

public enum StatusEnum {

    /**
     * 批量方式
     * */
    BATCH_RECHARGE(1,"批量充值"),
    BATCH_STROKE_CARD(2,"批量划卡"),

    /**
     * 支付方式
     * */
    PAY_ALI(1,"支付宝"),

    /**
     *  提现申请记录
     * */
    CASH_OUT_APPLICATION(1,"申请中"),
    CASH_OUT_APPLICATION_SUCCESS(2,"申请成功"),

    CASH_OUT_GREATER_THAN_ZERO_ERR(501,"提现金额要大于0"),
    CASH_OUT_GREATER_THAN_AMOUNT_ERR(502,"提现金额要小于当前余额"),

    //登录密码错误
    LOGIN_PWD_CHANGE_ERROR(501, "登录密码错误"),
    //提现密码错误
    CASH_OUT_PWD_CHANGE_ERROR(502, "提现密码错误"),
    //登录密码错误
    CHANGE_PWD_NO_ERROR(503, "更改密码为空"),

    //登录状态枚举
    LOGIN_STATUS_SUCCESS(0, "登录成功"),
    LOGIN_STATUS_NO_ACCOUNT(1, "账号不存在"),
    LOGIN_STATUS_PASSWORD_ERR(2, "密码错误"),
    LOGIN_STATUS_CODE_ERR(3, "验证码错误"),
    LOGIN_STATUS_SYSTEM_ERR(4, "系统出错");
    private int value;
    private String name;

    private StatusEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getCode() {
        return this.value;
    }

    public void setCode(int code) {
        this.value = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
