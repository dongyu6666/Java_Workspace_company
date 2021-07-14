package com.fawvw.dao;

import com.fawvw.pojo.IB1_DOC_INFO_CONTACTSLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_DOC_INFO_CONTACTSMapper {
    //查询
    List<IB1_DOC_INFO_CONTACTSLei> getIB1_DOC_INFO_CONTACTS(Map map);

    int deleteIB1_DOC_INFO_CONTACTS(Map map);


}
