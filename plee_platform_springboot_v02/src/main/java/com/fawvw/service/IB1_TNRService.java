package com.fawvw.service;

import com.fawvw.pojo.IB1_TNRLei;

import java.util.List;
import java.util.Map;

public interface IB1_TNRService {
    //查询IB1_Basic
    List<IB1_TNRLei> getIB1_TNR(Map map);

    int deleteIB1_TNR(Map map);


}
