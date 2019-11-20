package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcCardManage;
/**
 * @author author
 */
public interface ZcCardManageMapper {

    Long insertZcCardManage(ZcCardManage object);

    int updateZcCardManage(ZcCardManage object);

    List<ZcCardManage> queryZcCardManage(ZcCardManage object);
}