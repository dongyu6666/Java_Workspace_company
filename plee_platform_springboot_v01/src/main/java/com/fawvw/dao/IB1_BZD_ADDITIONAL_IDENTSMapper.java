package com.fawvw.dao;


import com.fawvw.pojo.IB1_BZD_ADDITIONAL_IDENTSLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_BZD_ADDITIONAL_IDENTSMapper {
    //查询
    List<IB1_BZD_ADDITIONAL_IDENTSLei> getIB1_BZD_ADDITIONAL_IDENTS(Map map);
    List<IB1_BZD_ADDITIONAL_IDENTSLei> getIB1_BZD_ADDITIONAL_IDENTS_DESC(Map map);



}
