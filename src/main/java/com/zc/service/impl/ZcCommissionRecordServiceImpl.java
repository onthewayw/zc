package com.zc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCommissionRecord;
import com.zc.mapper.ZcCommissionRecordMapper;
import com.zc.service.ZcCommissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ZcCommissionRecordServiceImpl implements ZcCommissionRecordService {
    @Autowired(required = false)
    private ZcCommissionRecordMapper zcCommissionRecordMapper;

    @Override
    public Long insertZcCommissionRecord(ZcCommissionRecord object) {
        zcCommissionRecordMapper.insertZcCommissionRecord(object);
        return object.getId();
    }

    @Override
    public int updateZcCommissionRecord(ZcCommissionRecord object) {
        return zcCommissionRecordMapper.updateZcCommissionRecord(object);
    }

    @Override
    public List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord zcCommissionRecord) {
        List<ZcCommissionRecord> zcCommissionRecords = zcCommissionRecordMapper.queryZcCommissionRecord(zcCommissionRecord);
        List<ZcCommissionRecord> records = zcCommissionRecords.stream().peek(record -> {
            record.setChangeAmountDecimal(BigDecimal.valueOf(record.getChangeAmount() / 100));
            record.setChangeAfterAmountDecimal(BigDecimal.valueOf(record.getChangeAfterAmount() / 100));
        }).collect(Collectors.toList());
        return records;
    }

    @Override
    public PageInfo<ZcCommissionRecord> queryByPage(Integer page, Integer pageSize, ZcCommissionRecord zcCommissionRecord) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcCommissionRecord> zcCommissionRecords = zcCommissionRecordMapper.queryZcCommissionRecord(zcCommissionRecord);
        List<ZcCommissionRecord> records = zcCommissionRecords.stream().peek(record -> {
            record.setChangeAmountDecimal(BigDecimal.valueOf(record.getChangeAmount() / 100));
            record.setChangeAfterAmountDecimal(BigDecimal.valueOf(record.getChangeAfterAmount() / 100));
        }).collect(Collectors.toList());
        PageInfo<ZcCommissionRecord> pageInfo = new PageInfo<>(records);
        return pageInfo;
    }

}
