package com.fawvw.service;


import com.fawvw.dao.IB1_BZD_IDENTSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_BZD_IDENTSLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_BZD_IDENTSServiceImpl implements IB1_BZD_IDENTSService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_BZD_IDENTSMapper iB1_BZD_IDENTSMapper;

    //设置set方法

    public void setiB1_BZD_IDENTSMapper(IB1_BZD_IDENTSMapper iB1_BZD_IDENTSMapper) {
        this.iB1_BZD_IDENTSMapper = iB1_BZD_IDENTSMapper;
    }


    public List<IB1_BZD_IDENTSLei> getIB1_BZD_IDENTS(Map map) {
        return iB1_BZD_IDENTSMapper.getIB1_BZD_IDENTS(map);
    }

    public List<IB1_BZD_IDENTSLei> getIB1_BZD_TARGET_DATE(Map map) {
        return iB1_BZD_IDENTSMapper.getIB1_BZD_TARGET_DATE(map);
    }

    public List<IB1_BZD_IDENTSLei> getIB1_BZD_S42_ATTRIBUTES_ADDED(Map map) {
        return iB1_BZD_IDENTSMapper.getIB1_BZD_S42_ATTRIBUTES_ADDED(map);
    }

    public List<IB1_BZD_IDENTSLei> getIB1_BZD_IDENTS_DESC(Map map) {
        return iB1_BZD_IDENTSMapper.getIB1_BZD_IDENTS_DESC(map);
    }
}
