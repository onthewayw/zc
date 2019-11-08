package com.zc.mapper.base;

import java.util.List;

import com.zc.bean.ZcBalance;
import org.apache.ibatis.annotations.Param;
/**
*  @author author
*/
public interface ZcBalanceBaseMapper {

    int insertZcBalance(ZcBalance object);

    int updateZcBalance(ZcBalance object);

    int update(ZcBalance.UpdateBuilder object);

    List<ZcBalance> queryZcBalance(ZcBalance object);

    ZcBalance queryZcBalanceLimit1(ZcBalance object);

}