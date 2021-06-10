package Test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.CartypeLei;
import service.CartypeService;

import java.util.List;


public class MyTestCartype {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CartypeService cartypeServiceImpl = (CartypeService) context.getBean("CartypeServiceImpl");
        List<CartypeLei> cartypeLeis = cartypeServiceImpl.getCartype();
        for (CartypeLei cartypeLei : cartypeLeis) {
            System.out.println(cartypeLei);
        }
    }

}

