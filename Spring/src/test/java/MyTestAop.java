import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class MyTestAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意：动态代理的代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        //并没有改UserService代码，但却把log信息加入了
        userService.add();
        //userService.select();
    }
}
