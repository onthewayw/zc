package com.zc.service.impl;


import com.zc.bean.ZcCommissionRecord;
import com.zc.mapper.ZcCommissionRecordMapper;
import com.zc.service.ZcCommissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZcCommissionRecordServiceImpl implements ZcCommissionRecordService {
    @Autowired(required = false)
    private ZcCommissionRecordMapper zcCommissionRecordMapper;

    @Override
    public int insertZcCommissionRecord(ZcCommissionRecord object) {
        return zcCommissionRecordMapper.insertZcCommissionRecord(object);
    }

    @Override
    public int updateZcCommissionRecord(ZcCommissionRecord object) {
        return zcCommissionRecordMapper.updateZcCommissionRecord(object);
    }

    @Override
    public List<ZcCommissionRecord> queryZcCommissionRecord(ZcCommissionRecord object) {
        return zcCommissionRecordMapper.queryZcCommissionRecord(object);
    }

}
