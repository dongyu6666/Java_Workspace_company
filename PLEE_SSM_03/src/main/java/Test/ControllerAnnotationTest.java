package Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //代表这个类被Spring接管
public class ControllerAnnotationTest {
    @RequestMapping("/ttt1")
    public String test1(Model model){
        model.addAttribute("msg","ControllerAnnotationTest111");
        return "test";
    }

    @RequestMapping("/ttt2")
    public String test2(Model model){
        model.addAttribute("msg","ControllerAnnotationTest222");
        return "test";
    }

}
