package com.fawvw.service;

import com.fawvw.dao.IB1_ENVIRONMENT_TRANSPORT_MODEMapper;
import com.fawvw.pojo.IB1_ENVIRONMENT_TRANSPORT_MODELei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_ENVIRONMENT_TRANSPORT_MODEServiceImpl implements IB1_ENVIRONMENT_TRANSPORT_MODEService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_ENVIRONMENT_TRANSPORT_MODEMapper iB1_ENVIRONMENT_TRANSPORT_MODEMapper;

    //设置set方法


    public void setiB1_ENVIRONMENT_TRANSPORT_MODEMapper(IB1_ENVIRONMENT_TRANSPORT_MODEMapper iB1_ENVIRONMENT_TRANSPORT_MODEMapper) {
        this.iB1_ENVIRONMENT_TRANSPORT_MODEMapper = iB1_ENVIRONMENT_TRANSPORT_MODEMapper;
    }

    public List<IB1_ENVIRONMENT_TRANSPORT_MODELei> getIB1_ENVIRONMENT_TRANSPORT_MODE(Map map) {
        return iB1_ENVIRONMENT_TRANSPORT_MODEMapper.getIB1_ENVIRONMENT_TRANSPORT_MODE(map);
    }

    public int deleteIB1_ENVIRONMENT_TRANSPORT_MODE(Map map) {
        return iB1_ENVIRONMENT_TRANSPORT_MODEMapper.deleteIB1_ENVIRONMENT_TRANSPORT_MODE(map);
    }


}
