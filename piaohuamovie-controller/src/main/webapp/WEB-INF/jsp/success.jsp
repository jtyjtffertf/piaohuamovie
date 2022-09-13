<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/21
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>

    <title>跳转页</title>

    <style>
        body{
            background-color:lightslategrey;
        }
    </style>
</head>

<body>

${msg}</br>

<a href='${pageContext.request.contextPath }/user/show-login'>去登录</a>

</body>

</html>
