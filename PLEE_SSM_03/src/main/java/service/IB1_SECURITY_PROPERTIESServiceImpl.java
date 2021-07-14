package service;

import dao.IB1_SECURITY_PROPERTIESMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.IB1_SECURITY_PROPERTIESLei;

import java.util.List;
import java.util.Map;
@Service
public class IB1_SECURITY_PROPERTIESServiceImpl implements IB1_SECURITY_PROPERTIESService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_SECURITY_PROPERTIESMapper iB1_SECURITY_PROPERTIESMapper;

    //设置set方法

    public void setiB1_SECURITY_PROPERTIESMapper(IB1_SECURITY_PROPERTIESMapper iB1_SECURITY_PROPERTIESMapper) {
        this.iB1_SECURITY_PROPERTIESMapper = iB1_SECURITY_PROPERTIESMapper;
    }


    public List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES(Map map) {
        return iB1_SECURITY_PROPERTIESMapper.getIB1_SECURITY_PROPERTIES(map);
    }


    public List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES_NAME(Map map) {
        return iB1_SECURITY_PROPERTIESMapper.getIB1_SECURITY_PROPERTIES_NAME(map);
    }

    public List<IB1_SECURITY_PROPERTIESLei> getIB1_SECURITY_PROPERTIES_NAME_AND_ID(Map map) {
        return iB1_SECURITY_PROPERTIESMapper.getIB1_SECURITY_PROPERTIES_NAME_AND_ID(map);
    }
}
