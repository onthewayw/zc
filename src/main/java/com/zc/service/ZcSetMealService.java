package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcSetMeal;

import java.util.List;

public interface ZcSetMealService {
    Long insertZcSetMeal(ZcSetMeal object);

    int updateZcSetMeal(ZcSetMeal object);

    List<ZcSetMeal> queryZcSetMeal(ZcSetMeal object);
    /**
     * 分页查询
     * */
    PageInfo<ZcSetMeal> queryByPage(Integer page, Integer pageSize, ZcSetMeal zcSetMeal);
}
