package com.zc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcBalance;
import com.zc.bean.ZcCardManage;
import com.zc.mapper.ZcCardManageMapper;
import com.zc.service.ZcCardManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ZcCardManageServiceImpl implements ZcCardManageService {
    @Autowired(required = false)
    private ZcCardManageMapper zcCardManageMapper;

    @Override
    public Long insertZcCardManage(ZcCardManage object) {
        zcCardManageMapper.insertZcCardManage(object);
        return object.getId();
    }

    @Override
    public int updateZcCardManage(ZcCardManage object) {
        return zcCardManageMapper.updateZcCardManage(object);
    }

    @Override
    public List<ZcCardManage> queryZcCardManage(ZcCardManage zcCardManage) {
        List<ZcCardManage> zcCardManages = zcCardManageMapper.queryZcCardManage(zcCardManage);
        List<ZcCardManage> records = zcCardManages.stream().peek(card -> {
            card.setAllowanceDecimal(BigDecimal.valueOf(card.getAllowance()));
        }).collect(Collectors.toList());
        return records;
    }

    @Override
    public PageInfo<ZcCardManage> queryByPage(Integer page, Integer pageSize, ZcCardManage zcCardManage) {
        //开启分页查询，写在查询语句上面
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（select）会被分页
        PageHelper.startPage(page, pageSize);
        List<ZcCardManage> zcCardManages = zcCardManageMapper.queryZcCardManage(zcCardManage);
        PageInfo<ZcCardManage> pageInfo = new PageInfo<>(zcCardManages);
        if (null != pageInfo.getList() && pageInfo.getList().size() != 0) {
            List<ZcCardManage> records = pageInfo.getList().stream().peek(card -> {
                card.setAllowanceDecimal(BigDecimal.valueOf(card.getAllowance() / 100));
                card.setUsedTrafficDecimal(BigDecimal.valueOf(card.getUsedTraffic() / 100));
            }).collect(Collectors.toList());
            pageInfo.setList(records);
        }
        return pageInfo;
    }

    @Override
    public ZcCardManage queryByIccid(Long iccid) {
        ZcCardManage zcCardManage = zcCardManageMapper.queryByIccid(iccid);
        zcCardManage.setAllowanceDecimal(BigDecimal.valueOf(zcCardManage.getAllowance() / 100));
        zcCardManage.setUsedTrafficDecimal(BigDecimal.valueOf(zcCardManage.getUsedTraffic() / 100));
        return zcCardManage;
    }
}
