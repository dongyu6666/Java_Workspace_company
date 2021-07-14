package service;

import dao.CommonDao;
import dao.UserMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

        /*UserLei userLei = new UserLei(1000,"asdf","sd","sd","werqwer","15151","plee","pl","1","s");
        userMapper.addUser(userLei);
        userMapper.deleteUser(5);*/
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
