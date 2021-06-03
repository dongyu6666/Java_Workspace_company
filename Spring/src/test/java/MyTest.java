import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;
import pojo.Person;
import pojo.User;
import pojo.User222;


public class MyTest {
    public static void main(String[] args) {
/*        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
*//*        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());*//*
        User user = (User)context.getBean("user");
        System.out.println(user.toString());*/

/*
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person)context.getBean("person");
        person.getCat().action();
        person.getDog().action();*/


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User222 user222 = (User222)context.getBean("user222");
        System.out.println(user222.name);


    }


    @Test
    public void testTTT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User222 user222 = (User222)context.getBean("user222");
        System.out.println(user222.name);
    }


}
