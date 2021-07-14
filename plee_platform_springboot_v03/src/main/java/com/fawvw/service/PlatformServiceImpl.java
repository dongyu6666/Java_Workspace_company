package com.fawvw.service;

import com.fawvw.dao.PlatformMapper;
import com.fawvw.pojo.PlatformLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlatformServiceImpl implements PlatformService {

    @Autowired
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
