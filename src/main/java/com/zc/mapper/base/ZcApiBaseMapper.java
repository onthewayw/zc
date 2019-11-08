package com.zc.mapper.base;

import java.util.List;

import com.zc.bean.ZcApi;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ZcApiBaseMapper {

    int insertZcApi(ZcApi object);

    int updateZcApi(ZcApi object);

    int update(ZcApi.UpdateBuilder object);

    List<ZcApi> queryZcApi(ZcApi object);

    ZcApi queryZcApiLimit1(ZcApi object);

}