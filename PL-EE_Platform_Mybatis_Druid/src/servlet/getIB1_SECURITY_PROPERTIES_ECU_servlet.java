package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import dao.IB1_SECURITY_PROPERTIES_ECUMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.API;
import pojo.IB1_SECURITY_PROPERTIES_ECULei;
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

@WebServlet("/getIB1_SECURITY_PROPERTIES_ECU")
public class getIB1_SECURITY_PROPERTIES_ECU_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询IB1_PROCEDURES_PROCEDURE
        //setContentType
        response.setContentType("text/html;charset=UTF-8");
        //request.getAttribute();
        String platform_name = request.getParameter("platform_name");
        String IB1_VERSION = request.getParameter("IB1_VERSION");
        String diagnose_adr = request.getParameter("diagnose_adr");

        //获得SqlSession对象
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_SECURITY_PROPERTIES_ECU info");
        api.setError("null");

        //声明变量
        SqlSession sqlSession = null;
        IB1_SECURITY_PROPERTIES_ECUMapper mapper = null;
        List<IB1_SECURITY_PROPERTIES_ECULei> IB1_SECURITY_PROPERTIES_ECUlist = null;
        String list= null;

        try {
            sqlSession = MybatisUtils.getSqlSession();
            // getMapper
            mapper = sqlSession.getMapper(IB1_SECURITY_PROPERTIES_ECUMapper.class);

            Map map = new HashMap();
            map.put("platform_name", platform_name);
            map.put("IB1_VERSION", IB1_VERSION);
            map.put("diagnose_adr", diagnose_adr);

            //get IB1_PROCEDURES_PROCEDURE from Mysql, IB1_PROCEDURES_PROCEDURE is list
            IB1_SECURITY_PROPERTIES_ECUlist = mapper.getIB1_SECURITY_PROPERTIES_ECU(map);
            //transform IB1_Basic to JSON String


            list = JSON.toJSONString(IB1_SECURITY_PROPERTIES_ECUlist);
            //transform to JSONArray
            JSONArray array = JSONArray.parseArray(list);
            //set JSONArray in api
            api.setPara(array);
            //close session
            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();

            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());
        }

        // transform to JSONString and output to Client
        String  IB1_SECURITY_PROPERTIES_ECU_JSON = JSON.toJSONString(api);

        // output to Client
        Writer out = response.getWriter();
        out.write(IB1_SECURITY_PROPERTIES_ECU_JSON);
        System.out.println(IB1_SECURITY_PROPERTIES_ECU_JSON);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
