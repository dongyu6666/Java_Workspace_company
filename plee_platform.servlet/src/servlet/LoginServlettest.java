package servlet;

import dao.UserDao;
import domain.UserLei;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlettest")
public class LoginServlettest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");//可以解决乱码
        //获得输入的username
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("输入的名字是："+ username);
        System.out.println("输入的密码是："+ password);
        //把获得的username封装成UserLei对象，并写进去username
        UserLei loginuser = new UserLei();
        loginuser.setUsername(username);
        loginuser.setPassword(password);
        //测试数据库返回，用Userdao的login方法
        UserDao userDao = new UserDao();

        UserLei user_return = userDao.login(loginuser);

        System.out.println("数据库的结果："+ user_return);


       /* String username_real = user_return.getUsername();
        String password_real = user_return.getPassword();
        System.out.println("数据库实际的名字是："+ username_real);
        System.out.println("数据库实际的密码是："+ password_real);*/

        //去数据库中查实际的用户名
        /*UserDao userDao = new UserDao();

        UserLei user_real = userDao.login(loginUser);
        String username_real = user_real.getUsername();
        String password_real = user_real.getPassword();
        System.out.println("数据库实际的名字是："+ username_real);
        System.out.println("数据库实际的密码是："+ password_real);*/



        /*if(username == user_real.getUsername()){
            System.out.println("正确");

        }
        else {
            System.out.println("错误");
        }*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    this.doPost(request,response);



    }
}
