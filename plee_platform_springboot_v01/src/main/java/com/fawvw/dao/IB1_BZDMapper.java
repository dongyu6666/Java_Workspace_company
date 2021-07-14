package com.fawvw.dao;

import com.fawvw.pojo.IB1_BZDLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_BZDMapper {
    //查询IB1_Basic
    List<IB1_BZDLei> getIB1_BZD(Map map);



}
