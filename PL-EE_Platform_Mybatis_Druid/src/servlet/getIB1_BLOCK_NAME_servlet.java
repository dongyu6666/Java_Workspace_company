package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/getIB1_BLOCK_NAME")
public class getIB1_BLOCK_NAME_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //查询IB1_IB1_BLOCK_NAME
            //setContentType
            response.setContentType("text/html;charset=UTF-8");
            //request.getAttribute();
            String platform_name = request.getParameter("platform_name");

            //正则表达式，取出filename中的版本信息
            String IB1_filename = request.getParameter("IB1_VERSION");
            Pattern p = Pattern.compile("V\\d_\\d\\d?");

            Matcher m = p.matcher(IB1_filename);
            String IB1_VERSION_real = null;
            while(m.find()){
            IB1_VERSION_real  = m.group();
                System.out.println(IB1_VERSION_real);
            }

            String diagnose_adr = request.getParameter("diagnose_adr");

        //获得SqlSession对象
            API api = new API();
            api.setStatus("true");
            api.setInfo("offer all IB1_BLOCK_NAME info");
            api.setError("null");

            //声明变量
            SqlSession sqlSession = null;
            IB1_PROCEDURES_PROCEDUREMapper mapper = null;
            List<IB1_PROCEDURES_PROCEDURELei> IB1_BLOCK_NAMElist = null;
            String list= null;

            try {
                sqlSession = MybatisUtils.getSqlSession();
                // getMapper
                mapper = sqlSession.getMapper(IB1_PROCEDURES_PROCEDUREMapper.class);

                Map map = new HashMap();
                map.put("platform_name", platform_name);
                map.put("IB1_VERSION", IB1_VERSION_real);
                map.put("diagnose_adr", diagnose_adr);

                //get IB1_PROCEDURES_PROCEDURE from Mysql, IB1_PROCEDURES_PROCEDURE is list
                IB1_BLOCK_NAMElist = mapper.getIB1_BLOCK_NAME(map);
                //transform IB1_Basic to JSON String


                list = JSON.toJSONString(IB1_BLOCK_NAMElist);
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
            String  IB1_BLOCK_NAME_JSON = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(IB1_BLOCK_NAME_JSON);
            System.out.println(IB1_BLOCK_NAME_JSON);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
