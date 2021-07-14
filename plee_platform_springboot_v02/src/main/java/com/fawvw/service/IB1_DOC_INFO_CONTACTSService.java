package com.fawvw.service;

import com.fawvw.pojo.IB1_DOC_INFO_CONTACTSLei;

import java.util.List;
import java.util.Map;

public interface IB1_DOC_INFO_CONTACTSService {

    List<IB1_DOC_INFO_CONTACTSLei> getIB1_DOC_INFO_CONTACTS(Map map);

    int deleteIB1_DOC_INFO_CONTACTS(Map map);

}
