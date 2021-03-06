package com.fawvw.dao;

import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper {
    //查询全部车型
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS(Map map);
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS_DATA_IDENTIFIER(Map map);
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> getIB1_BLOCK_All(Map map);

}
