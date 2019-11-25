package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcSetMeal;

import java.util.List;

public interface ZcSetMealService {
    Long insertZcApi(ZcSetMeal object);

    int updateZcApi(ZcSetMeal object);

    List<ZcSetMeal> queryZcApi(ZcSetMeal object);
    /**
     * 分页查询
     * */
    PageInfo<ZcSetMeal> queryByPage(Integer page, Integer pageSize, ZcSetMeal zcSetMeal);
}
