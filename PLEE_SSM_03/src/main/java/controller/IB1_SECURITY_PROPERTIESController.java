package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.API;
import pojo.IB1_SECURITY_PROPERTIESLei;
import service.IB1_SECURITY_PROPERTIESService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_SECURITY_PROPERTIESController {
    //controller调service层
    @Autowired
    @Qualifier("IB1_SECURITY_PROPERTIESServiceImpl")
    private IB1_SECURITY_PROPERTIESService iB1_SECURITY_PROPERTIESService;

    @RequestMapping("/getIB1_SECURITY_PROPERTIES")
    public String getIB1_SECURITY_PROPERTIES(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,@RequestParam(value="ECU_NAME", required=false) String ECU_NAME,Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_SECURITY_PROPERTIES info");
        api.setError("null");

        String list= null;
        List<IB1_SECURITY_PROPERTIESLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //List<IB1_SECURITY_PROPERTIESLei> result = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map);
            List<IB1_SECURITY_PROPERTIESLei> result_NAME = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES_NAME(map);
            List<IB1_SECURITY_PROPERTIESLei> result_NAME_ID = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES_NAME_AND_ID(map);
            //String list = JSON.toJSONString(result);
            String list_NAME = JSON.toJSONString(result_NAME);
            String list_NAME_ID = JSON.toJSONString(result_NAME_ID);
            //JSONArray array1 = JSONArray.parseArray(list);
            JSONArray array_NAME = JSONArray.parseArray(list_NAME);
            JSONArray array_NAME_ID = JSONArray.parseArray(list_NAME_ID);

            JSONArray finalArrayB = new JSONArray();

            for (int i = 0; i < array_NAME.size(); i++) {

                Map map2 = new HashMap();
                map2.put("platform_name", platform_name);
                map2.put("IB1_VERSION", IB1_VERSION);
                map2.put("diagnose_adr", diagnose_adr);
                map2.put("ECU_NAME", array_NAME.getJSONObject(i).values().toString().substring(1,array_NAME.getJSONObject(i).values().toString().length()-1));
                List<IB1_SECURITY_PROPERTIESLei> result_NAME_AND_ID = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES_NAME_AND_ID(map2);
                List<IB1_SECURITY_PROPERTIESLei> result_SECURITY = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map2);

                String NAME_AND_ID_JsonString = JSON.toJSONString(result_NAME_AND_ID);
                String SECURITY_JsonString = JSON.toJSONString(result_SECURITY);

                JSONArray NAME_AND_ID_jsonArray = JSONArray.parseArray(NAME_AND_ID_JsonString);
                JSONArray SECURITY_jsonArray = JSONArray.parseArray(SECURITY_JsonString);

                JSONArray finalArrayA = new JSONArray();

                finalArrayA.add(NAME_AND_ID_jsonArray);
                finalArrayA.add(SECURITY_jsonArray);

                finalArrayB.add(finalArrayA);
            }

            api.setPara(finalArrayB);
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
