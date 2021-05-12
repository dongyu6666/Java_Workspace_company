package servlet;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class HTTPClient_getUserAll {

    //private static String urlPath="http://10.220.0.27:8888/getUserAll";
    private static String urlPath="http://localhost:8888/getUserAll";

    public static void main(String[] args) throws IOException {

        URL url = new URL(HTTPClient_getUserAll.urlPath);
        HttpURLConnection link=(HttpURLConnection) url.openConnection();

        link.setDoInput(true);
        link.setDoOutput(true);
        link.setRequestMethod("POST");
        link.setRequestProperty("Charset", "UTF-8");
        JSONObject jsonObject=new JSONObject();

        //请求
        DataOutputStream dataOutputStream = new DataOutputStream(link.getOutputStream());

        //json转化成字符串
        String string=jsonObject.toString();
        //字符串转化byte数组
        byte[] bytes=string.getBytes();
        //发送json数据
        //pWriter.write(bytes);
        //dataOutputStream.write(bytes);
        dataOutputStream.flush();//刷新，向服务器发送信息；

        dataOutputStream.close();
        //响应
        //列出原始数据
        StringBuilder json=new StringBuilder();
        BufferedReader in=new BufferedReader(new InputStreamReader(link.getInputStream(),"UTF-8"));
        String inputLine=null;
        while((inputLine=in.readLine())!=null) {
            json.append(inputLine);
        }
        in.close();
        String Strjson=json.toString();
        System.out.println("服务器返回的数据：");
        System.out.println(json);

    }




}
