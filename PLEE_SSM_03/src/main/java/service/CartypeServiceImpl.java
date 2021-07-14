package service;

import dao.CartypeMapper;
import org.apache.ibatis.session.SqlSessionManager;
import org.mybatis.spring.SqlSessionUtils;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.CartypeLei;

import java.util.List;

@Service
public class CartypeServiceImpl implements CartypeService {
    //service业务层调dao层：组合Dao
@Autowired
    private CartypeMapper cartypeMapper;

    //设置set方法


    public void setCartypeMapper(CartypeMapper cartypeMapper) {
        this.cartypeMapper = cartypeMapper;
    }



    public List<CartypeLei> getCartype() {
        return cartypeMapper.getCartype();
    }
}
