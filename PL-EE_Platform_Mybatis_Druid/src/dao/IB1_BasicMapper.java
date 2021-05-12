package dao;

import pojo.IB1_BasicLei;

import java.util.List;
import java.util.Map;

public interface IB1_BasicMapper {
    //查询IB1_Basic
    List<IB1_BasicLei> getIB1_Basic(Map map);
    List<IB1_BasicLei> getIB1_diagnose_adr(Map map);
    List<IB1_BasicLei> getIB1_filename(Map map);
    List<IB1_BasicLei> getIB1_diagnose_adr_and_IB1_NAME(Map map);



}
