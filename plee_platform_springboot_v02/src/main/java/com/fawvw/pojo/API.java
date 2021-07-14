package com.fawvw.pojo;

import com.alibaba.fastjson.JSONArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

//定义接口
public class API {
    private String status;
    private String error;
    private JSONArray para;
    private String info;

    private String para_delete;
    private String para_insert;
    private String para_update;


}
