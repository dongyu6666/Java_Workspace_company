package service;

import pojo.IB1_BZD_BasicLei;

import java.util.List;
import java.util.Map;

public interface IB1_BZD_BasicService {
    //查询
    List<IB1_BZD_BasicLei> getIB1_BZD_Basic(Map map);
    List<IB1_BZD_BasicLei> getIB1_BZD_Basic_S42_ATTRIBUTES_ADDED(Map map);
    List<IB1_BZD_BasicLei> getIB1_BZD_Basic_TARGET_DATE(Map map);



}
