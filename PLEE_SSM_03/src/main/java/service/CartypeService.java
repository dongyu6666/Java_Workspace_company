package service;

import org.springframework.core.annotation.AliasFor;
import pojo.CartypeLei;

import java.util.List;

public interface CartypeService {


        //查询全部车型
    List<CartypeLei> getCartype();


}
