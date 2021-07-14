package com.fawvw.service;

import com.fawvw.dao.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.fawvw.pojo.UserLei;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    UserLei userLei;

    //service业务层调dao层：组合Dao
    @Autowired
    private UserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public List<UserLei> selectUser() {

       /* *//*redis的序列化器*//*
        RedisSerializer redisSerializer = new StringRedisSerializer();

        *//*设置redisTemplate序列化器*//*
        redisTemplate.setKeySerializer(redisSerializer);*/

       /* List<UserLei> userLei = (List<UserLei>)redisTemplate.opsForValue().get("userLei");
        if(userLei==null){
            userLei = userMapper.selectUser();
            System.out.println("=============查询的是Mysql数据库===================");
            redisTemplate.opsForValue().set("userLei",userLei);
        }
        else {
            System.out.println("=============查询的是Redis缓存=====================");
        }
        return userLei;*/
       /*测试事务Transactional*/
       /*UserLei userLei = new UserLei(1000,"asdf","sd","sd","werqwer","15151","plee","pl","1","s");
        userMapper.addUser(userLei);
        userMapper.deleteUser(5);*/
       return userMapper.selectUser();
    }

    public List<UserLei> getUserByUsername(String username) {
        /*List<UserLei> userLei = (List<UserLei>)redisTemplate.opsForValue().get("username");
        if(userLei==null){
            userLei = userMapper.getUserByUsername(username);
            System.out.println("=============查询的是Mysql数据库===================");
            redisTemplate.opsForValue().set("username",userLei);
        }
        else {
            System.out.println("=============查询的是Redis缓存=====================");
        }
        return userLei;*/
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
