package com.fawvw.dao;

import com.fawvw.pojo.IB1_IB_DESCRIPTION_IB_VARIANTSLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_IB_DESCRIPTION_IB_VARIANTSMapper {
    //查询IB1_IB_DESCRIPTION_IB_VARIANTS
    List<IB1_IB_DESCRIPTION_IB_VARIANTSLei> getIB1_IB_DESCRIPTION_IB_VARIANTS(Map map);



}
