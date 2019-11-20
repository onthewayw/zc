package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCashOutRecord;

import java.util.List;

public interface ZcCashOutRecordService {
    Long insertZcCashOutRecord(ZcCashOutRecord object);

    int updateZcCashOutRecord(ZcCashOutRecord object);

    List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object);

    /**
     * 分页查询
     * */
    PageInfo<ZcCashOutRecord> queryByPage(Integer page, Integer pageSize, ZcCashOutRecord zcCashOutRecord);
}
