package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import dao.*;
import org.apache.ibatis.session.SqlSession;
import pojo.*;
import utils.MybatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/getIB1_All")
public class getIB1_All_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询IB1_All
        //setContentType
        response.setContentType("text/html;charset=UTF-8");
        //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
        TypeUtils.compatibleWithJavaBean =true;

        //request.getAttribute();
        String platform_name = request.getParameter("platform_name");
        String IB1_VERSION = request.getParameter("IB1_VERSION");
        String diagnose_adr = request.getParameter("diagnose_adr");

        API api = new API();
        api.setStatus("true");
        api.setInfo("offer IB1_All(except procedures) info");
        api.setError("null");

        //声明变量
        SqlSession sqlSession = null;
        //IB1_Basic
        IB1_BasicMapper IB1_Basicmapper = null;
        //DOC_INFO
        IB1_DOC_INFO_CONTACTSMapper IB1_DOC_INFO_CONTACTSmapper = null;
        IB1_DOC_INFO_DOC_REVISIONSMapper IB1_DOC_INFO_DOC_REVISIONSmapper = null;
        //IB_DESCRIPTION
        IB1_IB_DESCRIPTION_IB_VARIANTSMapper IB1_IB_DESCRIPTION_IB_VARIANTSmapper = null;
        IB1_IB_DESCRIPTION_OBJECTIVESMapper IB1_IB_DESCRIPTION_OBJECTIVESmapper = null;
        IB1_IB_DESCRIPTION_IBNZMapper IB1_IB_DESCRIPTION_IBNZmapper = null;
        IB1_IB_DESCRIPTION_SLAVEMapper IB1_IB_DESCRIPTION_SLAVEmapper = null;
        //ENVIRONMENT
        IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONmapper = null;
        IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYmapper = null;
        IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONMapper IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONmapper = null;
        IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEmapper = null;
        //IB1_BZD
        IB1_BZDMapper IB1_BZDmapper = null;
        //REFERENCES
        IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTmapper = null;
        //CUSTOMER_ADJUSTMENTS
        IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCmapper = null;
        //SECURITY_PROPERTIES
        IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYMapper IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYmapper = null;
        //IB1_TNR
        IB1_TNRMapper IB1_TNRmapper = null;

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
        //IB1_BZD
        List<IB1_BZDLei> IB1_BZDlist = null;
        //REFERENCES
        List<IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei> IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist = null;
        //CUSTOMER_ADJUSTMENTS
        List<IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei> IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTClist = null;
        //SECURITY_PROPERTIES
        List<IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYLei> IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYlist = null;
        //IB1_TNR
        List<IB1_TNRLei> IB1_TNRlist = null;

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
        //IB1_BZD
        String IB1_BZD_list= null;
        //REFERENCES
        String IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list= null;
        //CUSTOMER_ADJUSTMENTS
        String IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_list= null;
        //SECURITY_PROPERTIES
        String IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY_list= null;
        //IB1_TNR
        String IB1_TNR_list= null;


        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;

            sqlSession = MybatisUtils.getSqlSession();
            // getMapper

            //IB1_Basic
            IB1_Basicmapper = sqlSession.getMapper(IB1_BasicMapper.class);

            //DOC_INFO
            IB1_DOC_INFO_CONTACTSmapper = sqlSession.getMapper(IB1_DOC_INFO_CONTACTSMapper.class);
            IB1_DOC_INFO_DOC_REVISIONSmapper = sqlSession.getMapper(IB1_DOC_INFO_DOC_REVISIONSMapper.class);

            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTSmapper = sqlSession.getMapper(IB1_IB_DESCRIPTION_IB_VARIANTSMapper.class);
            IB1_IB_DESCRIPTION_OBJECTIVESmapper = sqlSession.getMapper(IB1_IB_DESCRIPTION_OBJECTIVESMapper.class);
            IB1_IB_DESCRIPTION_IBNZmapper = sqlSession.getMapper(IB1_IB_DESCRIPTION_IBNZMapper.class);
            IB1_IB_DESCRIPTION_SLAVEmapper = sqlSession.getMapper(IB1_IB_DESCRIPTION_SLAVEMapper.class);
            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONmapper = sqlSession.getMapper(IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONMapper.class);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYmapper = sqlSession.getMapper(IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYMapper.class);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONmapper = sqlSession.getMapper(IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONMapper.class);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEmapper = sqlSession.getMapper(IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEMapper.class);
            //IB1_BZD
            IB1_BZDmapper = sqlSession.getMapper(IB1_BZDMapper.class);
            //REFERENCES
            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTmapper = sqlSession.getMapper(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTMapper.class);
            //CUSTOMER_ADJUSTMENTS
            IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCmapper = sqlSession.getMapper(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCMapper.class);
            //SECURITY_PROPERTIES
            IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYmapper = sqlSession.getMapper(IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYMapper.class);
            //IB1_TNR
            IB1_TNRmapper = sqlSession.getMapper(IB1_TNRMapper.class);

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //get IB1_PROCEDURES_PROCEDURE from Mysql, IB1_PROCEDURES_PROCEDURE is list，从数据读出的list

            //IB1_Basic
            IB1_Basiclist = IB1_Basicmapper.getIB1_Basic(map);
            //DOC_INFO
            IB1_DOC_INFO_CONTACTSlist = IB1_DOC_INFO_CONTACTSmapper.getIB1_DOC_INFO_CONTACTS(map);
            IB1_DOC_INFO_DOC_REVISIONSlist = IB1_DOC_INFO_DOC_REVISIONSmapper.getIB1_DOC_INFO_DOC_REVISIONS(map);
            //IB_DESCRIPTION
            IB1_IB_DESCRIPTION_IB_VARIANTSlist = IB1_IB_DESCRIPTION_IB_VARIANTSmapper.getIB1_IB_DESCRIPTION_IB_VARIANTS(map);
            IB1_IB_DESCRIPTION_OBJECTIVESlist = IB1_IB_DESCRIPTION_OBJECTIVESmapper.getIB1_IB_DESCRIPTION_OBJECTIVES(map);
            IB1_IB_DESCRIPTION_IBNZlist = IB1_IB_DESCRIPTION_IBNZmapper.getIB1_IB_DESCRIPTION_IBNZ(map);
            IB1_IB_DESCRIPTION_SLAVElist = IB1_IB_DESCRIPTION_SLAVEmapper.getIB1_IB_DESCRIPTION_SLAVE(map);
            //ENVIRONMENT
            IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONlist = IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONmapper.getIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(map);
            IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYlist = IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYmapper.getIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(map);
            IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONlist = IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONmapper.getIB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION(map);
            IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODElist = IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEmapper.getIB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE(map);
            //IB1_BZD
            IB1_BZDlist = IB1_BZDmapper.getIB1_BZD(map);
            //REFERENCES
            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist = IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTmapper.getIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(map);
            //CUSTOMER_ADJUSTMENTS
            IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTClist = IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCmapper.getIB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC(map);
            //SECURITY_PROPERTIES
            IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYlist = IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYmapper.getIB1_SECURITY_PROPERTIES_All(map);
            //IB1_TNR
            IB1_TNRlist = IB1_TNRmapper.getIB1_TNR(map);


            //System.out.println("map查出来的(NOK)："+ IB1_DOC_INFO_DOC_REVISIONSlist);

            //transform IB1_Basic to JSON String，list转成JSONString

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
            //BZD
            IB1_BZD_list = JSON.toJSONString(IB1_BZDlist);
            //REFERENCES
            IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list = JSON.toJSONString(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTlist);
            //CUSTOMER_ADJUSTMENTS
            IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_list = JSON.toJSONString(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTClist);
            //SECURITY_PROPERTIES
            IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY_list = JSON.toJSONString(IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYlist);
            //IB1_TNR
            IB1_TNR_list = JSON.toJSONString(IB1_TNRlist);


            //System.out.println("toJSONString的(OK)："+ IB1_DOC_INFO_DOC_REVISIONS_list);

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
            //BZD
            JSONArray IB1_BZD_array = JSONArray.parseArray(IB1_BZD_list);
            //REFERENCES
            JSONArray IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_array = JSONArray.parseArray(IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT_list);
            //CUSTOMER_ADJUSTMENTS
            JSONArray IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_array = JSONArray.parseArray(IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC_list);
            //SECURITY_PROPERTIES
            JSONArray IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY_array = JSONArray.parseArray(IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY_list);
            //IB1_TNR
            JSONArray IB1_TNR_array = JSONArray.parseArray(IB1_TNR_list);

            //System.out.println("JSONArray的(OK)："+ IB1_DOC_INFO_DOC_REVISIONS_array);
            //class_b是有二级目录的
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
            class_a.setSECURITY_PROPERTIES(IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTY_array);
            class_a.setIB1_TNR(IB1_TNR_array);
/*----------------------------------------------------------------------------------------------*/
            String  class_a_JSON = JSON.toJSONString(class_a);
            //System.out.println("class_a的JSON:"+class_a_JSON);

            //将class_a_JSONarray存到api里
            String class_a_JSON_plus = "[" + class_a_JSON + "]";
            JSONArray class_a_JSONarray = JSONArray.parseArray(class_a_JSON_plus);
            api.setPara(class_a_JSONarray);

            //close session
                sqlSession.close();

            } catch (Exception e) {
                e.printStackTrace();

                //set error info if catches
                api.setStatus("false");
                api.setError(e.getCause().getMessage());
            }

            // transform to JSONString and output to Client
            String  IB1_All_JSONString  = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(IB1_All_JSONString);
            System.out.println(IB1_All_JSONString);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
