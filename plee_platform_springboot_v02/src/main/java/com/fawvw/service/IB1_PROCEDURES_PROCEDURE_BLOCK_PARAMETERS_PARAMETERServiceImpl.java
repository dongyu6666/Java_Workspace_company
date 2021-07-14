package com.fawvw.service;

import com.fawvw.dao.IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper;
import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERServiceImpl implements IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper;

    //设置set方法


    public void setiB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper(IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper) {
        this.iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper = iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper;
    }

    public List<IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei> getIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(Map map) {
        return iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper.getIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(map);
    }


    public List<IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei> getIB1_PROCEDURE_BLOCK_All(Map map) {
        return iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper.getIB1_PROCEDURE_BLOCK_All(map);
    }

    public int deleteIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(Map map) {
        return iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERMapper.deleteIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(map);
    }
}