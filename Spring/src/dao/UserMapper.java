package dao;

import pojo.UserLei;
/*
import pojo.User_roleLei;
*/

import java.util.List;

public interface UserMapper {


    public List<UserLei> selectUser();
    public int addUser(UserLei userLei);
    public int deleteUser(int id);


    /*//根据用户名username查询用户
    List<UserLei> getUserByUsername(String username);

    //insert一个用户
    int addUser_role(User_roleLei user_roleLei);

    //修改一个用户
    int updateUser(User_roleLei user_roleLei);

    //删除一个用户
    int deleteUser(int id);
*/
}
