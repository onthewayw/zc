package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcCommissionRecord;

/**
 * @author author
 */
public interface ZcCommissionRecordMapper {

    int insertZcCommissionRecord(ZcCommissionRecord object);

    int updateZcCommissionRecord(ZcCommissionRecord object);

    List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord object);
}