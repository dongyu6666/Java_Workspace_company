package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.*;
import com.fawvw.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IB1_ENVIRONMENTController {
    //controller调service层
    @Autowired
    private IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService;

    @Autowired
    private IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService;

    @Autowired
    private IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService iB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService;

    @Autowired
    private IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService;

    @Autowired
    private IB1_ENVIRONMENT_TRANSPORT_MODEService iB1_ENVIRONMENT_TRANSPORT_MODEService;

    @RequestMapping("/getIB1_ENVIRONMENT")
    public String getIB1_ENVIRONMENT(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, Model model){

        //ENVIRONMENT

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_ENVIRONMENT info");
        api.setError("null");

        JSONArray array;

        JSONArray IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_array;
        JSONArray IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_array;
        JSONArray IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_array;
        JSONArray IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_array;
        JSONArray IB1_ENVIRONMENT_TRANSPORT_MODE_array;

        List<IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei> IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist = null;
        List<IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei> IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist = null;
        List<IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONLei> IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist = null;
        List<IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei> IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist = null;
        List<IB1_ENVIRONMENT_TRANSPORT_MODELei> IB1_ENVIRONMENT_TRANSPORT_MODElist = null;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;

            //数据库查出的原生list

            //ENVIRONMENT
            String IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_list= null;
            String IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_list= null;
            String IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_list= null;
            String IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_list= null;
            String IB1_ENVIRONMENT_TRANSPORT_MODE_list= null;

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //数据库查出的原生list

            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist = iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService.getIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(map);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist = iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService.getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(map);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist = iB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService.getIB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION(map);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist = iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService.getIB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE(map);
            IB1_ENVIRONMENT_TRANSPORT_MODElist = iB1_ENVIRONMENT_TRANSPORT_MODEService.getIB1_ENVIRONMENT_TRANSPORT_MODE(map);

            //将list转换成JSONToString
            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_list = JSON.toJSONString(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_list = JSON.toJSONString(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_list = JSON.toJSONString(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_list = JSON.toJSONString(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist);
            IB1_ENVIRONMENT_TRANSPORT_MODE_list = JSON.toJSONString(IB1_ENVIRONMENT_TRANSPORT_MODElist);

            //transform to JSONArray，JSONString转成JSONArray的
            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_array = JSONArray.parseArray(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_list);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_array = JSONArray.parseArray(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_list);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_array = JSONArray.parseArray(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_list);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_array = JSONArray.parseArray(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_list);
            IB1_ENVIRONMENT_TRANSPORT_MODE_array = JSONArray.parseArray(IB1_ENVIRONMENT_TRANSPORT_MODE_list);

            //class_b是有二级目录的，只有3个有二级目录
            //ENVIRONMENT
            Class_B class_b3 = new Class_B();

            //存到class_b对象里
            //ENVIRONMENT
            class_b3.setPRE_CONDITIONS(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_array);
            class_b3.setDEPENDENCIES(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_array);
            class_b3.setACCESS_AUTHORISATIONS(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_array);
            class_b3.setPRODUCTION_MODES(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_array);
            class_b3.setTRANSPORT_MODE(IB1_ENVIRONMENT_TRANSPORT_MODE_array);

            //将class_b json对象转成JSONString
            String class_b_JSON_ENVIRONMENT=JSON.toJSONString(class_b3);

            String class_b_JSON_plus_ENVIRONMENT = "[" + class_b_JSON_ENVIRONMENT + "]";
            //将List转换为JSONArray
            array = JSONArray.parseArray(class_b_JSON_plus_ENVIRONMENT);

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
