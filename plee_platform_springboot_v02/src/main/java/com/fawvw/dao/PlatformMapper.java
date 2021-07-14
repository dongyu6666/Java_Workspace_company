package com.fawvw.dao;

import com.fawvw.pojo.PlatformLei;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatformMapper {
    //查询全部平台
    List<PlatformLei> getPlatform();



}
