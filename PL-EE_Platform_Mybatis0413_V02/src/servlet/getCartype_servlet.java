package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import dao.CartypeMapper;
import dao.PlatformMapper;
import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.API;
import pojo.CartypeLei;
import utils.MybatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@WebServlet("/getCartype")
public class getCartype_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //查询cartype
            //setContentType
            response.setContentType("text/html;charset=UTF-8");
            //request.getAttribute();

        //获得SqlSession对象
            API api = new API();
            api.setStatus("true");
            api.setInfo("offer cartype info");
            api.setError("null");

            //声明变量
            SqlSession sqlSession = null;
            UserMapper mapper = null;
            List<CartypeLei> platformlist = null;
            String list= null;

            try {
                sqlSession = MybatisUtils.getSqlSession();
                // getMapper
                CartypeMapper mapper2 = sqlSession.getMapper(CartypeMapper.class);
                //get alluser from Mysql, userlist is list
                List<CartypeLei> cartype = mapper2.getCartype();
                //transform alluser to JSON String

                //mapper.getUserByUsername(username);
                list = JSON.toJSONString(cartype);
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
            String  cartype_JSON = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(cartype_JSON);
            System.out.println(cartype_JSON);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
