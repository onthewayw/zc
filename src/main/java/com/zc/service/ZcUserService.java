package com.zc.service;

import com.zc.bean.ZcUser;

import java.util.List;

public interface ZcUserService {
    int insertZcUser(ZcUser object);

    int updateZcUser(ZcUser object);

    int update(ZcUser.UpdateBuilder object);

    List<ZcUser> queryZcUser(ZcUser object);

    ZcUser queryZcUserLimit1(ZcUser object);

    ZcUser queryById(Long id);
}
