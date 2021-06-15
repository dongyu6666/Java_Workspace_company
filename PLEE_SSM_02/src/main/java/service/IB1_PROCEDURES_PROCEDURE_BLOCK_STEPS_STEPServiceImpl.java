package service;


import dao.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper;
import pojo.IB1_PROCEDURES_PROCEDURELei;
import pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei;

import java.util.List;
import java.util.Map;

public class IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPServiceImpl implements IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService {

    //service业务层调dao层：组合Dao
    private IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper;

    //设置set方法


    public void setiB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper) {
        this.iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper;
    }


    public List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(Map map) {
        return iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper.getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(map);
    }

    public List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> getIB1_BLOCK_STEP(Map map) {
        return iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper.getIB1_BLOCK_STEP(map);
    }
}
