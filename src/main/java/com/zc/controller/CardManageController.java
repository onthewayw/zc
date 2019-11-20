package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCardManage;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcCardManageService;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/caredManage")
public class CardManageController {
    @Autowired(required = false)
    private ZcCardManageService zcCardManageService;
    @Autowired(required = false)
    private HttpServletRequest request;
    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    @GetMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcCardManage cardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                cardManage.setUserId(zcUser.getId());
                PageInfo<ZcCardManage> zcCardManagePageInfo = zcCardManageService.queryByPage(page, size, cardManage);
                returnObject.put("data", zcCardManagePageInfo);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }


}
