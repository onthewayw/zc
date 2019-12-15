package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCashOutRecord;
import com.zc.bean.ZcUser;
import com.zc.constant.SecretConstant;
import com.zc.constant.StatusEnum;
import com.zc.constant.WebUserConstant;
import com.zc.mapper.ZcCashOutRecordMapper;
import com.zc.mapper.ZcUserMapper;
import com.zc.service.ZcCashOutRecordService;
import com.zc.service.ZcUserService;
import com.zc.utils.CodecUtils;
import com.zc.utils.MonthFirstEndDay;
import com.zc.utils.RedisTokenOper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ZcCashOutRecordServiceImpl implements ZcCashOutRecordService {
    @Autowired(required = false)
    private ZcCashOutRecordMapper zcCashOutRecordMapper;

    @Autowired(required = false)
    private ZcUserMapper zcUserMapper;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    @Override
    public Long insertZcCashOutRecord(ZcCashOutRecord object) {
        zcCashOutRecordMapper.insertZcCashOutRecord(object);
        return object.getId();
    }

    @Override
    public int updateZcCashOutRecord(ZcCashOutRecord object) {
        return zcCashOutRecordMapper.updateZcCashOutRecord(object);
    }

    @Override
    public List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord zcCashOutRecord) {
        List<ZcCashOutRecord> zcCashOutRecords = zcCashOutRecordMapper.queryZcCashOutRecord(zcCashOutRecord);
        List<ZcCashOutRecord> records = zcCashOutRecords.stream().peek(record -> {
            record.setCashOutAmountDecimal(BigDecimal.valueOf(record.getCashOutAmount() / 100));
        }).collect(Collectors.toList());
        return records;
    }

    @Override
    public int queryZcCashOutRecordCount(ZcCashOutRecord object) {
        return zcCashOutRecordMapper.queryZcCashOutRecordCount(object);
    }

    @Override
    public PageInfo<ZcCashOutRecord> queryByPage(Integer page, Integer pageSize, ZcCashOutRecord zcCashOutRecord) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcCashOutRecord> zcCashOutRecords = zcCashOutRecordMapper.queryZcCashOutRecord(zcCashOutRecord);

        PageInfo<ZcCashOutRecord> pageInfo = new PageInfo<>(zcCashOutRecords);
        if (null != pageInfo.getList() && pageInfo.getList().size() != 0) {
            List<ZcCashOutRecord> records = pageInfo.getList().stream().peek(record -> {
                record.setCashOutAmountDecimal(BigDecimal.valueOf(record.getCashOutAmount() / 100));
            }).collect(Collectors.toList());
            pageInfo.setList(records);
        }
        return pageInfo;
    }

    @Transactional
    @Override
    public Map<String, Object> withdraw(HttpServletRequest request, ZcCashOutRecord record) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
        ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
        if (null != zcUser) {
            if (StringUtils.isEmpty(record.getCashOutPassword())) {
                returnObject.put("code", StatusEnum.CASH_OUT_CASH_OUT_PWD_EMPTY_ERR.getCode());
                returnObject.put("message", StatusEnum.CASH_OUT_CASH_OUT_PWD_EMPTY_ERR.getName());
                return returnObject;
            }
            //表示更改提现密码  两者不会同时存在，所以这样
            String pwd = CodecUtils.md5Hex(zcUser.getCashOutPwd(), SecretConstant.SLAT);
            ZcUser zcUser1 = zcUserMapper.queryById(zcUser.getId());
            if (!pwd.equals(zcUser1.getCashOutPwd())) {
                returnObject.put("code", StatusEnum.CASH_OUT_CASH_OUT_PWD_ERR.getCode());
                returnObject.put("message", StatusEnum.CASH_OUT_CASH_OUT_PWD_ERR.getName());
                return returnObject;
            }
            zcUser = zcUserMapper.queryById(zcUser.getId());
            if (0 >= record.getCashOutAmount()) {
                returnObject.put("code", StatusEnum.CASH_OUT_GREATER_THAN_ZERO_ERR.getCode());
                returnObject.put("message", StatusEnum.CASH_OUT_GREATER_THAN_ZERO_ERR.getName());
                return returnObject;
            }
            if (zcUser.getAccountBalance() < record.getCashOutAmount()) {
                //当前余额要大于等于提现金额
                returnObject.put("code", StatusEnum.CASH_OUT_GREATER_THAN_AMOUNT_ERR.getCode());
                returnObject.put("message", StatusEnum.CASH_OUT_GREATER_THAN_AMOUNT_ERR.getName());
                return returnObject;
            }
            String firstDay = MonthFirstEndDay.getFirstDay();
            String lastDay = MonthFirstEndDay.getLastDay();
            ZcCashOutRecord zcCashOutRecord = new ZcCashOutRecord();
            zcCashOutRecord.setUserId(zcUser.getId());
            zcCashOutRecord.setCreateBeginTimeStr(firstDay);
            zcCashOutRecord.setCreateEndTimeStr(lastDay);
            int count = zcCashOutRecordMapper.queryZcCashOutRecordCount(record);
            if (count > 3) {
                //当前余额要大于等于提现金额
                returnObject.put("code", StatusEnum.CASH_OUT_GREATER_THAN_THREE_ERR.getCode());
                returnObject.put("message", StatusEnum.CASH_OUT_GREATER_THAN_THREE_ERR.getName());
                return returnObject;
            }
            //获取当前用户的金额
            ZcUser user = new ZcUser();
            user.setId(zcUser.getId());
            long remainAmount = zcUser.getAccountBalance() - record.getCashOutAmount();
            if (remainAmount >= 0) {
                user.setAccountBalance(remainAmount);
                int i = zcUserMapper.updateZcUser(user);
                if (i > 0) {
                    record.setUserId(zcUser.getId());
                    record.setRemarkStatus(StatusEnum.CASH_OUT_APPLICATION.getCode());
                    record.setCreateTime(new Date());
                    record.setType(StatusEnum.PAY_ALI.getCode());
                    Long id = zcCashOutRecordMapper.insertZcCashOutRecord(record);
                    if (null != id) {
                        //表示插入成功
                        returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    }
                }
            }
        }
        return returnObject;
    }
}
