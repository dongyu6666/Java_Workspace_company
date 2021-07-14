package com.fawvw.service;

import com.fawvw.dao.IB1_DIAG_INFOS_DIAG_INFOMapper;
import com.fawvw.dao.IB1_DOC_INFO_CONTACTSMapper;
import com.fawvw.pojo.IB1_DIAG_INFOS_DIAG_INFOLei;
import com.fawvw.pojo.IB1_DOC_INFO_CONTACTSLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_DIAG_INFOS_DIAG_INFOServiceImpl implements IB1_DIAG_INFOS_DIAG_INFOService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_DIAG_INFOS_DIAG_INFOMapper iB1_DIAG_INFOS_DIAG_INFOMapper;

    //设置set方法


    public void setiB1_DOC_INFO_CONTACTSMapper(IB1_DOC_INFO_CONTACTSMapper iB1_DOC_INFO_CONTACTSMapper) {
        this.iB1_DIAG_INFOS_DIAG_INFOMapper = iB1_DIAG_INFOS_DIAG_INFOMapper;
    }



    public List<IB1_DIAG_INFOS_DIAG_INFOLei> getIB1_DIAG_INFOS_DIAG_INFO(Map map) {
        return iB1_DIAG_INFOS_DIAG_INFOMapper.getIB1_DIAG_INFOS_DIAG_INFO(map);
    }
}
