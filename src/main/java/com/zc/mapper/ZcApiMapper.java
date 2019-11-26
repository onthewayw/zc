package com.zc.mapper;

import com.zc.bean.ZcApi;

import java.util.List;

/**
 * @author wangjiangtao
 */
public interface ZcApiMapper {
    Long insertZcApi(ZcApi object);

    int updateZcApi(ZcApi object);

    List<ZcApi> queryZcApi(ZcApi object);
}
