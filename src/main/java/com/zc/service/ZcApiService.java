package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcApi;

import java.util.List;

public interface ZcApiService {
    Long insertZcApi(ZcApi object);

    int updateZcApi(ZcApi object);

    List<ZcApi> queryZcApi(ZcApi object);
    /**
     * 分页查询
     * */
    PageInfo<ZcApi> queryByPage(Integer page, Integer pageSize, ZcApi zcApi);
}
