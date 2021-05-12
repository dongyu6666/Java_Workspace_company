package daoTest;


import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test
{
    public static void main(String[] args) {

        ObjectMapper om = new ObjectMapper();



        JSONObject jsonObject=new JSONObject();
        //填充json数据内容
        jsonObject.put("username","liangdongyu");
        System.out.println(jsonObject);
        //json转化成字符串
        String JSONstring=jsonObject.toString();
        System.out.println(JSONstring);
        //字符串转化byte数组
        byte[] ClientBytes = JSONstring.getBytes();
        System.out.println(ClientBytes);
    }
}
