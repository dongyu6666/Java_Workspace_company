package com.fawvw.service;

import com.fawvw.pojo.IB1_BasicLei;
import com.fawvw.pojo.IB2P_BasicLei;

import java.util.List;
import java.util.Map;

public interface IB2P_BasicService {
    //查询IB2P_Basic
    List<IB2P_BasicLei> getIB2P_Basic(Map map);
    List<IB2P_BasicLei> getIB2P_diagnose_adr(Map map);
    List<IB2P_BasicLei> getIB2P_filename(Map map);
    List<IB2P_BasicLei> getIB2P_diagnose_adr_and_IB2P_NAME(Map map);

    int deleteIB2P_Basic(Map map);

    int insertIB2P_Basic(Map map);





}
