package com.fawvw.service;

import com.fawvw.dao.IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONServiceImpl implements IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper;

    //设置set方法


    public void setiB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper) {
        this.iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper = iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper;
    }

    public List<IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei> getIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(Map map) {
        return iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper.getIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(map);
    }
}
