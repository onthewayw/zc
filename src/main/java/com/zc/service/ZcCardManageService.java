package com.zc.service;

import com.zc.bean.ZcCardManage;

import java.util.List;

public interface ZcCardManageService {
    int insertZcCardManage(ZcCardManage object);

    int updateZcCardManage(ZcCardManage object);

    List<ZcCardManage> queryZcCardManage(ZcCardManage object);
}
