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
public class TelecomApiController {
    @Autowired(required = false)
    private ZcSetMealService zcSetMealService;

    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    /**
     * 通过api 查询套餐
     * */
    @GetMapping("/queryByApiId")
    public Map<String,Object> queryByApiId(Long apiId){
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            if(null!=apiId){
                ZcSetMeal setMeal=new ZcSetMeal();
                setMeal.setApiId(apiId);
                List<ZcSetMeal> zcSetMeals = zcSetMealService.queryZcSetMeal(setMeal);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                returnObject.put("data", zcSetMeals);
            }else{
                returnObject.put("message", "请输入apiId");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 分页查询
     */
    @GetMapping("/queryByPage")
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
    @PostMapping("/add")
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
    @PostMapping("/update")
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
