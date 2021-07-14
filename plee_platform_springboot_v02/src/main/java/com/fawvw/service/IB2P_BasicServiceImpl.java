package com.fawvw.service;


import com.fawvw.dao.IB2P_BasicMapper;
import com.fawvw.pojo.IB2P_BasicLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB2P_BasicServiceImpl implements IB2P_BasicService {

    @Autowired
    //service业务层调dao层：组合Dao
    private IB2P_BasicMapper iB2P_BasicMapper;

    //设置set方法
    public void setiB2P_BasicMapper(IB2P_BasicMapper iB2P_BasicMapper) {
        this.iB2P_BasicMapper = iB2P_BasicMapper;
    }



    public List<IB2P_BasicLei> getIB2P_Basic(Map map) {
        return iB2P_BasicMapper.getIB2P_Basic(map);
    }


    public List<IB2P_BasicLei> getIB2P_diagnose_adr(Map map) {
        return iB2P_BasicMapper.getIB2P_diagnose_adr(map);
    }


    public List<IB2P_BasicLei> getIB2P_filename(Map map) {
        return iB2P_BasicMapper.getIB2P_filename(map);
    }


    public List<IB2P_BasicLei> getIB2P_diagnose_adr_and_IB2P_NAME(Map map) {
        return iB2P_BasicMapper.getIB2P_diagnose_adr_and_IB2P_NAME(map);
    }

    public int deleteIB2P_Basic(Map map) {
        return iB2P_BasicMapper.deleteIB2P_Basic(map);
    }


    public int insertIB2P_Basic(Map map) {
        return iB2P_BasicMapper.insertIB2P_Basic(map);
    }


}
