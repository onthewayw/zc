package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcSetMeal;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcSetMealService;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 物联卡
 *
 * @author wangjiangtao
 */
@RestController
@RequestMapping("/telecom")
public class TelecomController {
    @Autowired(required = false)
    private ZcSetMealService zcSetMealService;

    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    /**
     * 条件查询
     */
    @RequestMapping("/queryByList")
    public Map<String, Object> queryByList(ZcSetMeal zcSetMeal) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                zcSetMeal.setUserId(zcUser.getId());
                List<ZcSetMeal> zcSetMeals = zcSetMealService.queryZcSetMeal(zcSetMeal);
                returnObject.put("data", zcSetMeals);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 分页查询
     */
    @RequestMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcSetMeal zcSetMeal) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                zcSetMeal.setUserId(zcUser.getId());
                PageInfo<ZcSetMeal> zcApiPageInfo = zcSetMealService.queryByPage(page, size, zcSetMeal);
                returnObject.put("data", zcApiPageInfo);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 新增信息
     */
    @RequestMapping("/add")
    public Map<String, Object> add(ZcSetMeal zcSetMeal) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                zcSetMeal.setUserId(zcUser.getId());
                Long id = zcSetMealService.insertZcSetMeal(zcSetMeal);
                if (null != id) {
                    returnObject.put("id", id);
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 更新信息
     */
    @RequestMapping("/update")
    public Map<String, Object> update(ZcSetMeal zcSetMeal) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                int i = zcSetMealService.updateZcSetMeal(zcSetMeal);
                if (i != 0) {
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }
}
