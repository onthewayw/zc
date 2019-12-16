package com.zc.utils;

import com.zc.bean.dto.UserInfo;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiangtao
 */
public class JwtTest {
    private static final String pubKeyPath = "D:\\root\\rsa\\rsa.pub";
    private static final String priKeyPath = "D:\\root\\rsa\\rsa.pri";

    private PublicKey publicKey;
    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "233");
    }

    @Test
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTU3MzgwMjU1OX0.X3_5pktYwpbv-k6N1yFuiN8sV_1rR4g0x5Ea66FIK7avtoeELSxibKN1Mhjapw0VDTtj9Y0wlgJ7yo1QJu33RrVA2KuPnTcr2n2snuN1eSLUMXwkNE31j8N802aTDOqrBbb2Ay7IDY7txO5NvkyfxslMsW5-ZzHTn7QRrFfuZJk";
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }

    @Test
    public void testGenerateJWT() {
        String s = TokenUtils.generateJWT(1L + "", "wang", "谷歌");
        System.out.println("token==" + s);
    }

    @Test
    public void testParseJwt() {
        /*Claims claims = TokenUtils.parseJWT("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOiJFODdFQTk2NTQwNEYyOUZBODI1RkMzNzQzNUExNjQ3MSIsInVzZXJuYW1lIjoid2FuZyIsInVzZXJBZ2VudCI6Iuiwt-atjCIsImV4cCI6MTU3MzgwODg2MywibmJmIjoxNTczODA3MDYzfQ.Ey16nGBfNmSLH0qsbxNHZEzDMh8o5HmfZmoBAKI4Q30");
        System.out.println(claims);*/
        Map<String, Object> map = new HashMap<>(4);
        map.put("w",1);
        System.out.println(map.get("w"));
    }
    @Test
    public void testInt(){
        int a=1;
        int b=1;
        Integer c=1;
        Integer d=1;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(d==c);
    }
}
