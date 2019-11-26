package com.zc.controller;

import com.zc.bean.ZcApi;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/queryByType")
    public Map<String,Object> queryByType(Integer type){
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            if(null!=type){
                ZcApi zcApi=new ZcApi();
                zcApi.setType(type);
                List<ZcApi> zcApis = zcApiService.queryZcApi(zcApi);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                returnObject.put("data", zcApis);
            }else{
                returnObject.put("message", "请输入type");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnObject;
    }
}
