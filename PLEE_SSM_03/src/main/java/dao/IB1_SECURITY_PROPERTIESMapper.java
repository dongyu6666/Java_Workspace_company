package dao;

import pojo.IB1_SECURITY_PROPERTIESLei;

import java.util.List;
import java.util.Map;

public interface IB1_SECURITY_PROPERTIESMapper {
    //查询
    List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES(Map map);
    List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES_NAME(Map map);
    List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES_NAME_AND_ID(Map map);



}
