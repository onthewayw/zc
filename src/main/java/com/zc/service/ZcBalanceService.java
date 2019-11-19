package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcBalance;

import java.util.List;

public interface ZcBalanceService {
    int insertZcBalance(ZcBalance object);

    int updateZcBalance(ZcBalance object);

    List<ZcBalance> queryZcBalance(ZcBalance object);

    PageInfo<ZcBalance> queryPageByUserId(Integer page, Integer pageSize,ZcBalance zcBalance);
}
