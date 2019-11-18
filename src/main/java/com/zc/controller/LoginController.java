package com.zc.controller;

import com.zc.bean.ZcUser;
import com.zc.service.ZcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author wangjiangtao
 */
@RestController
public class LoginController {
    @Autowired(required = false)
    private ZcUserService zcUserService;

    /**
     * 根据用户名和密码查询用户
     *
     * @param phonenum
     * @param password
     * @return
     */
    @GetMapping("/login")
    public Map<String, Object> login(@RequestParam("phonenum") String phonenum, @RequestParam("password") String password, HttpServletRequest request) {

        //1 根据手机号查询
        return zcUserService.login(phonenum, password,request);
    }
}
