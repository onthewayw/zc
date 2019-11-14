package com.zc.service;

import com.zc.bean.ZcCashOutRecord;

import java.util.List;

public interface ZcCashOutRecordService {
    int insertZcCashOutRecord(ZcCashOutRecord object);

    int updateZcCashOutRecord(ZcCashOutRecord object);

    List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object);
}
