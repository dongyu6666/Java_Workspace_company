package com.fawvw.dao;

import com.fawvw.pojo.IB1_DIAG_INFOS_DIAG_INFOLei;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IB1_DIAG_INFOS_DIAG_INFOMapper {
    //查询
    List<IB1_DIAG_INFOS_DIAG_INFOLei> getIB1_DIAG_INFOS_DIAG_INFO(Map map);

    int deleteIB1_DIAG_INFOS_DIAG_INFO(Map map);


}
