package test;

import dao.UserDao;
import domain.UserLei;

//仅仅是测试
public class UserDaoTest {

    public static void main(String[] args) {
        UserLei loginuser = new UserLei();
        loginuser.setUsername("somebody");
        loginuser.setPassword("xxx");

        UserDao userDao = new UserDao();

        UserLei user_return = userDao.login(loginuser);

        System.out.println(user_return);
    }





}
