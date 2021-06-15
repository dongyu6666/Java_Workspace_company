package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.API;
import pojo.IB1_IB_DESCRIPTION_SLAVELei;
import service.IB1_IB_DESCRIPTION_SLAVEService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_IB_DESCRIPTION_SLAVEController {
    //controller调service层
    @Autowired
    @Qualifier("IB1_IB_DESCRIPTION_SLAVEServiceImpl")
    private IB1_IB_DESCRIPTION_SLAVEService iB1_IB_DESCRIPTION_SLAVEService;

    @RequestMapping("/getIB1_IB_DESCRIPTION_SLAVE")
    public String getIB1_IB_DESCRIPTION_SLAVE(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_IB_DESCRIPTION_SLAVE info");
        api.setError("null");

        String list= null;
        List<IB1_IB_DESCRIPTION_SLAVELei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            result = iB1_IB_DESCRIPTION_SLAVEService.getIB1_IB_DESCRIPTION_SLAVE(map);
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