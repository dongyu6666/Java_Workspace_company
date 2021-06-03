package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import dao.IB1_PROCEDURES_PROCEDUREMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.API;
import pojo.IB1_PROCEDURES_PROCEDURELei;
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

@WebServlet("/getIB1_PROCEDURES_PROCEDURE")
public class getIB1_PROCEDURES_PROCEDURE_servlet extends HttpServlet {
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
            String BLOCK_NAME = request.getParameter("BLOCK_NAME");

        //获得SqlSession对象
            API api = new API();
            api.setStatus("true");
            api.setInfo("offer all IB1_PROCEDURES_PROCEDURE info");
            api.setError("null");

            //声明变量
            SqlSession sqlSession = null;
            IB1_PROCEDURES_PROCEDUREMapper mapper = null;
            List<IB1_PROCEDURES_PROCEDURELei> IB1_PROCEDURES_PROCEDURElist = null;
            String list= null;

            try {
                //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
                TypeUtils.compatibleWithJavaBean =true;

                sqlSession = MybatisUtils.getSqlSession();
                // getMapper
                mapper = sqlSession.getMapper(IB1_PROCEDURES_PROCEDUREMapper.class);

                Map map = new HashMap();
                map.put("platform_name", platform_name);
                map.put("IB1_VERSION", IB1_VERSION);
                map.put("diagnose_adr", diagnose_adr);
                map.put("BLOCK_NAME", BLOCK_NAME);

                //get IB1_PROCEDURES_PROCEDURE from Mysql, IB1_PROCEDURES_PROCEDURE is list
                IB1_PROCEDURES_PROCEDURElist = mapper.getIB1_PROCEDURES_PROCEDURE(map);
                //transform IB1_Basic to JSON String


                list = JSON.toJSONString(IB1_PROCEDURES_PROCEDURElist);
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
            String  IB1_PROCEDURES_PROCEDURE_JSON = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(IB1_PROCEDURES_PROCEDURE_JSON);
            System.out.println(IB1_PROCEDURES_PROCEDURE_JSON);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
