package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.API;
import pojo.PlatformLei;
import service.PlatformService;

import java.util.List;

@Controller
public class PlatformController {
    //controller调service层
    @Autowired
    @Qualifier("PlatformServiceImpl")
    private PlatformService platformService;

    @RequestMapping("/getPlatform")
    public String getPlatform(Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all Platform info");
        api.setError("null");

        String list= null;
        List<PlatformLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;

            result = platformService.getPlatform();
            list = JSON.toJSONString(result);
            array = JSONArray.parseArray(list);
            api.setPara(array);
        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String  json = JSON.toJSONString(api);
        model.addAttribute("msg",json);
        System.out.println("FrontEnd will get: " +json);
        return "standard";
    }

}
