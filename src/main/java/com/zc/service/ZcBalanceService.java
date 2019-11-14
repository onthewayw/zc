package com.zc.service;

import com.zc.bean.ZcBalance;

import java.util.List;

public interface ZcBalanceService {
    int insertZcBalance(ZcBalance object);

    int updateZcBalance(ZcBalance object);

    List<ZcBalance> queryZcBalance(ZcBalance object);
}
