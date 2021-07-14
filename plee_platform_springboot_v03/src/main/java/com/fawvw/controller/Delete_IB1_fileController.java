package com.fawvw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;
import com.fawvw.pojo.API;
import com.fawvw.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Delete_IB1_fileController {
    //controller调service层

    @Autowired
    private IB1_BasicService iB1_BasicService;

    @Autowired
    private IB1_BZD_ADDITIONAL_IDENTSService iB1_BZD_ADDITIONAL_IDENTSService;
    @Autowired
    private IB1_BZD_BasicService iB1_BZD_BasicService;
    @Autowired
    private IB1_BZD_IDENTSService iB1_BZD_IDENTSService;

    @Autowired
    private IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService;
    @Autowired
    private IB1_DIAG_INFOS_DIAG_INFOService iB1_DIAG_INFOS_DIAG_INFOService;

    @Autowired
    private IB1_DOC_INFO_CONTACTSService iB1_DOC_INFO_CONTACTSService;
    @Autowired
    private IB1_DOC_INFO_DOC_REVISIONSService iB1_DOC_INFO_DOC_REVISIONSService;

    @Autowired
    private IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService iB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService;
    @Autowired
    private IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService;
    @Autowired
    private IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService;
    @Autowired
    private IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService;
    @Autowired
    private IB1_ENVIRONMENT_TRANSPORT_MODEService iB1_ENVIRONMENT_TRANSPORT_MODEService;

    @Autowired
    private IB1_IB_DESCRIPTION_IB_VARIANTSService iB1_IB_DESCRIPTION_IB_VARIANTSService;
    @Autowired
    private IB1_IB_DESCRIPTION_IBNZService iB1_IB_DESCRIPTION_IBNZService;
    @Autowired
    private IB1_IB_DESCRIPTION_OBJECTIVESService iB1_IB_DESCRIPTION_OBJECTIVESService;
    @Autowired
    private IB1_IB_DESCRIPTION_SLAVEService iB1_IB_DESCRIPTION_SLAVEService;

    @Autowired
    private IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService;
    @Autowired
    private IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService;
    @Autowired
    private IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService;
    @Autowired
    private IB1_PROCEDURES_PROCEDUREService iB1_PROCEDURES_PROCEDUREService;

    @Autowired
    private IB1_REFERENCES_REGULATIONS_REGULATIONService iB1_REFERENCES_REGULATIONS_REGULATIONService;
    @Autowired
    private IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService;
    @Autowired
    private IB1_SECURITY_PROPERTIESService iB1_SECURITY_PROPERTIESService;
    @Autowired
    private IB1_TNRService iB1_TNRService;



    @RequestMapping("/delete_IB1_file")
    public String delete_IB1_file(@RequestParam(value = "platform_name", required = false) String platform_name, @RequestParam(value = "IB1_VERSION", required = false) String IB1_VERSION, @RequestParam(value = "diagnose_adr", required = false) String diagnose_adr, Model model) {
        API api = new API();
        api.setStatus("true");
        api.setInfo("delete IB1_file info");
        api.setError("null");


        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean = true;
            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            int i_IB1_Basic = iB1_BasicService.deleteIB1_Basic(map);
            int i_IB1_BZD_ADDITIONAL_IDENTS = iB1_BZD_ADDITIONAL_IDENTSService.deleteIB1_BZD_ADDITIONAL_IDENTS(map);
            int i_IB1_BZD_Basic = iB1_BZD_BasicService.deleteIB1_BZD_Basic(map);
            int i_IB1_BZD_IDENTS = iB1_BZD_IDENTSService.deleteIB1_BZD_IDENTS(map);


            int i_IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC = iB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCService.deleteIB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC(map);
            int i_IB1_DIAG_INFOS_DIAG_INFO = iB1_DIAG_INFOS_DIAG_INFOService.deleteIB1_DIAG_INFOS_DIAG_INFO(map);

            int i_IB1_DOC_INFO_CONTACTS = iB1_DOC_INFO_CONTACTSService.deleteIB1_DOC_INFO_CONTACTS(map);
            int i_IB1_DOC_INFO_DOC_REVISIONS = iB1_DOC_INFO_DOC_REVISIONSService.deleteIB1_DOC_INFO_DOC_REVISIONS(map);

            int i_IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION = iB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATIONService.deleteIB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION(map);
            int i_IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY = iB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCYService.deleteIB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY(map);
            int i_IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION = iB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONService.deleteIB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION(map);
            int i_IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE = iB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODEService.deleteIB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE(map);
            int i_IB1_ENVIRONMENT_TRANSPORT_MODE = iB1_ENVIRONMENT_TRANSPORT_MODEService.deleteIB1_ENVIRONMENT_TRANSPORT_MODE(map);

            int i_IB1_IB_DESCRIPTION_IB_VARIANTS = iB1_IB_DESCRIPTION_IB_VARIANTSService.deleteIB1_IB_DESCRIPTION_IB_VARIANTS(map);
            int i_IB1_IB_DESCRIPTION_IBNZ = iB1_IB_DESCRIPTION_IBNZService.deleteIB1_IB_DESCRIPTION_IBNZ(map);
            int i_IB1_IB_DESCRIPTION_OBJECTIVES = iB1_IB_DESCRIPTION_OBJECTIVESService.deleteIB1_IB_DESCRIPTION_OBJECTIVES(map);
            int i_IB1_IB_DESCRIPTION_SLAVE = iB1_IB_DESCRIPTION_SLAVEService.deleteIB1_IB_DESCRIPTION_SLAVE(map);
            int i_IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER = iB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERService.deleteIB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER(map);
            int i_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSService.deleteIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS(map);
            int i_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP = iB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPService.deleteIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(map);
            int i_IB1_PROCEDURES_PROCEDURE = iB1_PROCEDURES_PROCEDUREService.deleteIB1_PROCEDURES_PROCEDURE(map);

            int i_IB1_REFERENCES_REGULATIONS_REGULATION = iB1_REFERENCES_REGULATIONS_REGULATIONService.deleteIB1_REFERENCES_REGULATIONS_REGULATION(map);
            int i_IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT = iB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTService.deleteIB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT(map);
            int i_IB1_SECURITY_PROPERTIES = iB1_SECURITY_PROPERTIESService.deleteIB1_SECURITY_PROPERTIES(map);
            int i_IB1_TNR = iB1_TNRService.deleteIB1_TNR(map);



            System.out.println("删除了IB1_Basic: " + i_IB1_Basic+ "行");
            System.out.println("删除了IB1_BZD_ADDITIONAL_IDENTS: " + i_IB1_BZD_ADDITIONAL_IDENTS+ "行");
            System.out.println("删除了IB1_BZD_Basic: " + i_IB1_BZD_Basic+ "行");
            System.out.println("删除了IB1_BZD_IDENTS: " + i_IB1_BZD_IDENTS+ "行");

            System.out.println("删除了IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC: " + i_IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTC+ "行");
            System.out.println("删除了IB1_DIAG_INFOS_DIAG_INFO: " + i_IB1_DIAG_INFOS_DIAG_INFO+ "行");

            System.out.println("删除了IB1_DOC_INFO_CONTACTS: " + i_IB1_DOC_INFO_CONTACTS+ "行");
            System.out.println("删除了IB1_DOC_INFO_DOC_REVISIONS: " + i_IB1_DOC_INFO_DOC_REVISIONS+ "行");

            System.out.println("删除了IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION: " + i_IB1_ENVIRONMENT_ACCESS_AUTHORISATIONS_ACCESS_AUTHORISATION+ "行");
            System.out.println("删除了IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY: " + i_IB1_ENVIRONMENT_DEPENDENCIES_DEPENDENCY+ "行");
            System.out.println("删除了IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION: " + i_IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITION+ "行");
            System.out.println("删除了IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE: " + i_IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODE+ "行");
            System.out.println("删除了IB1_ENVIRONMENT_TRANSPORT_MODE: " + i_IB1_ENVIRONMENT_TRANSPORT_MODE+ "行");

            System.out.println("删除了IB1_IB_DESCRIPTION_IB_VARIANTS: " + i_IB1_IB_DESCRIPTION_IB_VARIANTS+ "行");
            System.out.println("删除了IB1_IB_DESCRIPTION_IBNZ: " + i_IB1_IB_DESCRIPTION_IBNZ+ "行");
            System.out.println("删除了IB1_IB_DESCRIPTION_OBJECTIVES: " + i_IB1_IB_DESCRIPTION_OBJECTIVES+ "行");
            System.out.println("删除了IB1_IB_DESCRIPTION_SLAVE: " + i_IB1_IB_DESCRIPTION_SLAVE+ "行");

            System.out.println("删除了IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER: " + i_IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER+ "行");
            System.out.println("删除了IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS: " + i_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERS+ "行");
            System.out.println("删除了IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP: " + i_IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP+ "行");
            System.out.println("删除了IB1_PROCEDURES_PROCEDURE: " + i_IB1_PROCEDURES_PROCEDURE+ "行");

            System.out.println("删除了IB1_REFERENCES_REGULATIONS_REGULATION: " + i_IB1_REFERENCES_REGULATIONS_REGULATION+ "行");
            System.out.println("删除了IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT: " + i_IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENT+ "行");
            System.out.println("删除了IB1_SECURITY_PROPERTIES: " + i_IB1_SECURITY_PROPERTIES+ "行");
            System.out.println("删除了IB1_TNR: " + i_IB1_TNR+ "行");

        } catch (Exception e) {
            e.printStackTrace();
            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }
        String json = JSON.toJSONString(api);
        model.addAttribute("msg", json);
        System.out.println("FrontEnd will get: " + json);
        return json;
    }
}