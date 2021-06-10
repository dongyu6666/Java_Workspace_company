package service;

import dao.CartypeMapper;
import pojo.CartypeLei;

import java.util.List;

public class CartypeServiceImpl implements CartypeService {

    //service业务层调dao层：组合Dao
    private CartypeMapper cartypeMapper;

    //设置set方法


    public void setCartypeMapper(CartypeMapper cartypeMapper) {
        this.cartypeMapper = cartypeMapper;
    }



    public List<CartypeLei> getCartype() {
        return cartypeMapper.getCartype();
    }
}
