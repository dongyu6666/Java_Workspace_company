package daoTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import dao.IB1_DOC_INFO_CONTACTSMapper;
import dao.IB1_DOC_INFO_DOC_REVISIONSMapper;
import dao.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.*;
import utils.MybatisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testDoc {
    //查询全部
    @Test
    public void getTTT() {


        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_DOC_INFO info");
        api.setError("null");

        //声明变量
        SqlSession sqlSession = null;
        IB1_DOC_INFO_CONTACTSMapper IB1_DOC_INFO_CONTACTSmapper = null;
        IB1_DOC_INFO_DOC_REVISIONSMapper IB1_DOC_INFO_DOC_REVISIONSmapper = null;

        List<IB1_DOC_INFO_CONTACTSLei> IB1_DOC_INFO_CONTACTSlist = null;
        List<IB1_DOC_INFO_DOC_REVISIONSLei> IB1_DOC_INFO_DOC_REVISIONSlist = null;

        String IB1_DOC_INFO_CONTACTS_list= null;
        String IB1_DOC_INFO_DOC_REVISIONS_list= null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            // getMapper
            IB1_DOC_INFO_CONTACTSmapper = sqlSession.getMapper(IB1_DOC_INFO_CONTACTSMapper.class);
            IB1_DOC_INFO_DOC_REVISIONSmapper = sqlSession.getMapper(IB1_DOC_INFO_DOC_REVISIONSMapper.class);

            Map map = new HashMap();
            map.put("platform_name", "MEB");
            map.put("IB1_VERSION", "1_6");
            map.put("diagnose_adr", "0009");

            //get IB1_PROCEDURES_PROCEDURE from Mysql, IB1_PROCEDURES_PROCEDURE is list，从数据读出的list
            IB1_DOC_INFO_CONTACTSlist = IB1_DOC_INFO_CONTACTSmapper.getIB1_DOC_INFO_CONTACTS(map);
            IB1_DOC_INFO_DOC_REVISIONSlist = IB1_DOC_INFO_DOC_REVISIONSmapper.getIB1_DOC_INFO_DOC_REVISIONS(map);
            //System.out.println("map查出来的(NOK)："+ IB1_DOC_INFO_DOC_REVISIONSlist);

            //transform IB1_Basic to JSON String，list转成JSONString
            IB1_DOC_INFO_CONTACTS_list = JSON.toJSONString(IB1_DOC_INFO_CONTACTSlist);
            IB1_DOC_INFO_DOC_REVISIONS_list = JSON.toJSONString(IB1_DOC_INFO_DOC_REVISIONSlist);
            //System.out.println("toJSONString的(OK)："+ IB1_DOC_INFO_DOC_REVISIONS_list);

            //transform to JSONArray，JSONString转成JSONArray的
            JSONArray IB1_DOC_INFO_CONTACTS_array = JSONArray.parseArray(IB1_DOC_INFO_CONTACTS_list);
            JSONArray IB1_DOC_INFO_DOC_REVISIONS_array = JSONArray.parseArray(IB1_DOC_INFO_DOC_REVISIONS_list);

            //System.out.println("JSONArray的(OK)："+ IB1_DOC_INFO_DOC_REVISIONS_array);


            Class_A class_a = new Class_A();
            Class_B class_b = new Class_B();
            //存到class_b对象里
            class_b.setCONTACTS(IB1_DOC_INFO_CONTACTS_array);
            class_b.setDOC_REVISIONS(IB1_DOC_INFO_DOC_REVISIONS_array);

            //System.out.println("class_b toString的(NOK)"+class_b);

            //将class_b json对象转成JSONString
            String class_b_JSON=JSON.toJSONString(class_b);
            //System.out.println("class_b toJSONString的(OK)"+class_b_JSON);


            String class_b_JSON_plus = "[" + class_b_JSON + "]";
            JSONArray class_b_JSONarray = JSONArray.parseArray(class_b_JSON_plus);
            //System.out.println("class_b_json_plus的JSONarray(OK):"+class_b_JSONarray);


             //将class_b_JSONarray存到class_a里,转化成class_a_JSONarray

            class_a.setDOC_INFO(class_b_JSONarray);

            String  class_a_JSON = JSON.toJSONString(class_a);
            //System.out.println("class_a的JSON:"+class_a_JSON);

            //将class_a_JSONarray存到api里
            String class_a_JSON_plus = "[" + class_a_JSON + "]";
            JSONArray class_a_JSONarray = JSONArray.parseArray(class_a_JSON_plus);
            api.setPara(class_a_JSONarray);

            String  DOC_INFO_HA  = JSON.toJSONString(api);
            System.out.println(DOC_INFO_HA);

            //close session
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}