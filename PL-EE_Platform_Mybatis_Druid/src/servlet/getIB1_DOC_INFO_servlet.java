package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import dao.IB1_DOC_INFO_CONTACTSMapper;
import dao.IB1_DOC_INFO_DOC_REVISIONSMapper;
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

@WebServlet("/getIB1_DOC_INFO")
public class getIB1_DOC_INFO_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询IB1_PROCEDURES_PROCEDURE
        //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
        TypeUtils.compatibleWithJavaBean =true;

        //setContentType
        response.setContentType("text/html;charset=UTF-8");
        //request.getAttribute();
        String platform_name = request.getParameter("platform_name");
        String IB1_VERSION = request.getParameter("IB1_VERSION");
        String diagnose_adr = request.getParameter("diagnose_adr");

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
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            sqlSession = MybatisUtils.getSqlSession();
            // getMapper
            IB1_DOC_INFO_CONTACTSmapper = sqlSession.getMapper(IB1_DOC_INFO_CONTACTSMapper.class);
            IB1_DOC_INFO_DOC_REVISIONSmapper = sqlSession.getMapper(IB1_DOC_INFO_DOC_REVISIONSMapper.class);

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

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

            //close session
                sqlSession.close();

            } catch (Exception e) {
                e.printStackTrace();

                //set error info if catches
                api.setStatus("false");
                api.setError(e.getCause().getMessage());
            }

            // transform to JSONString and output to Client
            String  DOC_INFO_HA  = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(DOC_INFO_HA);
            System.out.println(DOC_INFO_HA);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
