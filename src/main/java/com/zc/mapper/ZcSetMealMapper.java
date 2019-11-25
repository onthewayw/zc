package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcSetMeal;

/**
 * @author author
 */
public interface ZcSetMealMapper {

    Long insertZcSetMeal(ZcSetMeal object);

    int updateZcSetMeal(ZcSetMeal object);

    List<ZcSetMeal> queryZcSetMeal(ZcSetMeal object);

}