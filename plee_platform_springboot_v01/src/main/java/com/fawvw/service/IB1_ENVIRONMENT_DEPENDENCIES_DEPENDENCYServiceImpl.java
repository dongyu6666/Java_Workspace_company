package com.fawvw.service;

import com.fawvw.dao.IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
@Transactional
public class IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYServiceImpl implements IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService {

    @Autowired
    //service业务层调dao层：组合Dao
    private IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper;

    //设置set方法


    public void setiB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper) {
        this.iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper = iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper;
    }

    public List<IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei> getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(Map map) {
        return iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper.getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(map);
    }
}
