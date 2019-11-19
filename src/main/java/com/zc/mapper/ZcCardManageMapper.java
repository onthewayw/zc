package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcCardManage;
import com.zc.mapper.base.ZcCardManageBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author author
 */
public interface ZcCardManageMapper {

    int insertZcCardManage(ZcCardManage object);

    int updateZcCardManage(ZcCardManage object);

    List<ZcCardManage> queryZcCardManage(ZcCardManage object);
}