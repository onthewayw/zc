package com.zc.service.impl;

import com.zc.bean.ZcUser;
import com.zc.mapper.ZcUserMapper;
import com.zc.service.ZcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcUserServiceImpl implements ZcUserService {
    @Autowired(required = false)
    private ZcUserMapper zcUserMapper;

    @Override
    public int insertZcUser(ZcUser object) {
        return zcUserMapper.insertZcUser(object);
    }

    @Override
    public int updateZcUser(ZcUser object) {
        return zcUserMapper.updateZcUser(object);
    }

    @Override
    public int update(ZcUser.UpdateBuilder object) {
        return zcUserMapper.update(object);
    }

    @Override
    public List<ZcUser> queryZcUser(ZcUser object) {
        return zcUserMapper.queryZcUser(object);
    }

    @Override
    public ZcUser queryZcUserLimit1(ZcUser object) {
        return zcUserMapper.queryZcUserLimit1(object);
    }

    @Override
    public ZcUser queryById(Long id) {
        return zcUserMapper.queryById(id);
    }
}
