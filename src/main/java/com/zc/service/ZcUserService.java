package com.zc.service;

import com.zc.bean.ZcUser;

import java.util.List;
import java.util.Map;

public interface ZcUserService {
    int insertZcUser(ZcUser object);

    int updateZcUser(ZcUser object);

    int update(ZcUser.UpdateBuilder object);

    List<ZcUser> queryZcUser(ZcUser object);

    ZcUser queryZcUserLimit1(ZcUser object);

    ZcUser queryById(Long id);

    /**
     * 根据用户名和密码查找用户
     * */
    Map<String, Object> login(String phonenum, String password);
}
