package com.fawvw.web.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/a","/b","/c",})
//@WebServlet("/aa/a")
//@WebServlet("/aa/*")
//@WebServlet("*.do")
public class ServletDemo4_Http extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("成功");
        System.out.println(req);
    }
}
