package com.fawvw.service;

import com.fawvw.dao.IB1_statMapper;
import com.fawvw.pojo.IB1_statLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_statServiceImpl implements IB1_statService {

    @Autowired
    //service业务层调dao层：组合Dao
    private IB1_statMapper iB1_statMapper;

    //设置set方法
    public void setiB1_statMapper(IB1_statMapper iB1_statMapper) {
        this.iB1_statMapper = iB1_statMapper;
    }

    public List<IB1_statLei> getIB1_stat(Map map) {
        return iB1_statMapper.getIB1_stat(map);
    }
}
