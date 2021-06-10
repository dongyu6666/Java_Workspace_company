package Test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.UserLei;
import service.UserService;

import java.util.List;


public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        List<UserLei> userLeis = userServiceImpl.selectUser();
        for (UserLei userLei : userLeis) {
            System.out.println(userLei);
        }
    }

}

