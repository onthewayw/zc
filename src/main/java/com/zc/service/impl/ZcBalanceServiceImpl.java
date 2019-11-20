package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public Long insertZcBalance(ZcBalance object) {
         zcBalanceMapper.insertZcBalance(object);
        return object.getId();
    }

    @Override
    public int updateZcBalance(ZcBalance object) {
        return zcBalanceMapper.updateZcBalance(object);
    }

    @Override
    public List<ZcBalance> queryZcBalance(ZcBalance object) {
        return zcBalanceMapper.queryZcBalance(object);
    }

    @Override
    public PageInfo<ZcBalance> queryPageByUserId(Integer page, Integer pageSize, ZcBalance zcBalance) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcBalance> zcBalances = zcBalanceMapper.queryZcBalance(zcBalance);
        PageInfo<ZcBalance> pageInfo = new PageInfo<>(zcBalances);
        return pageInfo;
    }
}
