package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Long insertZcApi(ZcApi api) {
        zcApiMapper.insertZcApi(api);
        return api.getId();
    }

    @Override
    public int updateZcApi(ZcApi api) {
        return zcApiMapper.updateZcApi(api);
    }

    @Override
    public List<ZcApi> queryZcApi(ZcApi api) {
        return zcApiMapper.queryZcApi(api);
    }

    @Override
    public PageInfo<ZcApi> queryByPage(Integer page, Integer pageSize, ZcApi zcApi) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcApi> zcApis = zcApiMapper.queryZcApi(zcApi);
        PageInfo<ZcApi> zcApiPageInfo = new PageInfo<>(zcApis);
        return zcApiPageInfo;
    }
}