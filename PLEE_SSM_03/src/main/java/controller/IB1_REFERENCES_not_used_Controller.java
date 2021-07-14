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
import pojo.API;
import pojo.Class_B;
import pojo.IB1_REFERENCES_REGULATIONS_REGULATIONLei;
import pojo.IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei;
import service.IB1_REFERENCES_REGULATIONS_REGULATIONService;
import service.IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_REFERENCES_not_used_Controller {
    //controller调service层
   /* @Autowired
    @Qualifier("IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTServiceImpl")
    private IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService;*/

    ApplicationContext context;

    @RequestMapping("/getIB1_REFERENCES_not_used")
    public String getIB1_REFERENCES(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,Model model){

        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IB1_REFERENCES
        IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService = (IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService)context.getBean("IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTServiceImpl");
        IB1_REFERENCES_REGULATIONS_REGULATIONService iB1_REFERENCES_REGULATIONS_REGULATIONService = (IB1_REFERENCES_REGULATIONS_REGULATIONService)context.getBean("IB1_REFERENCES_REGULATIONS_REGULATIONServiceImpl");

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_REFERENCES info");
        api.setError("null");

        String list= null;
        List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> result;
        JSONArray array;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;


            //IB1_REFERENCES
            List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist = null;
            List<IB1_REFERENCES_REGULATIONS_REGULATIONLei> IB1_REFERENCES_REGULATIONS_REGULATIONlist = null;

            //IB1_REFERENCES
            String IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list= null;
            String IB1_REFERENCES_REGULATIONS_REGULATION_list= null;

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //IB1_REFERENCES
            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist = iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService.getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(map);
            IB1_REFERENCES_REGULATIONS_REGULATIONlist = iB1_REFERENCES_REGULATIONS_REGULATIONService.getIB1_REFERENCES_REGULATIONS_REGULATION(map);

            //将list转换成JSONToString
            //IB1_REFERENCES

            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list = JSON.toJSONString(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist);
            IB1_REFERENCES_REGULATIONS_REGULATION_list = JSON.toJSONString(IB1_REFERENCES_REGULATIONS_REGULATIONlist);

            //transform to JSONArray，JSONString转成JSONArray的
            //IB1_REFERENCES
            JSONArray IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_array = JSONArray.parseArray(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list);
            JSONArray IB1_REFERENCES_REGULATIONS_REGULATION_array = JSONArray.parseArray(IB1_REFERENCES_REGULATIONS_REGULATION_list);


            //class_b是有二级目录的，只有3个有二级目录
            //IB1_REFERENCES
            Class_B class_b4 = new Class_B();

            //存到class_b对象里
            //IB1_REFERENCES
            class_b4.setRELATED_DOCUMENT(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_array);
            class_b4.setREGULATION(IB1_REFERENCES_REGULATIONS_REGULATION_array);

            //将class_b json对象转成JSONString
            String class_b_JSON_REFERENCES=JSON.toJSONString(class_b4);

            String class_b_JSON_plus_REFERENCES = "[" + class_b_JSON_REFERENCES + "]";
            //将List转换为JSONArray
            array = JSONArray.parseArray(class_b_JSON_plus_REFERENCES);

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
