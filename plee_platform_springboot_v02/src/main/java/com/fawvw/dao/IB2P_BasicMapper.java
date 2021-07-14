package com.fawvw.dao;

import com.fawvw.pojo.IB1_BasicLei;
import com.fawvw.pojo.IB2P_BasicLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB2P_BasicMapper {
    //查询IB1_Basic
    List<IB2P_BasicLei> getIB2P_Basic(Map map);
    List<IB2P_BasicLei> getIB2P_diagnose_adr(Map map);
    List<IB2P_BasicLei> getIB2P_filename(Map map);
    List<IB2P_BasicLei> getIB2P_diagnose_adr_and_IB2P_NAME(Map map);

    int deleteIB2P_Basic(Map map);

    int insertIB2P_Basic(Map map);



}
