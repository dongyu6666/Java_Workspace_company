
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--内置对象--%>
<%
/*
pageContext.setAttribute("name1","1号");
*/
pageContext.setAttribute("name1","1号");
request.setAttribute("name2","2号");
session.setAttribute("name3","3号");
application.setAttribute("name4","4号");
%>

<%--通过pageContext取出保存的值--%>

<%

    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");

    pageContext.forward("/pageDemo02.jsp");
%>


<%--使用EL表达式   ${}--%>
<h1> ${name1} </h1>
<h1> ${name2} </h1>
<h1> ${name3} </h1>
<h1> ${name4} </h1>
<h1> ${name5} </h1>





</body>
</html>
