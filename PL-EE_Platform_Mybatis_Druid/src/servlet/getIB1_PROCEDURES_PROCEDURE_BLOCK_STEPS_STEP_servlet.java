package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import dao.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.API;
import pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei;
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

@WebServlet("/getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP")
public class getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //查询IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP
            //setContentType
            response.setContentType("text/html;charset=UTF-8");
            //request.getAttribute();
            String platform_name = request.getParameter("platform_name");
            String IB1_VERSION = request.getParameter("IB1_VERSION");
            String diagnose_adr = request.getParameter("diagnose_adr");
            String BLOCK_NAME = request.getParameter("BLOCK_NAME");
            //String STEP_NAME = request.getParameter("STEP_NAME");

        //获得SqlSession对象
            API api = new API();
            api.setStatus("true");
            api.setInfo("offer all IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP info");
            api.setError("null");

            //声明变量
            SqlSession sqlSession = null;
            IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper mapper = null;
            List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei> IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPlist = null;
            String list= null;

            try {
                sqlSession = MybatisUtils.getSqlSession();
                // getMapper
                mapper = sqlSession.getMapper(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPMapper.class);
                Map map = new HashMap();
                map.put("platform_name", platform_name);
                map.put("IB1_VERSION", IB1_VERSION);
                map.put("diagnose_adr", diagnose_adr);
                map.put("BLOCK_NAME", BLOCK_NAME);
                //map.put("STEP_NAME", STEP_NAME);
                //get IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER from Mysql, IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER is list
                IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPlist = mapper.getIB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP(map);
                //transform IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETER to JSON String


                list = JSON.toJSONString(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPlist);
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
            String  IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_JSON = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_JSON);
            System.out.println(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_JSON);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
