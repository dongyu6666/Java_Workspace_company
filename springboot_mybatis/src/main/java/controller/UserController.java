package controller;

import dao.UserMapper;
import pojo.UserLei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUser")
    public List<UserLei> selectUser(){
        List<UserLei> userLeis = userMapper.selectUser();
        for (UserLei userLei : userLeis) {
            System.out.println(userLei);
        }
        return userLeis;
    }

}
