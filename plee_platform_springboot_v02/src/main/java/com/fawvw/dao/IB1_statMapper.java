package com.fawvw.dao;

import com.fawvw.pojo.IB1_statLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_statMapper {
    //查询IB1_stat
    List<IB1_statLei> getIB1_stat(Map map);
}
