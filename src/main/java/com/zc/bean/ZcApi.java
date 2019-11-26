package com.zc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZcApi {
    private Long id;
    private String apiName;
    /**
     * 类型  1联通卡  2移动卡  3电信卡
     */
    private Integer type;
}
