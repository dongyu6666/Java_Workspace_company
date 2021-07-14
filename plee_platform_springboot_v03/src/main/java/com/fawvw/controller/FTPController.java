package com.fawvw.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fawvw.pojo.API;
import net.sf.json.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FTPController {

    @RequestMapping("/deleteFTPfile")
/*
    public String deleteFTPfile(@RequestParam(value = "platform_name", required = false) String platform_name, @RequestParam(value="IB1_filename", required=false) String IB1_filename)
*/
    public String deleteFTPfile(@RequestParam(value = "para", required = false) List para) {



        API api = new API();
        api.setStatus("true");
        api.setInfo("delete ftp file");
        api.setError("null");

        String s = JSON.toJSONString(para);


       JSONObject jsonObject = JSONObject.parseObject(s);

       System.out.println(jsonObject);
       // Object platform_name = para.getJSONObject(0).get("platform_name");
        //System.out.println(platform_name);

        /*for (int i = 0; i < size; i++) {
            Object platform_name = para.getJSONObject(i).get("platform_name");
            Object IB1_filename = para.getJSONObject(i).get("IB1_filename");
            System.out.println(platform_name);
            System.out.println(IB1_filename);
            String path1 = "\\\\IB1_Source_file";
            String path2 = platform_name.toString();
            String path3 = IB1_filename.toString();

            String path_zip = path3.substring(0,path3.length()-3) + "zip";

            String filepath_xml = path1 +"\\\\"+ path2 +"\\\\" + path3;
            String filepath_zip = path1 +"\\\\"+ path2 +"\\\\" + path_zip;

            FTPClient ftp = new FTPClient();
            Logger logger = LoggerFactory.getLogger(this.getClass());

            try {
                ftp.connect("10.220.15.230", 21);
                ftp.login("server", "dsa123");
                ftp.deleteFile(filepath_zip);
                System.out.println("zip删除成功");
                ftp.deleteFile(filepath_xml);
                System.out.println("xml删除成功");

                ftp.logout();
                ftp.disconnect();
            } catch (Exception e) {
                logger.error("FTP文件删除失败！" + e.toString());
                api.setStatus("false");
                api.setError(e.getCause().getMessage());
            } finally {
                if (ftp.isConnected()) {
                    try {
                        ftp.disconnect();
                    } catch (IOException ioe) {
                        logger.error(ioe.toString());
                    }
                }
            }

        }*/
       String json = JSON.toJSONString(api);
        System.out.println("FrontEnd will get: " + json);
        return json;
    }

}
