package dao;

import pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei;

import java.util.List;
import java.util.Map;

public interface IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper {
    //查询IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(Map map);
    List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> getIB1_BLOCK_STEP(Map map);

}