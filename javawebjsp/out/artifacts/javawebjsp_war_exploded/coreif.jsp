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

<h4>
    if test
</h4>

<form action="coreif.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>

<c:if test="${param.username == 'admin'}" var="isAdmin" >
    <c:out value="welcome administrator!"/>
    
</c:if>
<c:out value="${isAdmin}"/>

</body>
</html>
