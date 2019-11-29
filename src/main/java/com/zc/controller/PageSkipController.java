package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageSkipController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
