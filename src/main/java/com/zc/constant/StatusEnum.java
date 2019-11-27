package com.zc.constant;

public enum StatusEnum {

    //登录密码错误
    LOGIN_PWD_CHANGE_ERROR(501, "登录密码错误"),
    //提现密码错误
    CASH_OUT_PWD_CHANGE_ERROR(0, "提现密码错误"),
    //登录密码错误
    CHANGE_PWD_NO_ERROR(503, "更改密码不存在"),

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
