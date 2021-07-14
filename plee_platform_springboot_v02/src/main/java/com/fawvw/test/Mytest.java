package com.fawvw.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringEscapeUtils;

import java.io.File;

public class Mytest {

    public static void main(String[] args) {
/*        String path1 = "\\\\IB1_Source_file";
        String path2 = "MEB";
        String path3 = "skills.txt";
        String filepath = path1 +"\\\\"+ path2 +"\\\\" + path3;

        System.out.println(filepath);
        String path_xml = "IB1_8128_Smartlight_MEB_V1_7.xml";
        String path_zip = path_xml.substring(0,path_xml.length()-3) + "zip";
        System.out.println(path_zip);*/

        String test = "[{\"platform_name\": \"MQB\",\"IB1_filename\": \"IB1_8128_Smartlight_MEB_V1_7.xml\"},{\"platform_name\": \"MQB\",\"IB1_filename\": \"IB1_006C_AreaView_Gen_2_MQB_V1_18.xml\"}]";
        String jsonstring = JSON.toJSONString(test);
        System.out.println(jsonstring);

        String s = StringEscapeUtils.unescapeJava(jsonstring);
        String substring = s.substring(1, s.length() - 1);
        //com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSONObject.parseObject(substring);
        JSONArray jsonArray = JSONArray.parseArray(substring);
        int size = jsonArray.size();
        System.out.println(size);
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(jsonObject);
        Object platform_name = jsonArray.getJSONObject(0).get("platform_name");
        System.out.println(platform_name);


    }

}
