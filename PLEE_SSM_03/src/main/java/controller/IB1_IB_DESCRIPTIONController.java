package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.*;
import service.IB1_IB_DESCRIPTION_IBNZService;
import service.IB1_IB_DESCRIPTION_IB_VARIANTSService;
import service.IB1_IB_DESCRIPTION_OBJECTIVESService;
import service.IB1_IB_DESCRIPTION_SLAVEService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_IB_DESCRIPTIONController {

    @Autowired
    @Qualifier("IB1_IB_DESCRIPTION_IB_VARIANTSServiceImpl")
    private IB1_IB_DESCRIPTION_IB_VARIANTSService iB1_IB_DESCRIPTION_IB_VARIANTSService;

    @Autowired
    @Qualifier("IB1_IB_DESCRIPTION_IBNZServiceImpl")
    private IB1_IB_DESCRIPTION_IBNZService iB1_IB_DESCRIPTION_IBNZService;

    @Autowired
    @Qualifier("IB1_IB_DESCRIPTION_OBJECTIVESServiceImpl")
    private IB1_IB_DESCRIPTION_OBJECTIVESService iB1_IB_DESCRIPTION_OBJECTIVESService;

    @Autowired
    @Qualifier("IB1_IB_DESCRIPTION_SLAVEServiceImpl")
    private IB1_IB_DESCRIPTION_SLAVEService iB1_IB_DESCRIPTION_SLAVEService;

    @RequestMapping("/getIB1_IB_DESCRIPTION")
    public String getIB1_IB_DESCRIPTION(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,Model model){

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_IB_DESCRIPTION info");
        api.setError("null");

        JSONArray array;
        JSONArray IB1_IB_DESCRIPTION_IB_VARIANTS_array;
        JSONArray IB1_IB_DESCRIPTION_IBNZ_array;
        JSONArray IB1_IB_DESCRIPTION_OBJECTIVES_array;
        JSONArray IB1_IB_DESCRIPTION_SLAVE_array;

        List<IB1_IB_DESCRIPTION_IB_VARIANTSLei> result1;
        List<IB1_IB_DESCRIPTION_IBNZLei> result2;
        List<IB1_IB_DESCRIPTION_OBJECTIVESLei> result3;
        List<IB1_IB_DESCRIPTION_SLAVELei> result4;

        String list1= null;
        String list2= null;
        String list3= null;
        String list4= null;

        try {

            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            result1 = iB1_IB_DESCRIPTION_IB_VARIANTSService.getIB1_IB_DESCRIPTION_IB_VARIANTS(map);
            result2 = iB1_IB_DESCRIPTION_IBNZService.getIB1_IB_DESCRIPTION_IBNZ(map);
            result3 = iB1_IB_DESCRIPTION_OBJECTIVESService.getIB1_IB_DESCRIPTION_OBJECTIVES(map);
            result4 = iB1_IB_DESCRIPTION_SLAVEService.getIB1_IB_DESCRIPTION_SLAVE(map);

            list1 = JSON.toJSONString(result1);
            list2 = JSON.toJSONString(result2);
            list3 = JSON.toJSONString(result3);
            list4 = JSON.toJSONString(result4);

            IB1_IB_DESCRIPTION_IB_VARIANTS_array = JSONArray.parseArray(list1);
            IB1_IB_DESCRIPTION_IBNZ_array = JSONArray.parseArray(list2);
            IB1_IB_DESCRIPTION_OBJECTIVES_array = JSONArray.parseArray(list3);
            IB1_IB_DESCRIPTION_SLAVE_array = JSONArray.parseArray(list4);

            Class_B class_b2 = new Class_B();

            class_b2.setIB_VARIANTS(IB1_IB_DESCRIPTION_IB_VARIANTS_array);
            class_b2.setOBJECTIVES(IB1_IB_DESCRIPTION_OBJECTIVES_array);
            class_b2.setIBNZ(IB1_IB_DESCRIPTION_IBNZ_array);
            class_b2.setSLAVES(IB1_IB_DESCRIPTION_SLAVE_array);

            //将class_b json对象转成JSONString
            String class_b_JSON_IB_DESCRIPTION=JSON.toJSONString(class_b2);

            String class_b_JSON_plus_IB_DESCRIPTION = "[" + class_b_JSON_IB_DESCRIPTION + "]";
            //将List转换为JSONArray
            array = JSONArray.parseArray(class_b_JSON_plus_IB_DESCRIPTION);

            api.setPara(array);
        }
        catch (Exception e) {
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
