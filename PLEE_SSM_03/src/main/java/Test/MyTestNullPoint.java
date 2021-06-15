package Test;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pojo.UserLei;
import service.UserService;

import java.util.List;


public class MyTestNullPoint {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;
    @Test
    public void test(){
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        List<UserLei> userLeis = userServiceImpl.selectUser();*/
        List<UserLei> userLeis = userService.selectUser();

        System.out.println(userLeis.toString());
    }

}

