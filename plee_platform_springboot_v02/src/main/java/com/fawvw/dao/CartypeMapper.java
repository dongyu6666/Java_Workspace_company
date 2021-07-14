package com.fawvw.dao;

import com.fawvw.pojo.CartypeLei;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartypeMapper {
    //查询全部车型
    List<CartypeLei> getCartype();


}
