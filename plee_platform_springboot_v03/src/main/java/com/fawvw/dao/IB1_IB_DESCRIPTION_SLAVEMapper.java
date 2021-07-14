package com.fawvw.dao;

import com.fawvw.pojo.IB1_IB_DESCRIPTION_SLAVELei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_IB_DESCRIPTION_SLAVEMapper {
    //查询IB1_Basic
    List<IB1_IB_DESCRIPTION_SLAVELei> getIB1_IB_DESCRIPTION_SLAVE(Map map);

    int deleteIB1_IB_DESCRIPTION_SLAVE(Map map);


}
