package com.zc.service.impl;

import com.zc.bean.ZcBalance;
import com.zc.mapper.ZcBalanceMapper;
import com.zc.service.ZcBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcBalanceServiceImpl implements ZcBalanceService {
    @Autowired(required = false)
    private ZcBalanceMapper zcBalanceMapper;

    @Override
    public int insertZcBalance(ZcBalance object) {
        return zcBalanceMapper.insertZcBalance(object);
    }

    @Override
    public int updateZcBalance(ZcBalance object) {
        return zcBalanceMapper.updateZcBalance(object);
    }

    @Override
    public List<ZcBalance> queryZcBalance(ZcBalance object) {
        return zcBalanceMapper.queryZcBalance(object);
    }
}
