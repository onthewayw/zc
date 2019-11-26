package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcUserService;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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

    /**
     * 新增人员
     */
    @PostMapping("/addOrUpdate")
    public Map<String, Object> addRecord(ZcUser zcUser) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser user = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                if (null != zcUser.getId()) {
                    int i = zcUserService.updateZcUser(zcUser);
                    if (i != 0) {
                        returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    }
                } else {
                    //是有本人创建的
                    zcUser.setParentId(user.getId());
                    Long id = zcUserService.insertZcUser(zcUser);
                    if (null != id) {
                        returnObject.put("id", id);
                        returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 分页查询
     */
    @GetMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcUser zcUser) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser user = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != user) {
                zcUser.setParentId(user.getId());
                PageInfo<ZcUser> pageInfo = zcUserService.queryByPage(page, size, zcUser);
                returnObject.put("data", pageInfo);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }
}
