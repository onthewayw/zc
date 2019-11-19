package com.zc.mapper;

import java.util.List;

import com.zc.bean.ZcBalance;

/**
*  @author author
*/
public interface ZcBalanceMapper {

    int insertZcBalance(ZcBalance object);

    int updateZcBalance(ZcBalance object);

    List<ZcBalance> queryZcBalance(ZcBalance object);
}