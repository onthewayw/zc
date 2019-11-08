package com.zc.mapper.base;

import java.util.List;

import com.zc.bean.ZcUser;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ZcUserBaseMapper {

    int insertZcUser(ZcUser object);

    int updateZcUser(ZcUser object);

    int update(ZcUser.UpdateBuilder object);

    List<ZcUser> queryZcUser(ZcUser object);

    ZcUser queryZcUserLimit1(ZcUser object);

}