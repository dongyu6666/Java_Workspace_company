package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.API;
import com.fawvw.pojo.Class_stat;
import com.fawvw.pojo.IB1_statLei;
import com.fawvw.service.IB1_statService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IB1_statController {
    //controller调service层
    @Autowired
    private IB1_statService iB1_statService;

    @RequestMapping("/getIB1_stat")
    public String getIB1_stat(Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_stat info");
        api.setError("null");

        List<IB1_statLei> result_MEB;
        List<IB1_statLei> result_MQB;
        List<IB1_statLei> result_MQB37w;

        String list_MEB= null;
        String list_MQB= null;
        String list_MQB37w= null;

        JSONArray array_MEB;
        JSONArray array_MQB;
        JSONArray array_MQB37w;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map_MEB = new HashMap();
            map_MEB.put("platform_name", "MEB");

            Map map_MQB = new HashMap();
            map_MQB.put("platform_name", "MQB");

            Map map_MQB37w = new HashMap();
            map_MQB37w.put("platform_name", "MQB37w");

            result_MEB = iB1_statService.getIB1_stat(map_MEB);
            result_MQB = iB1_statService.getIB1_stat(map_MQB);
            result_MQB37w = iB1_statService.getIB1_stat(map_MQB37w);

            list_MEB = JSON.toJSONString(result_MEB);
            list_MQB = JSON.toJSONString(result_MQB);
            list_MQB37w = JSON.toJSONString(result_MQB37w);

            array_MEB = JSONArray.parseArray(list_MEB);
            array_MQB = JSONArray.parseArray(list_MQB);
            array_MQB37w = JSONArray.parseArray(list_MQB37w);

            Class_stat class_stat = new Class_stat();
            JSONArray array_0 = JSONArray.parseArray("[]");

            //处理platform，如果为空，返回array_0的[]
            if(array_MEB.size() !=0 ){
                 class_stat.setMEB(array_MEB);
            }
            else {
                 class_stat.setMEB(array_0);
            }

            if(array_MQB.size() !=0 ){
                 class_stat.setMQB(array_MQB);
            }
            else {
                 class_stat.setMQB(array_0);
            }

            if(array_MQB37w.size() !=0 ){
                 class_stat.setMQB37w(array_MQB37w);
                }
            else {
                class_stat.setMQB37w(array_0);
            }

            String class_stat_jsonString = JSON.toJSONString(class_stat);

            String class_stat_jsonString_2 = "[" + class_stat_jsonString + "]";

            JSONArray jsonArray = JSONArray.parseArray(class_stat_jsonString_2);

            api.setPara(jsonArray);

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
