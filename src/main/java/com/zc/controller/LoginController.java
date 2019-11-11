package com.zc.controller;

import com.zc.service.ZcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjiangtao
 */
@RestController
public class LoginController {
    @Autowired(required = false)
    private ZcUserService zcUserService;

    /**
     * 登录功能
     * */
}
