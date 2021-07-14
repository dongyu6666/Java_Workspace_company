package com.fawvw.dao;


import com.fawvw.pojo.IB1_BZD_BasicLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_BZD_BasicMapper {
    //查询
    List<IB1_BZD_BasicLei> getIB1_BZD_Basic(Map map);
    List<IB1_BZD_BasicLei> getIB1_BZD_Basic_S42_ATTRIBUTES_ADDED(Map map);
    List<IB1_BZD_BasicLei> getIB1_BZD_Basic_TARGET_DATE(Map map);

    int deleteIB1_BZD_Basic(Map map);

}
