package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.*;
import service.IB1_BZD_ADDITIONAL_IDENTSService;
import service.IB1_BZD_BasicService;
import service.IB1_BZD_IDENTSService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_BZD_not_used_Controller {
    //controller调service层
/*    @Autowired
    @Qualifier("IB1_BZDServiceImpl")
    private IB1_BZDService iB1_BZDService;*/

    ApplicationContext context;

    @RequestMapping("/getIB1_BZD_not_used")
    public String getIB1_BZD(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,Model model){

        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //IB1_BZD
        IB1_BZD_BasicService iB1_BZD_BasicService = (IB1_BZD_BasicService)context.getBean("IB1_BZD_BasicServiceImpl");
        IB1_BZD_IDENTSService iB1_BZD_IDENTSService = (IB1_BZD_IDENTSService)context.getBean("IB1_BZD_IDENTSServiceImpl");
        IB1_BZD_ADDITIONAL_IDENTSService iB1_BZD_ADDITIONAL_IDENTSService = (IB1_BZD_ADDITIONAL_IDENTSService)context.getBean("IB1_BZD_ADDITIONAL_IDENTSServiceImpl");

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_BZD info");
        api.setError("null");

        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;


            //IB1_BZD
            /*List<IB1_BZD_IDENTSLei> IB1_BZD_IDENTS_TARGET_DATElist = null;
            List<IB1_BZD_IDENTSLei> IB1_BZD_S42_ATTRIBUTES_ADDEDlist = null;*/

            //List<IB1_BZD_BasicLei> IB1_BZD_Basiclist = null;
            List<IB1_BZD_BasicLei> IB1_BZD_Basic_S42_ATTRIBUTES_ADDEDlist = null;
            List<IB1_BZD_BasicLei> IB1_BZD_Basic_TARGET_DATElist = null;

            List<IB1_BZD_IDENTSLei> IB1_BZD_IDENTSlist = null;
            List<IB1_BZD_IDENTSLei> IB1_BZD_IDENTS_DESClist = null;
            List<IB1_BZD_ADDITIONAL_IDENTSLei> IB1_BZD_ADDITIONAL_IDENTSlist = null;
            List<IB1_BZD_ADDITIONAL_IDENTSLei> IB1_BZD_ADDITIONAL_IDENTS_DESClist = null;

            //IB1_BZD

            /*String IB1_BZD_IDENTS_TARGET_DATE_list= null;
            String IB1_BZD_S42_ATTRIBUTES_ADDED_list= null;*/

            //String IB1_BZD_Basic_list= null;
            String IB1_BZD_S42_ATTRIBUTES_ADDED_list= null;
            String IB1_BZD_TARGET_DATE_list= null;
            String IB1_BZD_IDENTS_list= null;
            String IB1_BZD_IDENTS_DESC_list= null;

            String IB1_BZD_ADDITIONAL_IDENTS_list= null;
            String IB1_BZD_ADDITIONAL_IDENTS_DESC_list= null;

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //IB1_BZD
            /*IB1_BZD_IDENTS_TARGET_DATElist = iB1_BZD_IDENTSService.getIB1_BZD_TARGET_DATE(map);
            IB1_BZD_S42_ATTRIBUTES_ADDEDlist = iB1_BZD_IDENTSService.getIB1_BZD_S42_ATTRIBUTES_ADDED(map);*/

            //IB1_BZD_Basiclist = iB1_BZD_BasicService.getIB1_BZD_Basic(map);

            IB1_BZD_Basic_S42_ATTRIBUTES_ADDEDlist = iB1_BZD_BasicService.getIB1_BZD_Basic_S42_ATTRIBUTES_ADDED(map);
            IB1_BZD_Basic_TARGET_DATElist = iB1_BZD_BasicService.getIB1_BZD_Basic_TARGET_DATE(map);

            IB1_BZD_IDENTSlist = iB1_BZD_IDENTSService.getIB1_BZD_IDENTS(map);
            IB1_BZD_IDENTS_DESClist = iB1_BZD_IDENTSService.getIB1_BZD_IDENTS_DESC(map);

            IB1_BZD_ADDITIONAL_IDENTSlist = iB1_BZD_ADDITIONAL_IDENTSService.getIB1_BZD_ADDITIONAL_IDENTS(map);
            IB1_BZD_ADDITIONAL_IDENTS_DESClist = iB1_BZD_ADDITIONAL_IDENTSService.getIB1_BZD_ADDITIONAL_IDENTS_DESC(map);

            //将list转换成JSONToString
            //IB1_BZD
            /*IB1_BZD_IDENTS_TARGET_DATE_list = JSON.toJSONString(IB1_BZD_IDENTS_TARGET_DATElist);
            IB1_BZD_S42_ATTRIBUTES_ADDED_list = JSON.toJSONString(IB1_BZD_S42_ATTRIBUTES_ADDEDlist);*/

            //IB1_BZD_Basic_list = JSON.toJSONString(IB1_BZD_Basiclist);

            IB1_BZD_S42_ATTRIBUTES_ADDED_list = JSON.toJSONString(IB1_BZD_Basic_S42_ATTRIBUTES_ADDEDlist);
            IB1_BZD_TARGET_DATE_list = JSON.toJSONString(IB1_BZD_Basic_TARGET_DATElist);

            IB1_BZD_IDENTS_DESC_list = JSON.toJSONString(IB1_BZD_IDENTS_DESClist);

            IB1_BZD_IDENTS_list = JSON.toJSONString(IB1_BZD_IDENTSlist);
            IB1_BZD_ADDITIONAL_IDENTS_list = JSON.toJSONString(IB1_BZD_ADDITIONAL_IDENTSlist);
            IB1_BZD_ADDITIONAL_IDENTS_DESC_list = JSON.toJSONString(IB1_BZD_ADDITIONAL_IDENTS_DESClist);

            //transform to JSONArray，JSONString转成JSONArray的
            //IB1_BZD


/*            JSONArray IB1_BZD_IDENTS_TARGET_DATE_array = JSONArray.parseArray(IB1_BZD_IDENTS_TARGET_DATE_list);
            JSONArray IB1_BZD_S42_ATTRIBUTES_ADDED_array = JSONArray.parseArray(IB1_BZD_S42_ATTRIBUTES_ADDED_list);*/

            //JSONArray IB1_BZD_Basic_array = JSONArray.parseArray(IB1_BZD_Basic_list);

            JSONArray IB1_BZD_S42_ATTRIBUTES_ADDED_array = JSONArray.parseArray(IB1_BZD_S42_ATTRIBUTES_ADDED_list);
            JSONArray IB1_BZD_TARGET_DATE_array = JSONArray.parseArray(IB1_BZD_TARGET_DATE_list);

            JSONArray IB1_BZD_IDENTS_DESC_array = JSONArray.parseArray(IB1_BZD_IDENTS_DESC_list);

            JSONArray IB1_BZD_IDENTS_array = JSONArray.parseArray(IB1_BZD_IDENTS_list);
            JSONArray IB1_BZD_ADDITIONAL_IDENTS_array = JSONArray.parseArray(IB1_BZD_ADDITIONAL_IDENTS_list);
            JSONArray IB1_BZD_ADDITIONAL_IDENTS_DESC_array = JSONArray.parseArray(IB1_BZD_ADDITIONAL_IDENTS_DESC_list);


            //class_b是有二级目录的，只有3个有二级目录
            //IB1_BZD
            Class_B class_b5 = new Class_B();
            JSONArray array_0 = JSONArray.parseArray("[]");
            //存到class_b对象里
            //IB1_BZD

            //处理IDENTS_DESC，如果为空，返回array_0的[]
            if(IB1_BZD_IDENTS_DESC_array.size() !=0 ){
                if(IB1_BZD_IDENTS_DESC_array.getJSONObject(0).values().toString().length() != 2) {
                    class_b5.setIDENTS_DESC(IB1_BZD_IDENTS_DESC_array);
                }
                else {
                    class_b5.setIDENTS_DESC(array_0);
                }
            }


            //处理IADDITIONAL_IDENTS_DESC，如果为空，返回array_0的[]

            if(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.size()!=0){
                if(IB1_BZD_ADDITIONAL_IDENTS_DESC_array.getJSONObject(0).values().toString().length() != 2) {
                    class_b5.setADDITIONAL_IDENTS_DESC(IB1_BZD_ADDITIONAL_IDENTS_DESC_array);
                }
                else {
                    class_b5.setADDITIONAL_IDENTS_DESC(array_0);
                }
            }


            //处理S42_ATTRIBUTES_ADDED，如果为空，返回array_0的[]
            if(IB1_BZD_S42_ATTRIBUTES_ADDED_array.size()!=0){
                if(IB1_BZD_S42_ATTRIBUTES_ADDED_array.getJSONObject(0).values().toString().length() != 2) {
                    class_b5.setS42_ATTRIBUTES_ADDED(IB1_BZD_S42_ATTRIBUTES_ADDED_array);
                }
                else {
                    class_b5.setS42_ATTRIBUTES_ADDED(array_0);
                }
            }


            //处理TARGET_DATE，如果为空，返回array_0的[]

            if(IB1_BZD_TARGET_DATE_array.size()!=0){
                if(IB1_BZD_TARGET_DATE_array.getJSONObject(0).values().toString().length() != 2) {
                    class_b5.setTARGET_DATE(IB1_BZD_TARGET_DATE_array);
                }
                else {
                    class_b5.setTARGET_DATE(array_0);
                }
            }

            //以下两个不处理
            class_b5.setIDENTS(IB1_BZD_IDENTS_array);
            class_b5.setADDITIONAL_IDENTS(IB1_BZD_ADDITIONAL_IDENTS_array);

            //将class_b json对象转成JSONString
            String class_b_JSON_BZD=JSON.toJSONString(class_b5);

            String class_b_JSON_plus_BZD = "[" + class_b_JSON_BZD + "]";
            //将List转换为JSONArray
            array = JSONArray.parseArray(class_b_JSON_plus_BZD);
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
        return "standard";
    }

}
