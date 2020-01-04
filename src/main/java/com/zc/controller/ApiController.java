package com.zc.controller;

import com.zc.bean.ZcApi;
import com.zc.bean.ZcSetMeal;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcApiService;
import com.zc.service.ZcSetMealService;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangjiangtao
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired(required = false)
    private ZcApiService zcApiService;

    @Autowired(required = false)
    private ZcSetMealService zcSetMealService;
    @Autowired(required = false)
    private HttpServletRequest request;
    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    @RequestMapping("/queryByType")
    public Map<String, Object> queryByType(Integer type) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器请求出错");
        try {
            ZcApi zcApi = new ZcApi();
            zcApi.setType(type);
            List<ZcApi> zcApis = zcApiService.queryZcApi(zcApi);
            returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            returnObject.put("message", "请求成功");
            returnObject.put("data", zcApis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    @RequestMapping("/queryByApiId")
    public Map<String, Object> queryByApiId(Long apiId) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器请求错误");
        try {
            if (null != apiId) {
                String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
                ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
                if (null != zcUser) {
                    ZcSetMeal setMeal = new ZcSetMeal();
                    setMeal.setApiId(apiId);
                    setMeal.setUserId(zcUser.getId());
                    List<ZcSetMeal> zcSetMeals = zcSetMealService.queryZcSetMeal(setMeal);
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    returnObject.put("message", "请求成功");
                    returnObject.put("data", zcSetMeals);
                }
            } else {
                returnObject.put("message", "请输入apiId");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }
}
