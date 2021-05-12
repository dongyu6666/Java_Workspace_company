package com.fawvw.web.servlet.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8");

        //存储数据到request域中
        request.setAttribute("shala","baba");

        //转发到Demo9
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");
        requestDispatcher.forward(request,response);

        //一般用下面的去写（链式编程）
        //request.getRequestDispatcher("/requestDemo9").forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    this.doPost(request,response);
        }
}
