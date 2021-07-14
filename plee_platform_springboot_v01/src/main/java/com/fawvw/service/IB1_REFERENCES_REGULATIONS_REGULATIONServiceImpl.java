package com.fawvw.service;

import com.fawvw.dao.IB1_REFERENCES_REGULATIONS_REGULATIONMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_REFERENCES_REGULATIONS_REGULATIONLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_REFERENCES_REGULATIONS_REGULATIONServiceImpl implements IB1_REFERENCES_REGULATIONS_REGULATIONService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_REFERENCES_REGULATIONS_REGULATIONMapper iB1_REFERENCES_REGULATIONS_REGULATIONMapper;

    //设置set方法


    public void setiB1_REFERENCES_REGULATIONS_REGULATIONMapper(IB1_REFERENCES_REGULATIONS_REGULATIONMapper iB1_REFERENCES_REGULATIONS_REGULATIONMapper) {
        this.iB1_REFERENCES_REGULATIONS_REGULATIONMapper = iB1_REFERENCES_REGULATIONS_REGULATIONMapper;
    }

    public List<IB1_REFERENCES_REGULATIONS_REGULATIONLei> getIB1_REFERENCES_REGULATIONS_REGULATION(Map map) {
        return iB1_REFERENCES_REGULATIONS_REGULATIONMapper.getIB1_REFERENCES_REGULATIONS_REGULATION(map);
    }
}
