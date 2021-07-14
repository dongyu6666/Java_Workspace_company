package com.fawvw.dao;

import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper {
    //查询IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei> getIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(Map map);
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei> getIB1_PROCEDURE_BLOCK_All(Map map);

    int deleteIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(Map map);

}
