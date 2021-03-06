package com.zc.utils;

import com.alibaba.fastjson.JSONObject;
import com.zc.constant.SecretConstant;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * * @Description : JWT工具类
 * <br/>参考官网：https://jwt.io/
 * <br/>JWT的数据结构为：A.B.C三部分数据，由字符点"."分割成三部分数据
 * <br/>A-header头信息
 * <br/>B-payload 有效负荷 一般包括：已注册信息（registered claims），公开数据(public claims)，私有数据(private claims)
 * <br/>C-signature 签名信息 是将header和payload进行加密生成的
 */
public class TokenUtils {
    private static Logger logger = LoggerFactory.getLogger(TokenUtils.class);

    /**
     * @param userId     - 用户编号
     * @param username   - 用户名
     * @param identities - 客户端信息（变长参数），目前包含浏览器信息，用于客户端拦截器校验，防止跨域非法访问
     * @Author: Helon
     * <br/>格式：A.B.C
     * <br/>A-header头信息
     * <br/>B-payload 有效负荷
     * <br/>C-signature 签名信息 是将header和payload进行加密生成的
     */
    public static String generateJWT(String userId, String username, String... identities) {
        //签名算法，选择SHA-256
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //获取当前系统时间
        long noTimeMillis = System.currentTimeMillis();
        Date nowTime = new Date(noTimeMillis);
        //将BASE64SECRET常量字符串使用base64解码成字节数组
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SecretConstant.BASE64SECRET);
        //使用使用HmacSHA256签名算法生成一个HS256的签名秘钥Key
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        //添加构成JWT的参数
        Map<String, Object> headMap = new HashMap<>();
        /**
         * Header
         * {
         *     "alg": "HS256",
         *     "typ": "JWT"
         * }
         * */
        headMap.put("alg", SignatureAlgorithm.HS256.getValue());
        headMap.put("typ", "JWT");
        JwtBuilder jwtBuilder = Jwts.builder().setHeader(headMap)
                /**
                 * Payload
                 * {
                 *     "userId": "1",
                 *     "userName": "wjt"
                 * }
                 * */
                //加密后的客户编号
                .claim("userId", AESSecretUtil.encryptToStr(userId, SecretConstant.DATAKEY))
                //用户名称
                .claim("username", username)
                //客户端浏览器信息
                .claim("userAgent", identities[0])
                //signature
                .signWith(signatureAlgorithm, signingKey);
        //添加token过期时间
        if (SecretConstant.EXPIRESSECOND >= 0) {
            long expMills = noTimeMillis + SecretConstant.EXPIRESSECOND;
            Date expDate = new Date(expMills);
            jwtBuilder.setExpiration(expDate).setNotBefore(nowTime);
        }
        return jwtBuilder.compact();
    }

    /**
     * @param jsonWebToken - 页面传过来的token
     * @return Claims对象
     */
    public static Claims parseJWT(String jsonWebToken) {
        Claims claims = null;
        try {
            if (StringUtils.isNotBlank(jsonWebToken)) {
                //解析jwt
                claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(SecretConstant.BASE64SECRET))
                        .parseClaimsJws(jsonWebToken).getBody();
            }else{
                logger.warn("[JWTHelper]-json web token 为空");
            }
        } catch (Exception e) {
            logger.error("[JWTHelper]-JWT解析异常：可能因为token已经超时或非法token");
            e.printStackTrace();
        }
        return claims;
    }
    /**
     * @param jsonWebToken - 页面传过来的token
     * @return json字符串的demo:<br/>
     * {"freshToken":"A.B.C","userName":"Judy","userId":"123", "userAgent":"xxxx"}
     * <br/>freshToken-刷新后的jwt
     * <br/>userName-客户名称
     * <br/>userId-客户编号
     * <br/>userAgent-客户端浏览器信息
     */
    public static String validateLogin(String jsonWebToken) {
        Map<String, Object> retMap = null;
        Claims claims = parseJWT(jsonWebToken);
        if (claims != null) {
            //解密客户编号
            String decryptUserId = AESSecretUtil.decryptToStr((String) claims.get("userId"), SecretConstant.DATAKEY);
            retMap = new HashMap<>();
            //加密后的客户编号
            retMap.put("userId", decryptUserId);
            //客户名称
            retMap.put("userName", claims.get("userName"));
            //客户端浏览器信息
            retMap.put("userAgent", claims.get("userAgent"));
            //刷新JWT
            retMap.put("freshToken", generateJWT(decryptUserId, (String) claims.get("userName"), (String) claims.get("userAgent"), (String) claims.get("domainName")));
        } else {
            logger.warn("[JWTHelper]-JWT解析出claims为空");
        }
        return retMap != null ? JSONObject.toJSONString(retMap) : null;
    }
}
