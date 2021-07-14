package com.fawvw.service;

import com.fawvw.dao.IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCServiceImpl implements IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper;

    //设置set方法


    public void setiB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper) {
        this.iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper = iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper;
    }


    public List<IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei> getIB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC(Map map) {
        return iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper.getIB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC(map);
    }
}
