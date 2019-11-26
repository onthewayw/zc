package com.zc.service.impl;

import com.zc.bean.ZcApi;
import com.zc.mapper.ZcApiMapper;
import com.zc.service.ZcApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangjiangtao
 */
@Service
public class ZcApiServiceImpl implements ZcApiService {
    @Autowired(required = false)
    private ZcApiMapper zcApiMapper;

    @Override
    public Long insertZcApi(ZcApi object) {
        return zcApiMapper.insertZcApi(object);
    }

    @Override
    public int updateZcApi(ZcApi object) {
        return zcApiMapper.updateZcApi(object);
    }

    @Override
    public List<ZcApi> queryZcApi(ZcApi object) {
        return zcApiMapper.queryZcApi(object);
    }
}
