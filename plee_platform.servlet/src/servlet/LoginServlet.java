package servlet;

import dao.UserDao;
import domain.UserLei;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置编码
        request.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //3.封装user对象
        UserLei loginUser = new UserLei();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        //4.调用UserDao的login方法
        UserDao userDao = new UserDao();

        UserLei user = userDao.login(loginUser);
        //5.判断user
        if(user == null){
            //登录失败,然后跳转
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }
        else {
            //登陆成功，存储数据
            request.setAttribute("user",user);
            //然后跳转（转发）
            request.getRequestDispatcher("/successServlet").forward(request,response);



        }



    }
}
