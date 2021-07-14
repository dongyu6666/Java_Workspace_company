package Test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.CartypeLei;
import pojo.UserLei;
import service.CartypeService;
import service.UserService;

import java.util.List;


public class MyTestCartype {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CartypeService cartypeServiceImpl = (CartypeService) context.getBean("CartypeServiceImpl");
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");





        List<CartypeLei> cartypeLeis = cartypeServiceImpl.getCartype();
        List<CartypeLei> cartypeLeis2 = cartypeServiceImpl.getCartype();
        List<CartypeLei> cartypeLeis3 = cartypeServiceImpl.getCartype();
        List<UserLei> userLeis = userServiceImpl.selectUser();

        System.out.println(cartypeLeis.toString());
        System.out.println(userLeis.toString());
    }

}

