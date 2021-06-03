import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;
import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.UserLei;
import utils.MybatisUtils;

import java.util.List;

public class Userdaotest {
    //查询全部用户
    @Test
    public void getUserAll() {

        //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
        TypeUtils.compatibleWithJavaBean = true;

        /*//获得SqlSession对象

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式1：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<UserLei> userlist = mapper.getUserAll();

        *//*for (UserLei userLei : userlist) {
            System.out.println(userLei);
        }*//*

        String alluser = JSON.toJSONString(userlist);
        System.out.println(alluser);
        sqlSession.close();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<UserLei> userAll = userMapper.selectUser();


      /*  UserLei user = new UserLei();
        user.setId(100);
        user.setUsername("张三");
        user.setPassword("xxx");*/
 /*       user.setName("zhangsan");
        user.setEmail("xxx@xxx");
        user.setPhone("123123123");
        user.setDepartment("PL");
        user.setGroup("FAW");
        user.setRole_name("1");
        user.setStatus("1");*/


/*
        userMapper.addUser(user);
*/
        //userMapper.deleteUser(100);

    }
}
