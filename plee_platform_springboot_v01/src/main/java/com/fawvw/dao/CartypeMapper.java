package com.fawvw.dao;

import org.springframework.stereotype.Repository;
import com.fawvw.pojo.CartypeLei;

import java.util.List;
@Repository
public interface CartypeMapper {
    //查询全部车型
    List<CartypeLei> getCartype();


}
