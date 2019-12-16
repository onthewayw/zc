package com.zc.service;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcOperationDiary;

import java.util.List;

/**
 * @author wangjiangtao
 */
public interface ZcOperationDiaryService {
    Long insertZcOperationDiary(ZcOperationDiary diary);

    List<ZcOperationDiary> queryZcOperationDiary(ZcOperationDiary diary);

    PageInfo<ZcOperationDiary> queryByPage(Integer page, Integer pageSize, ZcOperationDiary diary);

}
