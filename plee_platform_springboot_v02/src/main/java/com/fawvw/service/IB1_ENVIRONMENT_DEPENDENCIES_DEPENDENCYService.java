package com.fawvw.service;

import com.fawvw.pojo.IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei;

import java.util.List;
import java.util.Map;

public interface IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService {
    //查询IB1_Basic
    List<IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei> getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(Map map);

    int deleteIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(Map map);


}
