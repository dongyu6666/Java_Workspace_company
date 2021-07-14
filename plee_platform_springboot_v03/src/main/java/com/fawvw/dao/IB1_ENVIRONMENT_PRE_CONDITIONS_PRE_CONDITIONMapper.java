package com.fawvw.dao;

import com.fawvw.pojo.IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper {
    //查询IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION
    List<IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei> getIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(Map map);

    int deleteIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(Map map);


}
