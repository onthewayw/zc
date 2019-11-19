package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcApi;

/**
 * @author author
 */
public interface ZcApiMapper {

    int insertZcApi(ZcApi object);

    int updateZcApi(ZcApi object);

    List<ZcApi> queryZcApi(ZcApi object);

}