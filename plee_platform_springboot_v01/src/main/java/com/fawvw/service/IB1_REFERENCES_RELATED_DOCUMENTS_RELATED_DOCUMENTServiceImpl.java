package com.fawvw.service;

import com.fawvw.dao.IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTServiceImpl implements IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService {
@Autowired
    //service业务层调dao层：组合Dao
    private IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper;

    //设置set方法


    public void setiB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper) {
        this.iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper = iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper;
    }

    public List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(Map map) {
        return iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper.getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(map);
    }
}
