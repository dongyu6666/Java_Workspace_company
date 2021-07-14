package com.fawvw.service;

import com.fawvw.dao.IB1_IB_DESCRIPTION_SLAVEMapper;
import com.fawvw.pojo.IB1_IB_DESCRIPTION_SLAVELei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_IB_DESCRIPTION_SLAVEServiceImpl implements IB1_IB_DESCRIPTION_SLAVEService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_IB_DESCRIPTION_SLAVEMapper iB1_IB_DESCRIPTION_SLAVEMapper;

    //设置set方法


    public void setiB1_IB_DESCRIPTION_SLAVEMapper(IB1_IB_DESCRIPTION_SLAVEMapper iB1_IB_DESCRIPTION_SLAVEMapper) {
        this.iB1_IB_DESCRIPTION_SLAVEMapper = iB1_IB_DESCRIPTION_SLAVEMapper;
    }

    public List<IB1_IB_DESCRIPTION_SLAVELei> getIB1_IB_DESCRIPTION_SLAVE(Map map) {
        return iB1_IB_DESCRIPTION_SLAVEMapper.getIB1_IB_DESCRIPTION_SLAVE(map);
    }

    public int deleteIB1_IB_DESCRIPTION_SLAVE(Map map) {
        return iB1_IB_DESCRIPTION_SLAVEMapper.deleteIB1_IB_DESCRIPTION_SLAVE(map);
    }


}
