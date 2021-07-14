package com.fawvw.service;


import com.fawvw.dao.IB1_BZD_BasicMapper;
import com.fawvw.pojo.IB1_BZD_BasicLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_BZD_BasicServiceImpl implements IB1_BZD_BasicService {

    @Autowired
    //service业务层调dao层：组合Dao
    private IB1_BZD_BasicMapper iB1_BZD_BasicMapper;

    //设置set方法

    public void setiB1_BZD_BasicMapper(IB1_BZD_BasicMapper iB1_BZD_BasicMapper) {
        this.iB1_BZD_BasicMapper = iB1_BZD_BasicMapper;
    }

    public List<IB1_BZD_BasicLei> getIB1_BZD_Basic(Map map) {
        return iB1_BZD_BasicMapper.getIB1_BZD_Basic(map);
    }


    public List<IB1_BZD_BasicLei> getIB1_BZD_Basic_S42_ATTRIBUTES_ADDED(Map map) {
        return iB1_BZD_BasicMapper.getIB1_BZD_Basic_S42_ATTRIBUTES_ADDED(map);
    }


    public List<IB1_BZD_BasicLei> getIB1_BZD_Basic_TARGET_DATE(Map map) {
        return iB1_BZD_BasicMapper.getIB1_BZD_Basic_TARGET_DATE(map);
    }

    public int deleteIB1_BZD_Basic(Map map) {
        return iB1_BZD_BasicMapper.deleteIB1_BZD_Basic(map);
    }
}
