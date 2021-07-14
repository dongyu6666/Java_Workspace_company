package service;

import dao.IB1_BZDMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.IB1_BZDLei;

import java.util.List;
import java.util.Map;

@Service
public class IB1_BZDServiceImpl implements IB1_BZDService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_BZDMapper iB1_BZDMapper;

    //设置set方法

    public void setiB1_BZDMapper(IB1_BZDMapper iB1_BZDMapper) {
        this.iB1_BZDMapper = iB1_BZDMapper;
    }

    public List<IB1_BZDLei> getIB1_BZD(Map map) {
        return iB1_BZDMapper.getIB1_BZD(map);
    }
}
