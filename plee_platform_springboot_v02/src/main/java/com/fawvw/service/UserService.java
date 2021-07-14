package com.fawvw.service;

import com.fawvw.pojo.UserLei;

import java.util.List;


public interface UserService {

    List<UserLei> selectUser();

    //根据用户名username查询用户
    List<UserLei> getUserByUsername(String username);

    //insert一个用户
    int addUser(UserLei userLei);

    //修改一个用户
    int updateUser(UserLei userLei);

    //删除一个用户
    int deleteUser(int id);
}
