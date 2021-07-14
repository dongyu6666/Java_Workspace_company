package com.fawvw.service;

import com.fawvw.dao.IB1_PROCEDURES_PROCEDUREMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURELei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_PROCEDURES_PROCEDUREServiceImpl implements IB1_PROCEDURES_PROCEDUREService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_PROCEDURES_PROCEDUREMapper iB1_PROCEDURES_PROCEDUREMapper;

    //设置set方法
    public void setiB1_PROCEDURES_PROCEDUREMapper(IB1_PROCEDURES_PROCEDUREMapper iB1_PROCEDURES_PROCEDUREMapper) {
        this.iB1_PROCEDURES_PROCEDUREMapper = iB1_PROCEDURES_PROCEDUREMapper;
    }



    public List<IB1_PROCEDURES_PROCEDURELei> getIB1_PROCEDURES_PROCEDURE(Map map) {
        return iB1_PROCEDURES_PROCEDUREMapper.getIB1_PROCEDURES_PROCEDURE(map);
    }


    public List<IB1_PROCEDURES_PROCEDURELei> getIB1_BLOCK_NAME(Map map) {
        return iB1_PROCEDURES_PROCEDUREMapper.getIB1_BLOCK_NAME(map);
    }
}
