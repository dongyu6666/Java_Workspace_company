package service;


import dao.IB1_BZD_ADDITIONAL_IDENTSMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.IB1_BZD_ADDITIONAL_IDENTSLei;


import java.util.List;
import java.util.Map;
@Service
public class IB1_BZD_ADDITIONAL_IDENTSServiceImpl implements IB1_BZD_ADDITIONAL_IDENTSService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_BZD_ADDITIONAL_IDENTSMapper iB1_BZD_ADDITIONAL_IDENTSMapper;

    //设置set方法

    public void setiB1_BZD_ADDITIONAL_IDENTSMapper(IB1_BZD_ADDITIONAL_IDENTSMapper iB1_BZD_ADDITIONAL_IDENTSMapper) {
        this.iB1_BZD_ADDITIONAL_IDENTSMapper = iB1_BZD_ADDITIONAL_IDENTSMapper;
    }

    public List<IB1_BZD_ADDITIONAL_IDENTSLei> getIB1_BZD_ADDITIONAL_IDENTS(Map map) {
        return iB1_BZD_ADDITIONAL_IDENTSMapper.getIB1_BZD_ADDITIONAL_IDENTS(map);
    }


    public List<IB1_BZD_ADDITIONAL_IDENTSLei> getIB1_BZD_ADDITIONAL_IDENTS_DESC(Map map) {
        return iB1_BZD_ADDITIONAL_IDENTSMapper.getIB1_BZD_ADDITIONAL_IDENTS_DESC(map);
    }
}
