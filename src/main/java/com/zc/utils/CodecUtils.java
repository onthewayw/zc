package com.zc.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author wangjiangtao
 * <p>
 * 加密
 */
public class CodecUtils {
    public static String md5Hex(String data, String salt) {
        if (StringUtils.isBlank(salt)) {
            salt = data.hashCode() + "";
        }
        return DigestUtils.md5Hex(salt + DigestUtils.md5Hex(data));
    }

    public static String shaHex(String data, String salt) {
        if(StringUtils.isBlank(salt)){
            salt=data.hashCode()+"";
        }
        return DigestUtils.sha512Hex(salt+DigestUtils.sha512Hex(data));
    }
}
