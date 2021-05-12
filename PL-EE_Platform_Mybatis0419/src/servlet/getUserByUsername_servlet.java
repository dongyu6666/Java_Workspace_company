package servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.API;
import pojo.UserLei;
import utils.MybatisUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@WebServlet("/getUserByUsername")
public class getUserByUsername_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //查询全部用户
            //setContentType
            response.setContentType("text/html;charset=UTF-8");
            //Object username = request.getAttribute("username");
        String username = request.getParameter("username");

        //获得SqlSession对象
            API api = new API();
            api.setStatus("true");
            api.setInfo("offer user info by username");
            api.setError("null");

            //声明变量
            SqlSession sqlSession = null;
            UserMapper mapper = null;
            List<UserLei> userlist = null;
            String list= null;

            try {
                sqlSession = MybatisUtils.getSqlSession();
                // getMapper
                mapper = sqlSession.getMapper(UserMapper.class);
                //get alluser from Mysql, userlist is list
                userlist = mapper.getUserByUsername(username);
                //transform alluser to JSON String

                //mapper.getUserByUsername(username);
                list = JSON.toJSONString(userlist);
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
            String  alluser_JSON = JSON.toJSONString(api);

            // output to Client
            Writer out = response.getWriter();
            out.write(alluser_JSON);
            System.out.println(alluser_JSON);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
