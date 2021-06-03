
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="API" class="pojo.API" scope="page"/>
<jsp:setProperty name="API" property="status" value="OK"/>


<jsp:getProperty name="API" property="status"/>



</body>
</html>
