package service;

import dao.IB1_BasicMapper;
import dao.PlatformMapper;
import pojo.IB1_BasicLei;
import pojo.PlatformLei;

import java.util.List;
import java.util.Map;

public class IB1_BasicServiceImpl implements IB1_BasicService {

    //service业务层调dao层：组合Dao
    private IB1_BasicMapper iB1_BasicMapper;

    //设置set方法
    public void setiB1_BasicMapper(IB1_BasicMapper iB1_BasicMapper) {
        this.iB1_BasicMapper = iB1_BasicMapper;
    }



    public List<IB1_BasicLei> getIB1_Basic(Map map) {
        return iB1_BasicMapper.getIB1_Basic(map);
    }


    public List<IB1_BasicLei> getIB1_diagnose_adr(Map map) {
        return iB1_BasicMapper.getIB1_diagnose_adr(map);
    }


    public List<IB1_BasicLei> getIB1_filename(Map map) {
        return iB1_BasicMapper.getIB1_filename(map);
    }


    public List<IB1_BasicLei> getIB1_diagnose_adr_and_IB1_NAME(Map map) {
        return iB1_BasicMapper.getIB1_diagnose_adr_and_IB1_NAME(map);
    }
}
