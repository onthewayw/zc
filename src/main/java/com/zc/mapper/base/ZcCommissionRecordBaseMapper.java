package com.zc.mapper.base;

import java.util.List;

import com.zc.bean.ZcCommissionRecord;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ZcCommissionRecordBaseMapper {

    int insertZcCommissionRecord(ZcCommissionRecord object);

    int updateZcCommissionRecord(ZcCommissionRecord object);

    int update(ZcCommissionRecord.UpdateBuilder object);

    List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord object);

    ZcCommissionRecord queryZcCommissionRecordLimit1(ZcCommissionRecord object);

}