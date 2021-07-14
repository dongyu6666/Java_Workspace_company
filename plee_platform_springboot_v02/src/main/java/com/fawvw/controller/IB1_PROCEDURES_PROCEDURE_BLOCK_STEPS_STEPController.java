package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.API;
import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei;
import com.fawvw.service.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPController {
    //controller调service层
    @Autowired
    private IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService;

    @RequestMapping("/getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP")
    public String getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="STEP_NAME", required=false) String STEP_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, @RequestParam(value="STEP_id", required=false) String STEP_id, @RequestParam(value="id", required=false) String id,Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP info");
        api.setError("null");

        String list= null;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);
            map.put("BLOCK_NAME", BLOCK_NAME);
            map.put("STEP_NAME", STEP_NAME);
            map.put("BLOCK_id", BLOCK_id);
            map.put("STEP_id", STEP_id);
            map.put("id", id);

            result = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService.getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(map);
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

    @RequestMapping("/getIB1_BLOCK_STEP")
    public String getIB1_BLOCK_STEP(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, @RequestParam(value="STEP_id", required=false) String STEP_id,@RequestParam(value="id", required=false) String id, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_STEP_NAME info");
        api.setError("null");

        String list= null;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> result;
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
            map.put("STEP_id", STEP_id);
            map.put("id", id);

            result = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService.getIB1_BLOCK_STEP(map);
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
