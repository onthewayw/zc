package com.zc.mapper.base;

import java.util.List;

import com.zc.bean.ZcCashOutRecord;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ZcCashOutRecordBaseMapper {

    int insertZcCashOutRecord(ZcCashOutRecord object);

    int updateZcCashOutRecord(ZcCashOutRecord object);

    List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object);

}