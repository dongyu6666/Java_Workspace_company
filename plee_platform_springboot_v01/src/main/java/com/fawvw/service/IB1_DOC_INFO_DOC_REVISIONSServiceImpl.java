package com.fawvw.service;

import com.fawvw.dao.IB1_DOC_INFO_DOC_REVISIONSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_DOC_INFO_DOC_REVISIONSLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_DOC_INFO_DOC_REVISIONSServiceImpl implements IB1_DOC_INFO_DOC_REVISIONSService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_DOC_INFO_DOC_REVISIONSMapper iB1_DOC_INFO_DOC_REVISIONSMapper;

    //设置set方法


    public void setiB1_DOC_INFO_DOC_REVISIONSMapper(IB1_DOC_INFO_DOC_REVISIONSMapper iB1_DOC_INFO_DOC_REVISIONSMapper) {
        this.iB1_DOC_INFO_DOC_REVISIONSMapper = iB1_DOC_INFO_DOC_REVISIONSMapper;
    }


    public List<IB1_DOC_INFO_DOC_REVISIONSLei> getIB1_DOC_INFO_DOC_REVISIONS(Map map) {
        return iB1_DOC_INFO_DOC_REVISIONSMapper.getIB1_DOC_INFO_DOC_REVISIONS(map);
    }
}
