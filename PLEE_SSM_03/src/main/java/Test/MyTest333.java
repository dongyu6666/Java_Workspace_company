package Test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.*;
import service.IB1_BZD_ADDITIONAL_IDENTSService;
import service.IB1_BZD_BasicService;
import service.IB1_BZD_IDENTSService;
import service.IB1_SECURITY_PROPERTIESService;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyTest333 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IB1_BZD_IDENTSService iB1_BZD_IDENTSService = (IB1_BZD_IDENTSService)context.getBean("IB1_BZD_IDENTSServiceImpl");
        IB1_BZD_BasicService iB1_BZD_BasicService = (IB1_BZD_BasicService)context.getBean("IB1_BZD_BasicServiceImpl");
        IB1_BZD_ADDITIONAL_IDENTSService iB1_BZD_ADDITIONAL_IDENTSService = (IB1_BZD_ADDITIONAL_IDENTSService)context.getBean("IB1_BZD_ADDITIONAL_IDENTSServiceImpl");

        Map map = new HashMap();
        map.put("platform_name", "MEB");
        map.put("IB1_VERSION", "1_10");
        map.put("diagnose_adr", "8125");

    /*    map.put("platform_name", "MEB");
        map.put("IB1_VERSION", "1_16");
        map.put("diagnose_adr", "0015");*/
        List<IB1_BZD_BasicLei> IB1_BZD_Basic_TARGET_DATElist = iB1_BZD_BasicService.getIB1_BZD_Basic_TARGET_DATE(map);
        List<IB1_BZD_IDENTSLei> IB1_BZD_IDENTSlist = iB1_BZD_IDENTSService.getIB1_BZD_IDENTS(map);
        String list_TARGET_DATE = JSON.toJSONString(IB1_BZD_Basic_TARGET_DATElist);
        String list_IDENTS = JSON.toJSONString(IB1_BZD_IDENTSlist);
        JSONArray array_TARGET_DATE = JSONArray.parseArray(list_TARGET_DATE);
        JSONArray array_list_IDENTS = JSONArray.parseArray(list_IDENTS);





        JSONArray array_TARGET_DATE0 = JSONArray.parseArray("[]");


        Class_B class_b5 = new Class_B();
/*        class_b5.setTARGET_DATE(array_TARGET_DATE0);
        class_b5.setIDENTS(array_list_IDENTS);*/

        //System.out.println(class_b5.toString());

        List<IB1_BZD_ADDITIONAL_IDENTSLei> IB1_BZD_ADDITIONAL_IDENTS_DESClist = iB1_BZD_ADDITIONAL_IDENTSService.getIB1_BZD_ADDITIONAL_IDENTS_DESC(map);

        String IB1_BZD_ADDITIONAL_IDENTS_DESC_list = JSON.toJSONString(IB1_BZD_ADDITIONAL_IDENTS_DESClist);

        JSONArray IB1_BZD_ADDITIONAL_IDENTS_DESC_array = JSONArray.parseArray(IB1_BZD_ADDITIONAL_IDENTS_DESC_list);
        //IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).values().toString().length();
        //System.out.println(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).values());
        //System.out.println(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).values().toString().length());
        IB1_BZD_ADDITIONAL_IDENTS_DESC_array.size();
        System.out.println(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.size());
        JSONArray array_0 = JSONArray.parseArray("[]");

        if(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.size()!=0){
            if(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).values().toString().length() != 2) {
                class_b5.setADDITIONAL_IDENTS_DESC(IB1_BZD_ADDITIONAL_IDENTS_DESC_array);
            }
            else {
                class_b5.setADDITIONAL_IDENTS_DESC(array_0);
            }
        }
        System.out.println(class_b5.toString());


       /* if(!IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).toString().isEmpty()){

                *//*if( IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).values().toString().length() != 2) {
            System.out.println("执行了");
            }*//*
            System.out.println("2222222222");
        }*/

        //System.out.println(!IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).toString().isEmpty());

        //System.out.println(array0);
/*        String class_b_JSON_BZD = class_b5.toString();
        String class_b_JSON_plus_BZD = "[" + class_b_JSON_BZD + "]";
        //将List转换为JSONArray
        JSONArray array_Final = JSONArray.parseArray(class_b_JSON_plus_BZD);

        System.out.println(array_Final);*/

        //System.out.println(list);
        //String list_NAME = JSON.toJSONString(result);
        //JSONArray array1 = JSONArray.parseArray(list);
/*
        JSONArray array_NAME = JSONArray.parseArray(list);
*/
  /*      Collection<Object> values = array_NAME.getJSONObject(0).values();
        if(array_NAME.getJSONObject(0).values().toString().length() == 2)
        {

        }
*/

        //System.out.println("values:"+values);
        //System.out.println(array_NAME);


/*        Map map0 = new HashMap();

        List<IB1_BZD_BasicLei> IB1_BZD_0 = iB1_BZD_BasicService.getIB1_BZD_Basic_TARGET_DATE(map0);
        String list0 = JSON.toJSONString(IB1_BZD_0);
        JSONArray array0 = JSONArray.parseArray(list0);
        class_b5.setTARGET_DATE(array0);
        System.out.println(class_b5);*/
    }

}
