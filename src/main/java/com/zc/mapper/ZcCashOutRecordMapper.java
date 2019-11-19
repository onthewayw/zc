package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcCashOutRecord;
import com.zc.mapper.base.ZcCashOutRecordBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author author
 */
public interface ZcCashOutRecordMapper {

    int insertZcCashOutRecord(ZcCashOutRecord object);

    int updateZcCashOutRecord(ZcCashOutRecord object);

    List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object);
}