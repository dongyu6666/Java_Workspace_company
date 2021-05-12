package com.fawvw.web.servlet.request;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;


@WebServlet("/requestDemo5")
public class RequestDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //获取请求消息体--请求参数
    //BufferedReader getReader()：获取字符输入流，只能操作字符数据
        BufferedReader reader = request.getReader();
        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }



        //ServletInputStream getInputStream()：获取字节输入流，可以操作所有类型数据
        //ServletInputStream inputStream = request.getInputStream();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

}
