package com.zc.controller;

import com.zc.service.ZcBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/balance")
public class BalanceController {
    @Autowired(required = false)
    private ZcBalanceService zcBalanceService;

    @GetMapping("/queryBYPage")
    public Map<String, Object> queryByPage() {
        Map<String, Object> returnOject = new HashMap<>();


        return returnOject;
    }
}
