package service;

import dao.IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper;
import pojo.IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei;

import java.util.List;
import java.util.Map;

public class IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONServiceImpl implements IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService {

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
