package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCommissionRecord;

import java.util.List;

public interface ZcCommissionRecordService {
    Long insertZcCommissionRecord(ZcCommissionRecord object);

    int updateZcCommissionRecord(ZcCommissionRecord object);

    List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord object);

    /**
     * 分页查询
     * */
    PageInfo<ZcCommissionRecord> queryByPage(Integer page, Integer pageSize, ZcCommissionRecord zcCommissionRecord);
}
