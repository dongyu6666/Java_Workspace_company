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
import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei;
import com.fawvw.service.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSController {
    //controller调service层
    @Autowired
    private IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService;

    @RequestMapping("/getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS")
    public String getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="STEP_NAME", required=false) String STEP_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, @RequestParam(value="STEP_id", required=false) String STEP_id, @RequestParam(value="id", required=false) String id, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS info");
        api.setError("null");

        String list= null;
        String list_DATA_IDENTIFIER= null;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> result;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> result_DATA_IDENTIFIER;
        JSONArray array;
        JSONArray array_DATA_IDENTIFIER;


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

            result = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService.getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS(map);
            result_DATA_IDENTIFIER = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService.getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS_DATA_IDENTIFIER(map);
            list = JSON.toJSONString(result);
            list_DATA_IDENTIFIER = JSON.toJSONString(result_DATA_IDENTIFIER);
            array = JSONArray.parseArray(list);
            array_DATA_IDENTIFIER = JSONArray.parseArray(list_DATA_IDENTIFIER);
            JSONArray array_all = new JSONArray();

            array_all.add(array);
            array_all.add(array_DATA_IDENTIFIER);
            api.setPara(array_all);

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
