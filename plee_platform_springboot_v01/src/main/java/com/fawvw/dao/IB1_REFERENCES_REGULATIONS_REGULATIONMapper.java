package com.fawvw.dao;

import com.fawvw.pojo.IB1_REFERENCES_REGULATIONS_REGULATIONLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_REFERENCES_REGULATIONS_REGULATIONMapper {
    //查询
    List<IB1_REFERENCES_REGULATIONS_REGULATIONLei> getIB1_REFERENCES_REGULATIONS_REGULATION(Map map);



}
