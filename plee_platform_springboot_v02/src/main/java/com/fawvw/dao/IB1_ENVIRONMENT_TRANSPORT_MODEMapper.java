package com.fawvw.dao;

import com.fawvw.pojo.IB1_ENVIRONMENT_TRANSPORT_MODELei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_ENVIRONMENT_TRANSPORT_MODEMapper {
    //查询IB1_Basic
    List<IB1_ENVIRONMENT_TRANSPORT_MODELei> getIB1_ENVIRONMENT_TRANSPORT_MODE(Map map);

    int deleteIB1_ENVIRONMENT_TRANSPORT_MODE(Map map);


}
