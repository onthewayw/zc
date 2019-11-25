package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCardManage;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcCardManageService;
import com.zc.utils.RedisTokenOper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 分页查询
     */
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

    /**
     * 新增记录
     */
    @PostMapping("/add")
    public Map<String, Object> addRecord(ZcCardManage zcCardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                zcCardManage.setUserId(zcUser.getId());
                Long id = zcCardManageService.insertZcCardManage(zcCardManage);
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
    public Map<String, Object> updateRecord(ZcCardManage zcCardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                int i = zcCardManageService.updateZcCardManage(zcCardManage);
                if (i != 0) {
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 通过iccid 只有一条
     * */
    @GetMapping("/queryByIccid")
    public Map<String,Object> queryByIccid(String iccid){
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            if(!StringUtils.isEmpty(iccid)){
                ZcCardManage zcCardManage = zcCardManageService.queryByIccid(iccid);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                returnObject.put("data", zcCardManage);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnObject;
    }
}
