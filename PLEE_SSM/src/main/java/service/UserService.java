package service;

import pojo.UserLei;

import java.util.List;

public interface UserService {

    List<UserLei> selectUser();

    int addUser(UserLei userLei);

    int deleteUser(int id);
}
