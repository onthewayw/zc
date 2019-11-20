package com.zc.service.impl;

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

}
