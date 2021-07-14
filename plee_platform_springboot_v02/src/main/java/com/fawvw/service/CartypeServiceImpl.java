package com.fawvw.service;

import com.fawvw.dao.CartypeMapper;
import com.fawvw.pojo.CartypeLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CartypeServiceImpl implements CartypeService {
    //service业务层调dao层：组合Dao
    @Autowired
    private CartypeMapper cartypeMapper;
    @Autowired
    RedisTemplate redisTemplate;
    //设置set方法


    public void setCartypeMapper(CartypeMapper cartypeMapper) {
        this.cartypeMapper = cartypeMapper;
    }



    public List<CartypeLei> getCartype() {
        return cartypeMapper.getCartype();
    }
}
