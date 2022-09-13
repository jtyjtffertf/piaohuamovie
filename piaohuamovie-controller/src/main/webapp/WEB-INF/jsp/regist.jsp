<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/17
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>

    <title>用户注册</title>
    <style>
        body{
            background-color:lightslategrey;
        }
    </style>

</head>

<body>

<form action='${pageContext.request.contextPath }/user/regist.action'>

    <table border='0'>

        <tr>

            <td>用户名</td>

            <td><input type='text' name='username'></td>

        </tr>

        <tr>

            <td>密码</td>

            <td><input type='text' name='password'></td>

        </tr>

        <tr>

            <td><input type='submit' value='注册'></td>

        </tr>

    </table>

</form>

</body>

</html>