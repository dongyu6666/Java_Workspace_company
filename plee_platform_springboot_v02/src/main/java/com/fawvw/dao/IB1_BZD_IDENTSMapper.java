package com.fawvw.dao;


import com.fawvw.pojo.IB1_BZD_IDENTSLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_BZD_IDENTSMapper {
    //查询
    List<IB1_BZD_IDENTSLei> getIB1_BZD_IDENTS(Map map);
    List<IB1_BZD_IDENTSLei> getIB1_BZD_TARGET_DATE(Map map);
    List<IB1_BZD_IDENTSLei> getIB1_BZD_S42_ATTRIBUTES_ADDED(Map map);
    List<IB1_BZD_IDENTSLei> getIB1_BZD_IDENTS_DESC(Map map);

    int deleteIB1_BZD_IDENTS(Map map);


}
