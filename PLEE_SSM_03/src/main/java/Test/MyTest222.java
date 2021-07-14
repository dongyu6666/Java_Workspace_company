package Test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.API;
import pojo.API_2;
import pojo.IB1_SECURITY_PROPERTIESLei;
import pojo.UserLei;
import service.IB1_BZD_BasicService;
import service.IB1_SECURITY_PROPERTIESService;
import service.IB1_SECURITY_PROPERTIESServiceImpl;
import service.UserService;
import sun.plugin.javascript.navig.Array;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyTest222 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IB1_SECURITY_PROPERTIESService iB1_SECURITY_PROPERTIESService = (IB1_SECURITY_PROPERTIESService)context.getBean("IB1_SECURITY_PROPERTIESServiceImpl");

        API_2 api_2 = new API_2();
        api_2.setStatus("true");
        api_2.setInfo("offer all IB1_SECURITY_PROPERTIES info");
        api_2.setError("null");
          //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean = true;
            Map map = new HashMap();
            map.put("platform_name", "MEB");
            map.put("IB1_VERSION", "2_4");
            map.put("diagnose_adr", "WFS");
       //List<IB1_SECURITY_PROPERTIESLei> result = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map);
        List<IB1_SECURITY_PROPERTIESLei> result_NAME = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES_NAME(map);
        List<IB1_SECURITY_PROPERTIESLei> result_NAME_ID = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES_NAME_AND_ID(map);
        //String list = JSON.toJSONString(result);
        String list_NAME = JSON.toJSONString(result_NAME);
        String list_NAME_ID = JSON.toJSONString(result_NAME_ID);
        //JSONArray array1 = JSONArray.parseArray(list);
        JSONArray array_NAME = JSONArray.parseArray(list_NAME);
        JSONArray array_NAME_ID = JSONArray.parseArray(list_NAME_ID);

        //System.out.println("array_NAME:" + array_NAME);
        //System.out.println("array_NAME_ID:"+array_NAME_ID);
        /*int i = 2;
        Map map2 = new HashMap();
        map2.put("platform_name", "MEB");
        map2.put("IB1_VERSION", "5_0");
        map2.put("diagnose_adr", "KS");
        JSONObject jsonObject_NAME = array_NAME.getJSONObject(i);

        map2.put("ECU_NAME", array_NAME.getJSONObject(i).values().toString().substring(1,array_NAME.getJSONObject(i).values().toString().length()-1));
        List<IB1_SECURITY_PROPERTIESLei> result_SECURITY = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map2);
        System.out.println(result_SECURITY);*/

 /*       Map map2 = new HashMap();
        map2.put("platform_name", "MEB");
        map2.put("IB1_VERSION", "2_4");
        map2.put("diagnose_adr", "WFS");
        map2.put("ECU_NAME", "ICAS1");
        List<IB1_SECURITY_PROPERTIESLei> result_SECURITY = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map2);
        System.out.println(result_SECURITY);*/
        //JSONArray finalArrayA = new JSONArray();
        JSONArray finalArrayB = new JSONArray();

        for (int i = 0; i < array_NAME.size(); i++) {

            Map map2 = new HashMap();
            map2.put("platform_name", "MEB");
            map2.put("IB1_VERSION", "2_4");
            map2.put("diagnose_adr", "WFS");
            JSONObject jsonObject_NAME = array_NAME.getJSONObject(i);
            //System.out.println(jsonObject_NAME);

            map2.put("ECU_NAME", array_NAME.getJSONObject(i).values().toString().substring(1,array_NAME.getJSONObject(i).values().toString().length()-1));
            List<IB1_SECURITY_PROPERTIESLei> result_NAME_AND_ID = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES_NAME_AND_ID(map2);
            List<IB1_SECURITY_PROPERTIESLei> result_SECURITY = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map2);

            String NAME_AND_ID_JsonString = JSON.toJSONString(result_NAME_AND_ID);
            String SECURITY_JsonString = JSON.toJSONString(result_SECURITY);

            JSONArray NAME_AND_ID_jsonArray = JSONArray.parseArray(NAME_AND_ID_JsonString);
            JSONArray SECURITY_jsonArray = JSONArray.parseArray(SECURITY_JsonString);

            /*System.out.println("NAME_AND_ID_jsonArray:"+NAME_AND_ID_jsonArray);
            System.out.println("SECURITY_jsonArray:"+SECURITY_jsonArray);*/
            JSONArray finalArrayC = new JSONArray();

            finalArrayC.add(NAME_AND_ID_jsonArray);
            finalArrayC.add(SECURITY_jsonArray);

            finalArrayB.add(finalArrayC);

            //System.out.println("result_NAME_AND_ID++++++++:"+i+"========"+result_NAME_AND_ID);
            //System.out.println("result_SECURITY:"+i+"========"+result_SECURITY);
        }

        System.out.println(finalArrayB);


        //String json1 = JSON.toJSONString(array1);
        //String json2 = JSON.toJSONString(array2);


        //System.out.println(json1);

        //System.out.println("====================");

        //System.out.println(json2);
        //api.setPara(array);
       /* } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }*/
        //String json = JSON.toJSONString(api);
        //System.out.println("FrontEnd will get: " + json);
    }
}


