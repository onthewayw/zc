package com.zc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcOperationDiary {
    private Long id;

    /**
     * 用户Id
     * */
    private Long userId;

    /**
     * 备注
     * */
    private String remark;

    /**
     * 创建时间
     * */
    private Date createTime;
}
