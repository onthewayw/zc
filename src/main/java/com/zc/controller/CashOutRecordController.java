package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCashOutRecord;
import com.zc.bean.ZcUser;
import com.zc.constant.StatusEnum;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcCashOutRecordService;
import com.zc.utils.MonthFirstEndDay;
import com.zc.utils.RedisTokenOper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangjiangtao
 */
@RestController
@RequestMapping("/cashOut")
public class CashOutRecordController {
    @Autowired(required = false)
    private ZcCashOutRecordService zcCashOutRecordService;

    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    /**
     * 查询本月提现了几次
     */
    @RequestMapping("/queryCountMonth")
    public Map<String, Object> queryCountMonth() {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                String firstDay = MonthFirstEndDay.getFirstDay();
                String lastDay = MonthFirstEndDay.getLastDay();
                ZcCashOutRecord record = new ZcCashOutRecord();
                record.setUserId(zcUser.getId());
                record.setCreateBeginTimeStr(firstDay);
                record.setCreateEndTimeStr(lastDay);
                int count = zcCashOutRecordService.queryZcCashOutRecordCount(record);
                returnObject.put("count", count);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                returnObject.put("message", "请求成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 提现
     */
    @RequestMapping("/withdraw")
    public Map<String, Object> withdraw(ZcCashOutRecord record) {
        return zcCashOutRecordService.withdraw(request, record);
    }

    /**
     * 分页查询
     */
    @RequestMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcCashOutRecord record) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                record.setUserId(zcUser.getId());
                PageInfo<ZcCashOutRecord> zcCashOutRecordPageInfo = zcCashOutRecordService.queryByPage(page, size, record);
                returnObject.put("data", zcCashOutRecordPageInfo);
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
    public Map<String, Object> add(ZcCashOutRecord record) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                Long id = zcCashOutRecordService.insertZcCashOutRecord(record);
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
