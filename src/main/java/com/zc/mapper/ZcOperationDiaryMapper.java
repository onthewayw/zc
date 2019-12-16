package com.zc.mapper;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcOperationDiary;

import java.util.List;

/**
 * @author wangjiangtao
 */
public interface ZcOperationDiaryMapper {
    Long insertZcOperationDiary(ZcOperationDiary diary);

    List<ZcOperationDiary> queryZcOperationDiary(ZcOperationDiary diary);

}
