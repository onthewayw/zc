package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCashOutRecord;
import com.zc.bean.ZcUser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface ZcCashOutRecordService {
    Long insertZcCashOutRecord(ZcCashOutRecord object);

    int updateZcCashOutRecord(ZcCashOutRecord object);

    List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object);

    /**
     * 分页查询
     * */
    PageInfo<ZcCashOutRecord> queryByPage(Integer page, Integer pageSize, ZcCashOutRecord zcCashOutRecord);

    /**
     * 提现金额
     * */
    Map<String, Object> withdraw(HttpServletRequest request, ZcCashOutRecord record);
}
