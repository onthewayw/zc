package com.zc.service;

import com.zc.bean.ZcCardManage;

import java.util.List;

public interface ZcCardManageService {
    int insertZcCardManage(ZcCardManage object);

    int updateZcCardManage(ZcCardManage object);

    int update(ZcCardManage.UpdateBuilder object);

    List<ZcCardManage> queryZcCardManage(ZcCardManage object);

    ZcCardManage queryZcCardManageLimit1(ZcCardManage object);
}
