package com.zc.service.impl;

import com.zc.bean.ZcApi;
import com.zc.mapper.ZcApiMapper;
import com.zc.service.ZcApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcApiServiceImpl implements ZcApiService {
    @Autowired(required = false)
    private ZcApiMapper zcApiMapper;

    @Override
    public int insertZcApi(ZcApi api) {
        return zcApiMapper.insertZcApi(api);
    }

    @Override
    public int updateZcApi(ZcApi api) {
        return zcApiMapper.updateZcApi(api);
    }

    @Override
    public List<ZcApi> queryZcApi(ZcApi api) {
        return zcApiMapper.queryZcApi(api);
    }
}