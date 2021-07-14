package com.fawvw.controller;

import com.fawvw.pojo.UserLei;
import com.fawvw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserLei> selectUser(){
        List<UserLei> userLeis = userService.selectUser();
        for (UserLei userLei : userLeis) {
            System.out.println(userLei);
        }
        return userLeis;
    }

}
