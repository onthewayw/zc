package com.zc.constant;

/**
 * @author wangjiangtao
 */
public class SecretConstant {
    //签名秘钥
    public static final String BASE64SECRET = "LaQEjpb!4E0lRaG(ZW]4l5JH[m6Lm)";

    //超时毫秒数（默认30分钟）
    public static final int EXPIRESSECOND = 1800000;

    //用于JWT加密的密匙
    public static final String DATAKEY = "PER41jm*fnu^3y6S";

    //盐，用于混交md5
    public static final String SLAT = "&%$$#@&%1A2Asc*";
}
