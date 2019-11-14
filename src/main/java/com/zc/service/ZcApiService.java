package com.zc.service;

import com.zc.bean.ZcApi;

import java.util.List;

public interface ZcApiService {
    int insertZcApi(ZcApi object);

    int updateZcApi(ZcApi object);

    List<ZcApi> queryZcApi(ZcApi object);
}
