package com.fawvw.dao;

import com.fawvw.pojo.IB1_IB_DESCRIPTION_IBNZLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_IB_DESCRIPTION_IBNZMapper {
    //查询IB1_Basic
    List<IB1_IB_DESCRIPTION_IBNZLei> getIB1_IB_DESCRIPTION_IBNZ(Map map);

    int deleteIB1_IB_DESCRIPTION_IBNZ(Map map);


}
