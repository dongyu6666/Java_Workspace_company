package service;

import dao.UserMapper;
import org.mybatis.spring.SqlSessionTemplate;
import pojo.UserLei;

import java.util.List;

public class UserServiceImpl implements UserService {

    //service业务层调dao层：组合Dao
    private UserMapper userMapper;
    //设置set方法
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<UserLei> selectUser() {
        return userMapper.selectUser();
    }

    public List<UserLei> getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    public int addUser(UserLei userLei) {
        return userMapper.addUser(userLei);
    }

    public int updateUser(UserLei userLei) {
        return userMapper.updateUser(userLei);
    }


    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
