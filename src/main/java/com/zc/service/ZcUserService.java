package com.zc.service;

import com.zc.bean.ZcUser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface ZcUserService {
    Long insertZcUser(ZcUser object);

    int updateZcUser(ZcUser object);


    List<ZcUser> queryZcUser(ZcUser object);


    ZcUser queryById(Long id);

    /**
     * 根据用户名和密码查找用户
     * */
    Map<String, Object> login(String phonenum, String password, HttpServletRequest request);
}
