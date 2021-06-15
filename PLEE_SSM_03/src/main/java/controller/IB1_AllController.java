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
import service.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IB1_AllController {
    //controller调service层
    //@Autowired
    ApplicationContext context;

    @RequestMapping("/getIB1_All")
    public String getIB1_All(@RequestParam(value="platform_name", required=false) String platform_name, @RequestParam(value="IB1_VERSION", required=false) String IB1_VERSION,@RequestParam(value="diagnose_adr", required=false) String diagnose_adr,Model model){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IB1_Basic
        IB1_BasicService iB1_BasicService = (IB1_BasicService)context.getBean("IB1_BasicServiceImpl");
        //DOC_INFO
        IB1_DOC_INFO_CONTACTSService iB1_DOC_INFO_CONTACTSService = (IB1_DOC_INFO_CONTACTSService)context.getBean("IB1_DOC_INFO_CONTACTSServiceImpl");
        IB1_DOC_INFO_DOC_REVISIONSService iB1_DOC_INFO_DOC_REVISIONSService = (IB1_DOC_INFO_DOC_REVISIONSService)context.getBean("IB1_DOC_INFO_DOC_REVISIONSServiceImpl");

        //IB_DESCRIPTION
        IB1_IB_DESCRIPTION_IB_VARIANTSService iB1_IB_DESCRIPTION_IB_VARIANTSService = (IB1_IB_DESCRIPTION_IB_VARIANTSService)context.getBean("IB1_IB_DESCRIPTION_IB_VARIANTSServiceImpl");
        IB1_IB_DESCRIPTION_OBJECTIVESService iB1_IB_DESCRIPTION_OBJECTIVESService = (IB1_IB_DESCRIPTION_OBJECTIVESService)context.getBean("IB1_IB_DESCRIPTION_OBJECTIVESServiceImpl");
        IB1_IB_DESCRIPTION_IBNZService iB1_IB_DESCRIPTION_IBNZService = (IB1_IB_DESCRIPTION_IBNZService)context.getBean("IB1_IB_DESCRIPTION_IBNZServiceImpl");
        IB1_IB_DESCRIPTION_SLAVEService iB1_IB_DESCRIPTION_SLAVEService = (IB1_IB_DESCRIPTION_SLAVEService)context.getBean("IB1_IB_DESCRIPTION_SLAVEServiceImpl");

        //ENVIRONMENT
        IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService = (IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService)context.getBean("IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONServiceImpl");
        IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService = (IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService)context.getBean("IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYServiceImpl");
        IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService iB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService = (IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService)context.getBean("IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONServiceImpl");
        IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService = (IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService)context.getBean("IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEServiceImpl");
        IB1_ENVIRONMENT_TRANSPORT_MODEService iB1_ENVIRONMENT_TRANSPORT_MODEService = (IB1_ENVIRONMENT_TRANSPORT_MODEService)context.getBean("IB1_ENVIRONMENT_TRANSPORT_MODEServiceImpl");

        //IB1_BZD
        IB1_BZDService iB1_BZDService = (IB1_BZDService)context.getBean("IB1_BZDServiceImpl");

        //REFERENCES
        IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService = (IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService)context.getBean("IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTServiceImpl");

        //CUSTOMER_ADJUSTMENTS
        IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService = (IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService)context.getBean("IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCServiceImpl");

        //SECURITY_PROPERTIES
        IB1_SECURITY_PROPERTIESService iB1_SECURITY_PROPERTIESService = (IB1_SECURITY_PROPERTIESService)context.getBean("IB1_SECURITY_PROPERTIESServiceImpl");

        //IB1_TNR
        IB1_TNRService iB1_TNRService = (IB1_TNRService)context.getBean("IB1_TNRServiceImpl");

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_All(except procedures) info");
        api.setError("null");
    try {
        //数据库查出的原生list

        //IB1_Basic
        List<IB1_BasicLei> IB1_Basiclist = null;
        //DOC_INFO
        List<IB1_DOC_INFO_CONTACTSLei> IB1_DOC_INFO_CONTACTSlist = null;
        List<IB1_DOC_INFO_DOC_REVISIONSLei> IB1_DOC_INFO_DOC_REVISIONSlist = null;
        //IB_DESCRIPTION
        List<IB1_IB_DESCRIPTION_IB_VARIANTSLei> IB1_IB_DESCRIPTION_IB_VARIANTSlist = null;
        List<IB1_IB_DESCRIPTION_OBJECTIVESLei> IB1_IB_DESCRIPTION_OBJECTIVESlist = null;
        List<IB1_IB_DESCRIPTION_IBNZLei> IB1_IB_DESCRIPTION_IBNZlist = null;
        List<IB1_IB_DESCRIPTION_SLAVELei> IB1_IB_DESCRIPTION_SLAVElist = null;
        //ENVIRONMENT
        List<IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei> IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist = null;
        List<IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYLei> IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist = null;
        List<IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONLei> IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist = null;
        List<IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei> IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist = null;
        List<IB1_ENVIRONMENT_TRANSPORT_MODELei> IB1_ENVIRONMENT_TRANSPORT_MODElist = null;
        //IB1_BZD
        List<IB1_BZDLei> IB1_BZDlist = null;
        //REFERENCES
        List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist = null;
        //CUSTOMER_ADJUSTMENTS
        List<IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei> IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTClist = null;
        //SECURITY_PROPERTIES
        List<IB1_SECURITY_PROPERTIESLei> IB1_SECURITY_PROPERTIESlist = null;
        //IB1_TNR
        List<IB1_TNRLei> IB1_TNRlist = null;

        // list转成JSONToString的list:用_list表示
        //IB1_Basic
        String IB1_Basic_list= null;
        //DOC_INFO
        String IB1_DOC_INFO_CONTACTS_list= null;
        String IB1_DOC_INFO_DOC_REVISIONS_list= null;
        //IB_DESCRIPTION
        String IB1_IB_DESCRIPTION_IB_VARIANTS_list= null;
        String IB1_IB_DESCRIPTION_OBJECTIVES_list= null;
        String IB1_IB_DESCRIPTION_IBNZ_list= null;
        String IB1_IB_DESCRIPTION_SLAVE_list= null;
        //ENVIRONMENT
        String IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_list= null;
        String IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_list= null;
        String IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_list= null;
        String IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_list= null;
        String IB1_ENVIRONMENT_TRANSPORT_MODE_list= null;
        //IB1_BZD
        String IB1_BZD_list= null;
        //REFERENCES
        String IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list= null;
        //CUSTOMER_ADJUSTMENTS
        String IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_list= null;
        //SECURITY_PROPERTIES
        String IB1_SECURITY_PROPERTIES_list= null;
        //IB1_TNR
        String IB1_TNR_list= null;


            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //数据库查出的原生list

            //IB1_Basic
            IB1_Basiclist = iB1_BasicService.getIB1_Basic(map);
            //DOC_INFO
            IB1_DOC_INFO_CONTACTSlist = iB1_DOC_INFO_CONTACTSService.getIB1_DOC_INFO_CONTACTS(map);
            IB1_DOC_INFO_DOC_REVISIONSlist = iB1_DOC_INFO_DOC_REVISIONSService.getIB1_DOC_INFO_DOC_REVISIONS(map);
            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTSlist = iB1_IB_DESCRIPTION_IB_VARIANTSService.getIB1_IB_DESCRIPTION_IB_VARIANTS(map);
            IB1_IB_DESCRIPTION_OBJECTIVESlist = iB1_IB_DESCRIPTION_OBJECTIVESService.getIB1_IB_DESCRIPTION_OBJECTIVES(map);
            IB1_IB_DESCRIPTION_IBNZlist = iB1_IB_DESCRIPTION_IBNZService.getIB1_IB_DESCRIPTION_IBNZ(map);
            IB1_IB_DESCRIPTION_SLAVElist = iB1_IB_DESCRIPTION_SLAVEService.getIB1_IB_DESCRIPTION_SLAVE(map);
            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist = iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService.getIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(map);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist = iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService.getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(map);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist = iB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService.getIB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION(map);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist = iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService.getIB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE(map);
            IB1_ENVIRONMENT_TRANSPORT_MODElist = iB1_ENVIRONMENT_TRANSPORT_MODEService.getIB1_ENVIRONMENT_TRANSPORT_MODE(map);
            //IB1_BZD
            IB1_BZDlist = iB1_BZDService.getIB1_BZD(map);
            //REFERENCES
            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist = iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService.getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(map);
            //CUSTOMER_ADJUSTMENTS
            IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTClist = iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService.getIB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC(map);
            //SECURITY_PROPERTIES
            IB1_SECURITY_PROPERTIESlist = iB1_SECURITY_PROPERTIESService.getIB1_SECURITY_PROPERTIES(map);
            //IB1_TNR
            IB1_TNRlist = iB1_TNRService.getIB1_TNR(map);

            //将list转换成JSONToString

            //IB1_Basic
            IB1_Basic_list = JSON.toJSONString(IB1_Basiclist);
            //DOC_INFO
            IB1_DOC_INFO_CONTACTS_list = JSON.toJSONString(IB1_DOC_INFO_CONTACTSlist);
            IB1_DOC_INFO_DOC_REVISIONS_list = JSON.toJSONString(IB1_DOC_INFO_DOC_REVISIONSlist);
            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTS_list = JSON.toJSONString(IB1_IB_DESCRIPTION_IB_VARIANTSlist);
            IB1_IB_DESCRIPTION_OBJECTIVES_list = JSON.toJSONString(IB1_IB_DESCRIPTION_OBJECTIVESlist);
            IB1_IB_DESCRIPTION_IBNZ_list = JSON.toJSONString(IB1_IB_DESCRIPTION_IBNZlist);
            IB1_IB_DESCRIPTION_SLAVE_list = JSON.toJSONString(IB1_IB_DESCRIPTION_SLAVElist);
            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_list = JSON.toJSONString(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_list = JSON.toJSONString(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_list = JSON.toJSONString(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_list = JSON.toJSONString(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist);
            IB1_ENVIRONMENT_TRANSPORT_MODE_list = JSON.toJSONString(IB1_ENVIRONMENT_TRANSPORT_MODElist);
            //BZD
            IB1_BZD_list = JSON.toJSONString(IB1_BZDlist);
            //REFERENCES
            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list = JSON.toJSONString(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist);
            //CUSTOMER_ADJUSTMENTS
            IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_list = JSON.toJSONString(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTClist);
            //SECURITY_PROPERTIES
            IB1_SECURITY_PROPERTIES_list = JSON.toJSONString(IB1_SECURITY_PROPERTIESlist);
            //IB1_TNR
            IB1_TNR_list = JSON.toJSONString(IB1_TNRlist);


            //transform to JSONArray，JSONString转成JSONArray的

            //IB1_Basic
            JSONArray IB1_Basic_array = JSONArray.parseArray(IB1_Basic_list);
            //DOC_INFO
            JSONArray IB1_DOC_INFO_CONTACTS_array = JSONArray.parseArray(IB1_DOC_INFO_CONTACTS_list);
            JSONArray IB1_DOC_INFO_DOC_REVISIONS_array = JSONArray.parseArray(IB1_DOC_INFO_DOC_REVISIONS_list);
            //IB_DESCRIPTION
            JSONArray IB1_IB_DESCRIPTION_IB_VARIANTS_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_IB_VARIANTS_list);
            JSONArray IB1_IB_DESCRIPTION_OBJECTIVES_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_OBJECTIVES_list);
            JSONArray IB1_IB_DESCRIPTION_IBNZ_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_IBNZ_list);
            JSONArray IB1_IB_DESCRIPTION_SLAVE_array = JSONArray.parseArray(IB1_IB_DESCRIPTION_SLAVE_list);
            //ENVIRONMENT
            JSONArray IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_array = JSONArray.parseArray(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_list);
            JSONArray IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_array = JSONArray.parseArray(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_list);
            JSONArray IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_array = JSONArray.parseArray(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_list);
            JSONArray IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_array = JSONArray.parseArray(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_list);
            JSONArray IB1_ENVIRONMENT_TRANSPORT_MODE_array = JSONArray.parseArray(IB1_ENVIRONMENT_TRANSPORT_MODE_list);
            //BZD
            JSONArray IB1_BZD_array = JSONArray.parseArray(IB1_BZD_list);
            //REFERENCES
            JSONArray IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_array = JSONArray.parseArray(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list);
            //CUSTOMER_ADJUSTMENTS
            JSONArray IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_array = JSONArray.parseArray(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_list);
            //SECURITY_PROPERTIES
            JSONArray IB1_SECURITY_PROPERTIES_array = JSONArray.parseArray(IB1_SECURITY_PROPERTIES_list);
            //IB1_TNR
            JSONArray IB1_TNR_array = JSONArray.parseArray(IB1_TNR_list);

            //System.out.println("JSONArray的(OK)："+ IB1_DOC_INFO_DOC_REVISIONS_array);
            //class_b是有二级目录的，只有3个有二级目录
            Class_A class_a = new Class_A();
            Class_B class_b1 = new Class_B();//DOC_INFO
            Class_B class_b2 = new Class_B();//IB_DESCRIPTION
            Class_B class_b3 = new Class_B();//ENVIRONMENT

            //存到class_b对象里
            //DOC_INFO
            class_b1.setCONTACTS(IB1_DOC_INFO_CONTACTS_array);
            class_b1.setDOC_REVISIONS(IB1_DOC_INFO_DOC_REVISIONS_array);
            //IB_DESCRIPTION
            class_b2.setIB_VARIANTS(IB1_IB_DESCRIPTION_IB_VARIANTS_array);
            class_b2.setOBJECTIVES(IB1_IB_DESCRIPTION_OBJECTIVES_array);
            class_b2.setIBNZ(IB1_IB_DESCRIPTION_IBNZ_array);
            class_b2.setSLAVES(IB1_IB_DESCRIPTION_SLAVE_array);
            //ENVIRONMENT
            class_b3.setPRE_CONDITIONS(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION_array);
            class_b3.setDEPENDENCIES(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY_array);
            class_b3.setACCESS_AUTHORISATIONS(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION_array);
            class_b3.setPRODUCTION_MODES(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE_array);
            class_b3.setTRANSPORT_MODE(IB1_ENVIRONMENT_TRANSPORT_MODE_array);

            //System.out.println("class_b toString的(NOK)"+class_b);
            /*----------------------------------------------------------------------------------*/

            //将class_b json对象转成JSONString
            String class_b_JSON_DOC_INFO=JSON.toJSONString(class_b1);
            String class_b_JSON_IB_DESCRIPTION=JSON.toJSONString(class_b2);
            String class_b_JSON_ENVIRONMENT=JSON.toJSONString(class_b3);

            //System.out.println("class_b toJSONString的(OK)"+class_b_JSON);

            String class_b_JSON_plus_DOC_INFO = "[" + class_b_JSON_DOC_INFO + "]";
            String class_b_JSON_plus_IB_DESCRIPTION = "[" + class_b_JSON_IB_DESCRIPTION + "]";
            String class_b_JSON_plus_ENVIRONMENT = "[" + class_b_JSON_ENVIRONMENT + "]";


            JSONArray class_b_JSONarray_DOC_INFO = JSONArray.parseArray(class_b_JSON_plus_DOC_INFO);
            JSONArray class_b_JSONarray_IB_DESCRIPTION = JSONArray.parseArray(class_b_JSON_plus_IB_DESCRIPTION);
            JSONArray class_b_JSONarray_ENVIRONMENT = JSONArray.parseArray(class_b_JSON_plus_ENVIRONMENT);

            //System.out.println("class_b_json_plus的JSONarray(OK):"+class_b_JSONarray);

            //将class_b_JSONarray存到class_a里,转化成class_a_JSONarray

            class_a.setDOC_INFO(class_b_JSONarray_DOC_INFO);
            class_a.setIB_DESCRIPTION(class_b_JSONarray_IB_DESCRIPTION);
            class_a.setENVIRONMENT(class_b_JSONarray_ENVIRONMENT);

            //以下的一级目录直接存在class_a里，因为没有二级目录所以不需要存
            class_a.setIB1_Basic(IB1_Basic_array);
            class_a.setBZD(IB1_BZD_array);
            class_a.setREFERENCES(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_array);
            class_a.setCUSTOMER_ADJUSTMENTS(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_array);
            class_a.setSECURITY_PROPERTIES(IB1_SECURITY_PROPERTIES_array);
            class_a.setIB1_TNR(IB1_TNR_array);
            /*----------------------------------------------------------------------------------------------*/
            String  class_a_JSON = JSON.toJSONString(class_a);
            //System.out.println("class_a的JSON:"+class_a_JSON);

            //将class_a_JSONarray存到api里
            String class_a_JSON_plus = "[" + class_a_JSON + "]";
            JSONArray class_a_JSONarray = JSONArray.parseArray(class_a_JSON_plus);
            api.setPara(class_a_JSONarray);

        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String  ib1_all_json = JSON.toJSONString(api);
        model.addAttribute("msg",ib1_all_json);
        System.out.println("FrontEnd will get: " +ib1_all_json);
        return "standard";
    }

}
