package service;

import dao.IB1_TNRMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.IB1_TNRLei;

import java.util.List;
import java.util.Map;
@Service
public class IB1_TNRServiceImpl implements IB1_TNRService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_TNRMapper iB1_TNRMapper;

    //设置set方法

    public void setiB1_TNRMapper(IB1_TNRMapper iB1_TNRMapper) {
        this.iB1_TNRMapper = iB1_TNRMapper;
    }

    public List<IB1_TNRLei> getIB1_TNR(Map map) {
        return iB1_TNRMapper.getIB1_TNR(map);
    }
}
