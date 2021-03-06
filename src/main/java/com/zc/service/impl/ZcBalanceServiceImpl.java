package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcBalance;
import com.zc.mapper.ZcBalanceMapper;
import com.zc.service.ZcBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        List<ZcBalance> zcBalances = zcBalanceMapper.queryZcBalance(object);
        List<ZcBalance> balances = zcBalances.stream().peek(balance -> {
            balance.setAmountDecimal(BigDecimal.valueOf(balance.getAmount() / 100));
            balance.setBalanceAfterChangeDecimal(BigDecimal.valueOf(balance.getBalanceAfterChange() / 100));
        }).collect(Collectors.toList());
        return balances;
    }

    @Override
    public PageInfo<ZcBalance> queryPageByUserId(Integer page, Integer pageSize, ZcBalance zcBalance) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcBalance> zcBalances = zcBalanceMapper.queryZcBalance(zcBalance);
        PageInfo<ZcBalance> pageInfo = new PageInfo<>(zcBalances);
        if (null != pageInfo.getList() && pageInfo.getList().size() != 0) {
            List<ZcBalance> balances = pageInfo.getList().stream().peek(balance -> {
                balance.setAmountDecimal(BigDecimal.valueOf(balance.getAmount() / 100));
                balance.setBalanceAfterChangeDecimal(BigDecimal.valueOf(balance.getBalanceAfterChange() / 100));
            }).collect(Collectors.toList());
            pageInfo.setList(balances);
        }
        return pageInfo;
    }
}
