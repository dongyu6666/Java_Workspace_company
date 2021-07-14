package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.API;
import com.fawvw.pojo.IB1_PROCEDURES_PROCEDURELei;
import com.fawvw.service.IB1_PROCEDURES_PROCEDUREService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IB1_PROCEDURES_PROCEDUREController {
    //controller调service层
    @Autowired
    private IB1_PROCEDURES_PROCEDUREService iB1_PROCEDURES_PROCEDURService;

    @RequestMapping("/getIB1_PROCEDURES_PROCEDURE")
    public String getIB1_PROCEDURES_PROCEDURE(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_PROCEDURES_PROCEDURE info");
        api.setError("null");

        String list= null;
        List<IB1_PROCEDURES_PROCEDURELei> result;
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

            result = iB1_PROCEDURES_PROCEDURService.getIB1_PROCEDURES_PROCEDURE(map);
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

    @RequestMapping("/getIB1_BLOCK_NAME")
    public String getIB1_BLOCK_NAME(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION, @RequestParam(value="diagnose_adr", required=false) String diagnose_adr, @RequestParam(value="BLOCK_NAME", required=false) String BLOCK_NAME, @RequestParam(value="BLOCK_id", required=false) String BLOCK_id, Model model){
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_BLOCK_NAME info");
        api.setError("null");

        String list= null;
        List<IB1_PROCEDURES_PROCEDURELei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;

            //用正则表达式将IB1_filename中的IB1_VERSION筛选出来
/*            Regex regex = new Regex();
            String IB1_filename = IB1_VERSION;
            regex.setIB1_filename(IB1_filename);
            String IB1_VERSION_real = null;
            //避免空指针异常，先判断是否为空
            if(IB1_filename != null && IB1_filename != ""){
                Pattern p = Pattern.compile("(?<=V)\\d\\d?\\d?_\\d\\d?\\d?");
                Matcher matcher = p.matcher(IB1_filename);
                while(matcher.find()){
                    String IB1_VERSION_after = matcher.group();
                    regex.setIB1_VERSION_real(IB1_VERSION_after);
                }
            }*/
            //最终得到IB1_Version
            //IB1_VERSION_real = regex.getIB1_VERSION_real();

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);
            map.put("BLOCK_NAME", BLOCK_NAME);
            map.put("BLOCK_id", BLOCK_id);

            result = iB1_PROCEDURES_PROCEDURService.getIB1_BLOCK_NAME(map);
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
