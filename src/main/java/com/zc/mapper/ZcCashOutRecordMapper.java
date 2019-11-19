package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcCashOutRecord;

/**
 * @author author
 */
public interface ZcCashOutRecordMapper {

    int insertZcCashOutRecord(ZcCashOutRecord object);

    int updateZcCashOutRecord(ZcCashOutRecord object);

    List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object);
}