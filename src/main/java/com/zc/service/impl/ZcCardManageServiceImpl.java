package com.zc.service.impl;

import com.zc.bean.ZcCardManage;
import com.zc.mapper.ZcCardManageMapper;
import com.zc.service.ZcCardManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcCardManageServiceImpl implements ZcCardManageService {
    @Autowired(required = false)
    private ZcCardManageMapper zcCardManageMapper;

    @Override
    public int insertZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.insertZcCardManage(object);
    }

    @Override
    public int updateZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.updateZcCardManage(object);
    }

    @Override
    public List<ZcCardManage> queryZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.queryZcCardManage(object);
    }
}
