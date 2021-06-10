package Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardTest {
    @RequestMapping("/forward")
    public String test1(Model model){
        //封装数据
        model.addAttribute("msg","Hello forward");


        return "hello";
    }

    @RequestMapping("/redirect")
    public String test2(Model model){
        //封装数据
        model.addAttribute("msg","Hello forward");


        return "redirect:/index.jsp";
    }
}
