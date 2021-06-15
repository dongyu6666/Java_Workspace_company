package service;

import pojo.IB1_PROCEDURES_PROCEDURELei;

import java.util.List;
import java.util.Map;

public interface IB1_PROCEDURES_PROCEDUREService {
    //查询
    List<IB1_PROCEDURES_PROCEDURELei> getIB1_PROCEDURES_PROCEDURE(Map map);
    List<IB1_PROCEDURES_PROCEDURELei> getIB1_BLOCK_NAME(Map map);

    //List<IB1_PROCEDURES_PROCEDURELei> getIB1_All(Map map);


}
