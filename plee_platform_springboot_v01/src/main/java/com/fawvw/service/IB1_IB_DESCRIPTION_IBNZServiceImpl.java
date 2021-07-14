package com.fawvw.service;

import com.fawvw.dao.IB1_IB_DESCRIPTION_IBNZMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_IB_DESCRIPTION_IBNZLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_IB_DESCRIPTION_IBNZServiceImpl implements IB1_IB_DESCRIPTION_IBNZService {

    @Autowired
    //service业务层调dao层：组合Dao
    private IB1_IB_DESCRIPTION_IBNZMapper iB1_IB_DESCRIPTION_IBNZMapper;

    //设置set方法


    public void setiB1_IB_DESCRIPTION_IBNZMapper(IB1_IB_DESCRIPTION_IBNZMapper iB1_IB_DESCRIPTION_IBNZMapper) {
        this.iB1_IB_DESCRIPTION_IBNZMapper = iB1_IB_DESCRIPTION_IBNZMapper;
    }

    public List<IB1_IB_DESCRIPTION_IBNZLei> getIB1_IB_DESCRIPTION_IBNZ(Map map) {
        return iB1_IB_DESCRIPTION_IBNZMapper.getIB1_IB_DESCRIPTION_IBNZ(map);
    }


}
