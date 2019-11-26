package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcSetMeal;
import com.zc.mapper.ZcSetMealMapper;
import com.zc.service.ZcSetMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcSetMealServiceImpl implements ZcSetMealService {
    @Autowired(required = false)
    private ZcSetMealMapper zcSetMealMapper;

    @Override
    public Long insertZcSetMeal(ZcSetMeal api) {
        zcSetMealMapper.insertZcSetMeal(api);
        return api.getId();
    }

    @Override
    public int updateZcSetMeal(ZcSetMeal api) {
        return zcSetMealMapper.updateZcSetMeal(api);
    }

    @Override
    public List<ZcSetMeal> queryZcSetMeal(ZcSetMeal api) {
        return zcSetMealMapper.queryZcSetMeal(api);
    }

    @Override
    public PageInfo<ZcSetMeal> queryByPage(Integer page, Integer pageSize, ZcSetMeal zcSetMeal) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcSetMeal> zcSetMeals = zcSetMealMapper.queryZcSetMeal(zcSetMeal);
        PageInfo<ZcSetMeal> zcApiPageInfo = new PageInfo<>(zcSetMeals);
        return zcApiPageInfo;
    }
}