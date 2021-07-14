package com.fawvw.dao;

import com.fawvw.pojo.IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper {
    //查询IB1_Basic
    List<IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei> getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(Map map);



}
