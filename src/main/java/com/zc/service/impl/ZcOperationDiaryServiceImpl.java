package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCardManage;
import com.zc.bean.ZcOperationDiary;
import com.zc.mapper.ZcOperationDiaryMapper;
import com.zc.service.ZcOperationDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangjiangtao
 */
@Service
public class ZcOperationDiaryServiceImpl implements ZcOperationDiaryService {
    @Autowired(required = false)
    private ZcOperationDiaryMapper operationDiaryMapper;

    @Override
    public Long insertZcOperationDiary(ZcOperationDiary diary) {
        return operationDiaryMapper.insertZcOperationDiary(diary);
    }

    @Override
    public List<ZcOperationDiary> queryZcOperationDiary(ZcOperationDiary diary) {
        return operationDiaryMapper.queryZcOperationDiary(diary);
    }

    @Override
    public PageInfo<ZcOperationDiary> queryByPage(Integer page, Integer pageSize, ZcOperationDiary diary) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcOperationDiary> zcOperationDiaries = operationDiaryMapper.queryZcOperationDiary(diary);
        PageInfo<ZcOperationDiary> pageInfo = new PageInfo<>(zcOperationDiaries);
        return pageInfo;
    }
}
