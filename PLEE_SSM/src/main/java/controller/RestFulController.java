package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    //原来的： http://localhost:8080/add?a=1&b=2
    //RestFul的： http://localhost:8080/add/1/2      简洁、高效、安全

    @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable int b, Model model){

        int res = a + b;
        model.addAttribute("msg", res);
        return "test";

    }

    @GetMapping("/add2/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){

        int res = a + b;
        model.addAttribute("msg", res);
        return "test";

    }

    @PostMapping("/add3/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable int b, Model model){

        int res = a + b;
        model.addAttribute("msg", res);
        return "test";

    }




}

