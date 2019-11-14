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
    public int insertZcCashOutRecord(ZcCashOutRecord object) {
        return zcCashOutRecordMapper.insertZcCashOutRecord(object);
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
