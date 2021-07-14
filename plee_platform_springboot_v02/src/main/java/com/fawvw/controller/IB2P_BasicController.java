package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.API;
import com.fawvw.pojo.IB2P_BasicLei;
import com.fawvw.service.IB2P_BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IB2P_BasicController {
    //controller调service层
    @Autowired
    private IB2P_BasicService iB2P_BasicService;

    @RequestMapping("/getIB2P_Basic")
    public String getIB2P_Basic(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB2P_VERSION", required=false) String IB2P_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB2P_Basic info");
        api.setError("null");

        String list= null;
        List<IB2P_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB2P_VERSION", IB2P_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            result = iB2P_BasicService.getIB2P_Basic(map);
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
        return json;
    }
    /*================================================================*/
    @RequestMapping("/getIB2P_diagnose_adr")
    public String getIB2P_diagnose_adr(@RequestParam(value="platform_name", required=false) String platform_name, Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB2P_diagnose_adr info");
        api.setError("null");

        String list= null;
        List<IB2P_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);

            result = iB2P_BasicService.getIB2P_diagnose_adr(map);
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
        return json;
    }

    /*================================================================*/
    @RequestMapping("/getIB2P_diagnose_adr_and_IB2P_NAME")
    public String getIB2P_diagnose_adr_and_IB2P_NAME(@RequestParam(value="platform_name", required=false) String platform_name, Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB2P_diagnose_adr_and_IB2P_NAME info");
        api.setError("null");

        String list= null;
        List<IB2P_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);


            result = iB2P_BasicService.getIB2P_diagnose_adr_and_IB2P_NAME(map);
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
        return json;
    }

    /*================================================================*/
    @RequestMapping("/getIB2P_filename")
    public String getIB2P_filename(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB2P_VERSION", required=false) String IB2P_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB2P_filename info");
        api.setError("null");

        String list= null;
        List<IB2P_BasicLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB2P_VERSION", IB2P_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            result = iB2P_BasicService.getIB2P_filename(map);
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
        return json;
    }

    /*================================================================*/
    @RequestMapping("/insertIB2P_Basic")
    public String insertIB2P_Basic(@RequestParam(value="platform_name", required=false) String platform_name,
                                   @RequestParam(value="IB2P_VERSION", required=false) String IB2P_VERSION,
                                   @RequestParam(value="diagnose_adr", required=false) String diagnose_adr,

                                   @RequestParam(value="username", required=false) String username,
                                   @RequestParam(value="IB2P_VERSION_LOCAL", required=false) String IB2P_VERSION_LOCAL,
                                   @RequestParam(value="IB3P_Official_Release", required=false) String IB3P_Official_Release,

                                   Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("insert local IB2P_Basic");
        api.setError("null");
        api.setPara_insert("successful");

        String list= null;
        int result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB2P_VERSION", IB2P_VERSION);
            map.put("diagnose_adr", diagnose_adr);
            map.put("username", username);
            map.put("IB2P_VERSION_LOCAL", IB2P_VERSION_LOCAL);
            map.put("IB3P_Official_Release", IB3P_Official_Release);

            result = iB2P_BasicService.insertIB2P_Basic(map);
            System.out.println("result:"+result);
            if (result == 0){
                api.setPara_insert("failed");
            }
            //list = JSON.toJSONString(result);
            //array = JSONArray.parseArray(list);
            //api.setPara(array);
        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setPara_insert("failed");
            api.setError(e.getCause().getMessage());
        }
        String  json = JSON.toJSONString(api);
        model.addAttribute("msg",json);
        System.out.println("FrontEnd will get: " +json);
        return json;
    }


}
