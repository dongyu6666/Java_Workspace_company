package com.fawvw.dao;

import com.fawvw.pojo.IB1_DOC_INFO_DOC_REVISIONSLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface IB1_DOC_INFO_DOC_REVISIONSMapper {
    //查询
    List<IB1_DOC_INFO_DOC_REVISIONSLei> getIB1_DOC_INFO_DOC_REVISIONS(Map map);



}
