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
<c:set var="score" value="95"/>
<c:choose>
    <c:when test="${score >=90}">
        very good
    </c:when>
    <c:when test="${score >=70}">
        good
    </c:when>
    <c:when test="${score < 70}">
        poor
    </c:when>
</c:choose>

</body>
</html>
