package com.fawvw.dao;

import com.fawvw.pojo.IB1_IB_DESCRIPTION_OBJECTIVESLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_IB_DESCRIPTION_OBJECTIVESMapper {
    //查询IB1_Basic
    List<IB1_IB_DESCRIPTION_OBJECTIVESLei> getIB1_IB_DESCRIPTION_OBJECTIVES(Map map);


    int deleteIB1_IB_DESCRIPTION_OBJECTIVES(Map map);

}
