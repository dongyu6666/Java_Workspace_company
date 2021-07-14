package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.API;
import com.fawvw.pojo.IB1_BasicLei;
import com.fawvw.service.IB1_BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IB1_BasicController {
    //controller调service层
    @Autowired
    private IB1_BasicService iB1_BasicService;

    @RequestMapping("/getIB1_Basic")
    public String getIB1_Basic(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_Basic info");
        api.setError("null");

        String list= null;
        List<IB1_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            result = iB1_BasicService.getIB1_Basic(map);
            list = JSON.toJSONString(result);
            array = JSONArray.parseArray(list);
            api.setPara(array);
        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String json = JSON.toJSONString(api);
        model.addAttribute("msg",json);
        System.out.println("FrontEnd will get: " +json);
        return json;
    }
/*================================================================*/
    @RequestMapping("/getIB1_diagnose_adr")
    public String getIB1_diagnose_adr(@RequestParam(value="platform_name", required=false) String platform_name, Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_diagnose_adr info");
        api.setError("null");

        String list= null;
        List<IB1_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);

            result = iB1_BasicService.getIB1_diagnose_adr(map);
            list = JSON.toJSONString(result);
            array = JSONArray.parseArray(list);
            api.setPara(array);
        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String json = JSON.toJSONString(api);
        model.addAttribute("msg",json);
        System.out.println("FrontEnd will get: " +json);
        return json;
    }

/*================================================================*/
    @RequestMapping("/getIB1_diagnose_adr_and_IB1_NAME")
    public String getIB1_diagnose_adr_and_IB1_NAME(@RequestParam(value="platform_name", required=false) String platform_name, Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_diagnose_adr_and_IB1_NAME info");
        api.setError("null");

        String list= null;
        List<IB1_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);


            result = iB1_BasicService.getIB1_diagnose_adr_and_IB1_NAME(map);
            list = JSON.toJSONString(result);
            array = JSONArray.parseArray(list);
            /*----------------------------------*/
          /*  int size = array.size();
            System.out.println("size:"+size);

            for (int i = 0; i < size; i++) {
                Object diagnose_adr = array.getJSONObject(i).get("diagnose_adr");
                Object ib1_name = array.getJSONObject(i).get("IB1_NAME");
                System.out.println(diagnose_adr.toString());
                System.out.println(ib1_name);
            }
*/
            /*----------------------------------*/
           //System.out.println("----------"+list);
           //System.out.println("======="+array);
            api.setPara(array);
        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String json = JSON.toJSONString(api);
        model.addAttribute("msg",json);
        System.out.println("FrontEnd will get: " +json);
        return json;
    }

/*================================================================*/
    @RequestMapping("/getIB1_filename")
    public String getIB1_filename(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_filename info");
        api.setError("null");

        String list= null;
        List<IB1_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            result = iB1_BasicService.getIB1_filename(map);
            list = JSON.toJSONString(result);
            array = JSONArray.parseArray(list);
            api.setPara(array);
        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String json = JSON.toJSONString(api);
        model.addAttribute("msg",json);
        System.out.println("FrontEnd will get: " +json);
        return json;
    }


}
