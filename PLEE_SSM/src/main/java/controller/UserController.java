package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.UserLei;
import service.UserService;

import java.util.List;

@Controller
public class UserController {
    //controller调service层

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/user")
    public String list(Model model){

        List<UserLei> users = userService.selectUser();
        model.addAttribute("msg",users);
        System.out.println(users);
        return "userall";
    }


}
