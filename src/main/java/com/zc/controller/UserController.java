package com.zc.controller;

import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcUserService;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private ZcUserService zcUserService;
    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    @RequestMapping("/info")
    public ZcUser queryUserInfo() {
        String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
        ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
        return zcUser;
    }
}
