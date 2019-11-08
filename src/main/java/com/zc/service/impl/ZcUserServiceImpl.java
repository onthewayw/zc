package com.zc.service.impl;

import com.zc.bean.ZcUser;
import com.zc.service.ZcUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcUserServiceImpl implements ZcUserService {
    @Override
    public int insertZcUser(ZcUser object) {
        return 0;
    }

    @Override
    public int updateZcUser(ZcUser object) {
        return 0;
    }

    @Override
    public int update(ZcUser.UpdateBuilder object) {
        return 0;
    }

    @Override
    public List<ZcUser> queryZcUser(ZcUser object) {
        return null;
    }

    @Override
    public ZcUser queryZcUserLimit1(ZcUser object) {
        return null;
    }
}
