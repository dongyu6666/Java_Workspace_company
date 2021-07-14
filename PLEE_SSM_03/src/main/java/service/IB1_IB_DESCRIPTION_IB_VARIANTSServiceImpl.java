package service;

import dao.IB1_IB_DESCRIPTION_IB_VARIANTSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.IB1_IB_DESCRIPTION_IB_VARIANTSLei;

import java.util.List;
import java.util.Map;
@Service
public class IB1_IB_DESCRIPTION_IB_VARIANTSServiceImpl implements IB1_IB_DESCRIPTION_IB_VARIANTSService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_IB_DESCRIPTION_IB_VARIANTSMapper iB1_IB_DESCRIPTION_IB_VARIANTSMapper;

    //设置set方法


    public void setiB1_IB_DESCRIPTION_IB_VARIANTSMapper(IB1_IB_DESCRIPTION_IB_VARIANTSMapper iB1_IB_DESCRIPTION_IB_VARIANTSMapper) {
        this.iB1_IB_DESCRIPTION_IB_VARIANTSMapper = iB1_IB_DESCRIPTION_IB_VARIANTSMapper;
    }

    public List<IB1_IB_DESCRIPTION_IB_VARIANTSLei> getIB1_IB_DESCRIPTION_IB_VARIANTS(Map map) {
        return iB1_IB_DESCRIPTION_IB_VARIANTSMapper.getIB1_IB_DESCRIPTION_IB_VARIANTS(map);
    }


}
