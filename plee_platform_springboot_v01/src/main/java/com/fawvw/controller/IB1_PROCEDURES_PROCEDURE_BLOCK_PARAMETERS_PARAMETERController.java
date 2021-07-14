package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fawvw.pojo.API;
import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei;
import com.fawvw.service.IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERController {
    //controller调service层
    @Autowired
    private IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService;

    @RequestMapping("/getIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER")
    public String getIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER info");
        api.setError("null");

        String list= null;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);
            map.put("BLOCK_NAME", BLOCK_NAME);
            map.put("BLOCK_id", BLOCK_id);

            result = iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService.getIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(map);
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

    @RequestMapping("/getIB1_BLOCK_All")
    public String getIB1_BLOCK_All(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_BLOCK_All info");
        api.setError("null");

        String list= null;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);
            map.put("BLOCK_NAME", BLOCK_NAME);
            map.put("BLOCK_id", BLOCK_id);

            result = iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService.getIB1_PROCEDURE_BLOCK_All(map);
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


}
