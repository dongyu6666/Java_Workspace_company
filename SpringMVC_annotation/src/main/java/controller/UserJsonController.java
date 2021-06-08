package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import java.util.ArrayList;

//@Controller //走视图解析器
@RestController //不走视图解析器
public class UserJsonController {

    @RequestMapping("/j1")
    public String json1(){

        User user = new User(1,"张三","10");
        String s = JSON.toJSONString(user);

        return s;
    }

    @RequestMapping("/j2")
    public String json2(){

        User user1 = new User(1,"张三1","10");
        User user2 = new User(2,"张三2","10");
        User user3 = new User(3,"张三3","10");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        String s = JSON.toJSONString(users);
        return s;
    }
}
