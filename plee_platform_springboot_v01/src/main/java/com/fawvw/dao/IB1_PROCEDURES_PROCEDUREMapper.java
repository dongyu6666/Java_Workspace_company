package com.fawvw.dao;

import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURELei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_PROCEDURES_PROCEDUREMapper {
    //查询
    List<IB1_PROCEDURES_PROCEDURELei> getIB1_PROCEDURES_PROCEDURE(Map map);
    List<IB1_PROCEDURES_PROCEDURELei> getIB1_BLOCK_NAME(Map map);

    //List<IB1_PROCEDURES_PROCEDURELei> getIB1_All(Map map);


}
