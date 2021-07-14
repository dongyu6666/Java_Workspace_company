package com.fawvw.service;

import com.fawvw.dao.IB1_DOC_INFO_CONTACTSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_DOC_INFO_CONTACTSLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
@Transactional
public class IB1_DOC_INFO_CONTACTSServiceImpl implements IB1_DOC_INFO_CONTACTSService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_DOC_INFO_CONTACTSMapper iB1_DOC_INFO_CONTACTSMapper;

    //设置set方法


    public void setiB1_DOC_INFO_CONTACTSMapper(IB1_DOC_INFO_CONTACTSMapper iB1_DOC_INFO_CONTACTSMapper) {
        this.iB1_DOC_INFO_CONTACTSMapper = iB1_DOC_INFO_CONTACTSMapper;
    }



    public List<IB1_DOC_INFO_CONTACTSLei> getIB1_DOC_INFO_CONTACTS(Map map) {
        return iB1_DOC_INFO_CONTACTSMapper.getIB1_DOC_INFO_CONTACTS(map);
    }


}
