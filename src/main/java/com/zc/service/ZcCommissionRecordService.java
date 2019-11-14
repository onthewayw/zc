package com.zc.service;

import com.zc.bean.ZcCommissionRecord;

import java.util.List;

public interface ZcCommissionRecordService {
    int insertZcCommissionRecord(ZcCommissionRecord object);

    int updateZcCommissionRecord(ZcCommissionRecord object);

    List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord object);
}
