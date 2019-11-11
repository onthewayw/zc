package com.zc.controller;

import com.zc.service.ZcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    @Autowired(required = false)
    private ZcUserService zcUserService;

    @GetMapping("/info")
    public void queryUserInfo(Long userId) {
    }
}
