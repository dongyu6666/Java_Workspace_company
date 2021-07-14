package com.fawvw.service;

import com.fawvw.dao.IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEServiceImpl implements IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper;

    //设置set方法


    public void setiB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper) {
        this.iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper = iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper;
    }

    public List<IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei> getIB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE(Map map) {
        return iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper.getIB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE(map);
    }
}
