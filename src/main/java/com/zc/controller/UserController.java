package com.zc.controller;

import com.zc.bean.ZcUser;
import com.zc.service.ZcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private ZcUserService zcUserService;

    @RequestMapping("/info")
    public ZcUser queryUserInfo(Long userId) {
        ZcUser zcUser = zcUserService.queryById(userId);
        return zcUser;
    }
}
