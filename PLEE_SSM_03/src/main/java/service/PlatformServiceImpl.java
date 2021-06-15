package service;

import dao.PlatformMapper;
import pojo.PlatformLei;

import java.util.List;

public class PlatformServiceImpl implements PlatformService {

    //service业务层调dao层：组合Dao
    private PlatformMapper platformMapper;

    //设置set方法


    public void setPlatformMapper(PlatformMapper platformMapper) {
        this.platformMapper = platformMapper;
    }



    public List<PlatformLei> getPlatform() {
        return platformMapper.getPlatform();
    }
}
