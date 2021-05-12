package test;

import dao.UserDao;
import domain.UserLei;

//仅仅是测试
public class UserDaoTest {

    public static void main(String[] args) {
       //封装 UserLei对象，赋值测试
        UserLei loginuser = new UserLei();
        loginuser.setUsername("liangdongyu");
        loginuser.setPassword("11");
        //测试数据库返回，用Userdao的login方法
        UserDao userDao = new UserDao();

        UserLei user_return = userDao.login(loginuser);

        System.out.println("数据库的结果："+ user_return);

        /*String username_real = user_return.getUsername();
        String password_real = user_return.getPassword();
        System.out.println("数据库实际的名字是："+ username_real);
        System.out.println("数据库实际的密码是："+ password_real);*/

    }





}
