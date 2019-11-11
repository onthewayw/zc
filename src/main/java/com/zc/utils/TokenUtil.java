/*
package com.zc.utils;

import io.jsonwebtoken.Jwts;

import java.util.Date;
import java.util.UUID;

*/
/**
 * @author wangjiangtao
 *//*

public class TokenUtil {
    */
/**
     * 创建token
     *//*

    public void createToken(Long userId) {
        long nowTime = System.currentTimeMillis();
        Jwts.builder()
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(new Date(nowTime)) //签发时间
                .setSubject("saysomething")//说明
                .setIssuer(userId+"");

    }
}
*/
