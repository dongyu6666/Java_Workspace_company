package com.fawvw.dao;

import com.fawvw.pojo.IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper {
    //查询IB1_Basic
    List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(Map map);

    int deleteIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(Map map);


}
