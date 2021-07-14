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
import com.fawvw.pojo.*;
import com.fawvw.service.IB1_DOC_INFO_CONTACTSService;
import com.fawvw.service.IB1_DOC_INFO_DOC_REVISIONSService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IB1_DOC_INFOController {
    //controller调service层
    @Autowired
    private IB1_DOC_INFO_CONTACTSService iB1_DOC_INFO_CONTACTSService;

    @Autowired
    private IB1_DOC_INFO_DOC_REVISIONSService iB1_DOC_INFO_DOC_REVISIONSService;

    @RequestMapping("/getIB1_DOC_INFO")
    public String getIB1_DOC_INFO_CONTACTS(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, Model model){

        //DOC_INFO

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_DOC_INFO info");
        api.setError("null");

        String list= null;
        //List<IB1_DOC_INFO_CONTACTSLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;

            //数据库查出的原生list,DOC_INFO
            List<IB1_DOC_INFO_CONTACTSLei> IB1_DOC_INFO_CONTACTSlist = null;
            List<IB1_DOC_INFO_DOC_REVISIONSLei> IB1_DOC_INFO_DOC_REVISIONSlist = null;


            //DOC_INFO
            String IB1_DOC_INFO_CONTACTS_list= null;
            String IB1_DOC_INFO_DOC_REVISIONS_list= null;

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //数据库查出的原生list
            //IB1_Basic
            //DOC_INFO
            IB1_DOC_INFO_CONTACTSlist = iB1_DOC_INFO_CONTACTSService.getIB1_DOC_INFO_CONTACTS(map);
            IB1_DOC_INFO_DOC_REVISIONSlist = iB1_DOC_INFO_DOC_REVISIONSService.getIB1_DOC_INFO_DOC_REVISIONS(map);

            //将list转换成JSONToString
            //DOC_INFO
            IB1_DOC_INFO_CONTACTS_list = JSON.toJSONString(IB1_DOC_INFO_CONTACTSlist);
            IB1_DOC_INFO_DOC_REVISIONS_list = JSON.toJSONString(IB1_DOC_INFO_DOC_REVISIONSlist);

            //transform to JSONArray，JSONString转成JSONArray的
            //DOC_INFO
            JSONArray IB1_DOC_INFO_CONTACTS_array = JSONArray.parseArray(IB1_DOC_INFO_CONTACTS_list);
            JSONArray IB1_DOC_INFO_DOC_REVISIONS_array = JSONArray.parseArray(IB1_DOC_INFO_DOC_REVISIONS_list);

            //class_b是有二级目录的，只有3个有二级目录
            //DOC_INFO
            Class_B class_b1 = new Class_B();

            //存到class_b对象里
            //DOC_INFO
            class_b1.setCONTACTS(IB1_DOC_INFO_CONTACTS_array);
            class_b1.setDOC_REVISIONS(IB1_DOC_INFO_DOC_REVISIONS_array);

            //将class_b json对象转成JSONString
            String class_b_JSON_DOC_INFO=JSON.toJSONString(class_b1);

            String class_b_JSON_plus_DOC_INFO = "[" + class_b_JSON_DOC_INFO + "]";
            //将List转换为JSONArray
            array = JSONArray.parseArray(class_b_JSON_plus_DOC_INFO);

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
