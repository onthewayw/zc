package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCashOutRecord;
import com.zc.mapper.ZcCashOutRecordMapper;
import com.zc.service.ZcCashOutRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcCashOutRecordServiceImpl implements ZcCashOutRecordService {
    @Autowired(required = false)
    private ZcCashOutRecordMapper zcCashOutRecordMapper;

    @Override
    public Long insertZcCashOutRecord(ZcCashOutRecord object) {
        zcCashOutRecordMapper.insertZcCashOutRecord(object);
        return object.getId();
    }

    @Override
    public int updateZcCashOutRecord(ZcCashOutRecord object) {
        return zcCashOutRecordMapper.updateZcCashOutRecord(object);
    }
    @Override
    public List<ZcCashOutRecord> queryZcCashOutRecord(ZcCashOutRecord object) {
        return zcCashOutRecordMapper.queryZcCashOutRecord(object);
    }

    @Override
    public PageInfo<ZcCashOutRecord> queryByPage(Integer page, Integer pageSize, ZcCashOutRecord zcCashOutRecord) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcCashOutRecord> zcCashOutRecords = zcCashOutRecordMapper.queryZcCashOutRecord(zcCashOutRecord);
        PageInfo<ZcCashOutRecord> zcCashOutRecordPageInfo = new PageInfo<>(zcCashOutRecords);
        return zcCashOutRecordPageInfo;
    }

}
