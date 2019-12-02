package com.zc.constant;

/**
 * @author wangjiangtao
 */
public class WebUserConstant {
    public static final String SESSIONUSERINFO = "sessionUserInfo";

    /**
     * token  header key
     */
    public static final String TOKENAUTHORIZATION = "Authorization";

    /**
     * status状态错误
     */
    public static final Integer STATUSERROR = 500;
    /**
     * status状态码正确
     */
    public static final Integer STATUSSUCCESS = 200;
    /**
     * status状态码超过500
     */
    public static final Integer STATUBIGERROR = 201;
    /**
     * status状态码没有数据
     */
    public static final Integer STATUNOERROR = 202;
}
