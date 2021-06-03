<%--
  Created by IntelliJ IDEA.
  User: dongyu.liang
  Date: 2021/5/24
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="common/header.jsp"%>
    <h1> 网页主体 </h1>
    <%@include file="common/footer.jsp"%>
<hr>
    <jsp:include page="/common/header.jsp"></jsp:include>
    <h1> 网页主体2 </h1>
    <jsp:include page="/common/footer.jsp"></jsp:include>

</body>
</html>
