package com.fawvw.web.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;


@WebServlet("/requestDemo7")
public class RequestDemo7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //doPost请求参数username
        request.setCharacterEncoding("UTF-8");//可以解决乱码

        String username = request.getParameter("username");
        System.out.println(username);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        }
}
