package com.fawvw.dao;

import com.fawvw.pojo.IB1_TNRLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_TNRMapper {
    //查询IB1_Basic
    List<IB1_TNRLei> getIB1_TNR(Map map);

    int deleteIB1_TNR(Map map);

}
