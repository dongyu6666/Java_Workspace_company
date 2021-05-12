package servlet;

import dao.plee_UserDao;
import domain.plee_UserLei;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/plee_loginServlet")
public class plee_LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("UTF-8");

        //2.获取请求参数
        //String username = request.getParameter("username");
        //String password = request.getParameter("password");
        //3.封装user对象
        //UserLei loginUser = new UserLei();
        //loginUser.setUsername(username);
        //loginUser.setPassword(password);

        //2.获取所有请求参数
        Map<String, String[]> map = request.getParameterMap();
        //3.创建User对象
        plee_UserLei loginUser = new plee_UserLei();
        //3.2使用BeanUtils封装
        try {
            BeanUtils.populate(loginUser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //4.调用UserDao的login方法
        plee_UserDao plee_userDao = new plee_UserDao();

        plee_UserLei user = plee_userDao.login(loginUser);

        //5.判断并确认角色写进数据库


        if(user == null){
            //登录失败,然后跳转
            //request.getRequestDispatcher("/failServlet").forward(request,response);
            System.out.println("登录失败");

        }
        else {
            //登陆成功，存储数据
            //request.setAttribute("user",user);
            //然后跳转（转发）
            //request.getRequestDispatcher("/successServlet").forward(request,response);

            //插入role
            plee_UserLei insert_role = plee_userDao.insert_role(loginUser);
            System.out.println("登录成功");

        }

    }
}
