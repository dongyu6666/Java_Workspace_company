package com.fawvw.web.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
* 2. 获取请求头数据
 * 方法：
 * (*)String getHeader(String name):通过请求头的名称获取请求头的值
 * Enumeration<String> getHeaderNames():获取所有的请求头名称
* */

@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有的请求头名称
        String agent = request.getHeader("user-agent");
        if(agent.contains("Chrome")){
            System.out.println("谷歌");
        }else if(agent.contains("Firefox")){
            System.out.println("火狐");
        }


    }

}
