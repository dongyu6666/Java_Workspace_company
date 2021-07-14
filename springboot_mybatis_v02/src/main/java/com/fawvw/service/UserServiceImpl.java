package com.fawvw.service;

import com.fawvw.dao.UserMapper;
import com.fawvw.pojo.UserLei;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //service业务层调dao层：组合Dao

    private UserMapper userMapper;
    //设置set方法
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public List<UserLei> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public List<UserLei> getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public int addUser(UserLei userLei) {
        return userMapper.addUser(userLei);
    }

    @Override
    public int updateUser(UserLei userLei) {
        return userMapper.updateUser(userLei);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
