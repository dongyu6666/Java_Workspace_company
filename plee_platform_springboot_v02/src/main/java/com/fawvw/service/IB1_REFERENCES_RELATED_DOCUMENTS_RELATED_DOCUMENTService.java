package com.fawvw.service;

import com.fawvw.pojo.IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei;

import java.util.List;
import java.util.Map;

public interface IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService {
    //查询
    List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(Map map);

    int deleteIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(Map map);


}