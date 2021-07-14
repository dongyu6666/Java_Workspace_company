package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.*;
import service.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_IB_DESCRIPTION_not_used_Controller {
    //controller调service层
    //@Autowired
    //@Qualifier("IB1_DOC_INFO_CONTACTSServiceImpl")
    //private IB1_DOC_INFO_CONTACTSService iB1_DOC_INFO_CONTACTSService;
    //@Qualifier("IB1_IB_DESCRIPTION_IB_VARIANTSServiceImpl")
    //@Qualifier("IB1_IB_DESCRIPTION_OBJECTIVESServiceImpl")


    ApplicationContext context;


    @RequestMapping("/getIB1_IB_DESCRIPTION_not_used")
    public String getIB1_IB_DESCRIPTION(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,Model model){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //IB_DESCRIPTION
        IB1_IB_DESCRIPTION_IB_VARIANTSService iB1_IB_DESCRIPTION_IB_VARIANTSService = (IB1_IB_DESCRIPTION_IB_VARIANTSService)context.getBean("IB1_IB_DESCRIPTION_IB_VARIANTSServiceImpl");
        IB1_IB_DESCRIPTION_OBJECTIVESService iB1_IB_DESCRIPTION_OBJECTIVESService = (IB1_IB_DESCRIPTION_OBJECTIVESService)context.getBean("IB1_IB_DESCRIPTION_OBJECTIVESServiceImpl");
        IB1_IB_DESCRIPTION_IBNZService iB1_IB_DESCRIPTION_IBNZService = (IB1_IB_DESCRIPTION_IBNZService)context.getBean("IB1_IB_DESCRIPTION_IBNZServiceImpl");
        IB1_IB_DESCRIPTION_SLAVEService iB1_IB_DESCRIPTION_SLAVEService = (IB1_IB_DESCRIPTION_SLAVEService)context.getBean("IB1_IB_DESCRIPTION_SLAVEServiceImpl");

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_IB_DESCRIPTION info");
        api.setError("null");

        //String list= null;
        JSONArray array;

        //数据库查出的原生list
        //IB_DESCRIPTION
        List<IB1_IB_DESCRIPTION_IB_VARIANTSLei> IB1_IB_DESCRIPTION_IB_VARIANTSlist = null;
        List<IB1_IB_DESCRIPTION_OBJECTIVESLei> IB1_IB_DESCRIPTION_OBJECTIVESlist = null;
        List<IB1_IB_DESCRIPTION_IBNZLei> IB1_IB_DESCRIPTION_IBNZlist = null;
        List<IB1_IB_DESCRIPTION_SLAVELei> IB1_IB_DESCRIPTION_SLAVElist = null;

        //IB_DESCRIPTION
        String IB1_IB_DESCRIPTION_IB_VARIANTS_list= null;
        String IB1_IB_DESCRIPTION_OBJECTIVES_list= null;
        String IB1_IB_DESCRIPTION_IBNZ_list= null;
        String IB1_IB_DESCRIPTION_SLAVE_list= null;

        JSONArray IB1_IB_DESCRIPTION_IB_VARIANTS_array;
        JSONArray IB1_IB_DESCRIPTION_OBJECTIVES_array;
        JSONArray IB1_IB_DESCRIPTION_IBNZ_array;
        JSONArray IB1_IB_DESCRIPTION_SLAVE_array;

        String class_b_JSON_IB_DESCRIPTION;
        String class_b_JSON_plus_IB_DESCRIPTION;



        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //数据库查出的原生list

            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTSlist = iB1_IB_DESCRIPTION_IB_VARIANTSService.getIB1_IB_DESCRIPTION_IB_VARIANTS(map);
            IB1_IB_DESCRIPTION_OBJECTIVESlist = iB1_IB_DESCRIPTION_OBJECTIVESService.getIB1_IB_DESCRIPTION_OBJECTIVES(map);
            IB1_IB_DESCRIPTION_IBNZlist = iB1_IB_DESCRIPTION_IBNZService.getIB1_IB_DESCRIPTION_IBNZ(map);
            IB1_IB_DESCRIPTION_SLAVElist = iB1_IB_DESCRIPTION_SLAVEService.getIB1_IB_DESCRIPTION_SLAVE(map);

            //将list转换成JSONToString
            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTS_list = JSON.toJSONString(IB1_IB_DESCRIPTION_IB_VARIANTSlist);
            IB1_IB_DESCRIPTION_OBJECTIVES_list = JSON.toJSONString(IB1_IB_DESCRIPTION_OBJECTIVESlist);
            IB1_IB_DESCRIPTION_IBNZ_list = JSON.toJSONString(IB1_IB_DESCRIPTION_IBNZlist);
            IB1_IB_DESCRIPTION_SLAVE_list = JSON.toJSONString(IB1_IB_DESCRIPTION_SLAVElist);

            //transform to JSONArray，JSONString转成JSONArray的
            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTS_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_IB_VARIANTS_list);
            IB1_IB_DESCRIPTION_OBJECTIVES_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_OBJECTIVES_list);
            IB1_IB_DESCRIPTION_IBNZ_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_IBNZ_list);
            IB1_IB_DESCRIPTION_SLAVE_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_SLAVE_list);

            //class_b是有二级目录的，只有3个有二级目录
            //DOC_INFO
            Class_B class_b2 = new Class_B();

            //存到class_b对象里
            //IB_DESCRIPTION
            class_b2.setIB_VARIANTS(IB1_IB_DESCRIPTION_IB_VARIANTS_array);
            class_b2.setOBJECTIVES(IB1_IB_DESCRIPTION_OBJECTIVES_array);
            class_b2.setIBNZ(IB1_IB_DESCRIPTION_IBNZ_array);
            class_b2.setSLAVES(IB1_IB_DESCRIPTION_SLAVE_array);

            //将class_b json对象转成JSONString
            class_b_JSON_IB_DESCRIPTION=JSON.toJSONString(class_b2);

            class_b_JSON_plus_IB_DESCRIPTION = "[" + class_b_JSON_IB_DESCRIPTION + "]";
            //将List转换为JSONArray
            array = JSONArray.parseArray(class_b_JSON_plus_IB_DESCRIPTION);

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
