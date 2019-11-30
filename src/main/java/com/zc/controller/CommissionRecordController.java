package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCommissionRecord;
import com.zc.bean.ZcUser;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcCommissionRecordService;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjiangtao
 */
@RestController
@RequestMapping("/commission")
public class CommissionRecordController {
    @Autowired(required = false)
    private ZcCommissionRecordService commissionRecordService;

    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    /**
     * 分页查询
     */
    @RequestMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcCommissionRecord commissionRecord) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                commissionRecord.setUserId(zcUser.getId());
                PageInfo<ZcCommissionRecord> pageInfo = commissionRecordService.queryByPage(page, size, commissionRecord);
                returnObject.put("data", pageInfo);
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
    @RequestMapping("/add")
    public Map<String, Object> add(ZcCommissionRecord commissionRecord) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                commissionRecord.setUserId(zcUser.getId());
                Long id = commissionRecordService.insertZcCommissionRecord(commissionRecord);
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
}
