package com.zc.mapper.base;

import java.util.List;

import com.zc.bean.ZcCardManage;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ZcCardManageBaseMapper {

    int insertZcCardManage(ZcCardManage object);

    int updateZcCardManage(ZcCardManage object);

    List<ZcCardManage> queryZcCardManage(ZcCardManage object);

}