package service;

import dao.IB1_SECURITY_PROPERTIESMapper;
import pojo.IB1_SECURITY_PROPERTIESLei;

import java.util.List;
import java.util.Map;

public class IB1_SECURITY_PROPERTIESServiceImpl implements IB1_SECURITY_PROPERTIESService {

    //service业务层调dao层：组合Dao
    private IB1_SECURITY_PROPERTIESMapper iB1_SECURITY_PROPERTIESMapper;

    //设置set方法

    public void setiB1_SECURITY_PROPERTIESMapper(IB1_SECURITY_PROPERTIESMapper iB1_SECURITY_PROPERTIESMapper) {
        this.iB1_SECURITY_PROPERTIESMapper = iB1_SECURITY_PROPERTIESMapper;
    }


    public List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES(Map map) {
        return iB1_SECURITY_PROPERTIESMapper.getIB1_SECURITY_PROPERTIES(map);
    }
}
