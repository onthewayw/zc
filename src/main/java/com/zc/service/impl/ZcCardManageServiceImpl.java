package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcBalance;
import com.zc.bean.ZcCardManage;
import com.zc.mapper.ZcCardManageMapper;
import com.zc.service.ZcCardManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcCardManageServiceImpl implements ZcCardManageService {
    @Autowired(required = false)
    private ZcCardManageMapper zcCardManageMapper;

    @Override
    public int insertZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.insertZcCardManage(object);
    }

    @Override
    public int updateZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.updateZcCardManage(object);
    }

    @Override
    public List<ZcCardManage> queryZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.queryZcCardManage(object);
    }

    @Override
    public PageInfo<ZcCardManage> queryByPage(Integer page, Integer pageSize, ZcCardManage zcCardManage) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcCardManage> zcCardManages = zcCardManageMapper.queryZcCardManage(zcCardManage);
        PageInfo<ZcCardManage> pageInfo = new PageInfo<>(zcCardManages);
        return pageInfo;
    }
}
