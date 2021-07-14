package com.fawvw.service;

import com.fawvw.dao.IB1_IB_DESCRIPTION_OBJECTIVESMapper;
import com.fawvw.pojo.IB1_IB_DESCRIPTION_OBJECTIVESLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_IB_DESCRIPTION_OBJECTIVESServiceImpl implements IB1_IB_DESCRIPTION_OBJECTIVESService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_IB_DESCRIPTION_OBJECTIVESMapper iB1_IB_DESCRIPTION_OBJECTIVESMapper;

    //设置set方法


    public void setiB1_IB_DESCRIPTION_OBJECTIVESMapper(IB1_IB_DESCRIPTION_OBJECTIVESMapper iB1_IB_DESCRIPTION_OBJECTIVESMapper) {
        this.iB1_IB_DESCRIPTION_OBJECTIVESMapper = iB1_IB_DESCRIPTION_OBJECTIVESMapper;
    }

    public List<IB1_IB_DESCRIPTION_OBJECTIVESLei> getIB1_IB_DESCRIPTION_OBJECTIVES(Map map) {
        return iB1_IB_DESCRIPTION_OBJECTIVESMapper.getIB1_IB_DESCRIPTION_OBJECTIVES(map);
    }


    public int deleteIB1_IB_DESCRIPTION_OBJECTIVES(Map map) {
        return iB1_IB_DESCRIPTION_OBJECTIVESMapper.deleteIB1_IB_DESCRIPTION_OBJECTIVES(map);
    }


}
