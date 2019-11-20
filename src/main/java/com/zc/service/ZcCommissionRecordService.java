package com.zc.service;

import com.zc.bean.ZcCommissionRecord;

import java.util.List;

public interface ZcCommissionRecordService {
    Long insertZcCommissionRecord(ZcCommissionRecord object);

    int updateZcCommissionRecord(ZcCommissionRecord object);

    List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord object);
}
