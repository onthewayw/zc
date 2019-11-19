package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcUser;
import com.zc.mapper.base.ZcUserBaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author author
 */
public interface ZcUserMapper extends ZcUserBaseMapper {
    int insertZcUser(ZcUser object);

    int updateZcUser(ZcUser object);

    List<ZcUser> queryZcUser(ZcUser object);

    ZcUser queryById(Long id);

    /**
     * 通过手机号码查询用户信息
     */
    ZcUser selectOne(ZcUser zcUser);

    /**
     * 通过条件查找用户列表
     */
    List<ZcUser> queryByList(ZcUser zcUser);
}