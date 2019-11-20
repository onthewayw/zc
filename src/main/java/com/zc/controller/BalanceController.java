package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcBalance;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcBalanceService;
import com.zc.utils.RedisTokenOper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiangtao
 */
@RestController
@RequestMapping("/balance")
public class BalanceController {
    private static final Logger logger = LoggerFactory.getLogger(BalanceController.class);

    @Autowired(required = false)
    private ZcBalanceService zcBalanceService;
    @Autowired(required = false)
    private HttpServletRequest request;
    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    @GetMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size,ZcBalance balance) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                balance.setUserId(zcUser.getId());
                PageInfo<ZcBalance> pageInfo = zcBalanceService.queryPageByUserId(page, size, balance);
                returnObject.put("data",pageInfo);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }
    /**
     * 新增记录
     */
    @PostMapping("/add")
    public Map<String, Object> addRecord(ZcBalance zcBalance) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                zcBalance.setUserId(zcUser.getId());
                Long id = zcBalanceService.insertZcBalance(zcBalance);
                if (null != id) {
                    returnObject.put("id", id);
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnObject;
    }
}
