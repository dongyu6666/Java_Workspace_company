<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入JSTL核心标签库，使用其标签core--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--定义一个变量score,值为85--%>
<%
    ArrayList<String> people = new ArrayList<>();
    people.add(0,"aaa");
    people.add(1,"bbb");
    people.add(2,"ccc");
    people.add(3,"ddd");
    people.add(4,"eee");
    people.add(5,"fff");

    request.setAttribute("list", people);
%>
<c:forEach var="people" items="${list}">
    <c:out value="${people}"/> <br/>
</c:forEach>

<hr>

<c:forEach var="people" items="${list}" begin="1" end="5" step="2">
    <c:out value="${people}"/> <br/>
</c:forEach>



</body>
</html>
