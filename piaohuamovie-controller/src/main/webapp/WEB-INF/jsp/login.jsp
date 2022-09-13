<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>

    <style>
        body{
            background-color:lightslategrey;
        }
        .div1{
            position: relative;
            top: 100px;
            left: 40%;
        }
        .h_h1{
            position: relative;
            left: 25px;
            font-size: 30px;
        }
        .button2{
            position: relative;
            left: 87px;
        }

    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.js"type="text/javascript" charset="utf-8"></script>
</head>
<body>

<div class="div1">
    <div class="div2"></div>
    <div class="div3">
        <h1 class="h_h1">
            飘花电影
        </h1>
        <div class="div4">
            <div class="lll">${flag }</div>

            <form action=login method="post">


                <input type="text" id="username" name="username" class="input-item" placeholder="请输入用户名"><br>

                <input type="password" id="password" name="password" class="input-item" placeholder="请输入密码">


                <div class="btn">
                    <input class="button button1" type="submit" value="登陆" id="b1"
                           onclick="return yz()" /> <input
                        class="button button2" type="button"
                        onclick='location.href=("show-regist")' value="注册" />
                </div>
        </div>

    </div>
</div>
</form>



</body>



<script type="text/javascript">
    function yz() {
        if (document.getElementById('username').value == ''
            || document.getElementById('password').value == '') {

            alert('用户名或密码错误！');
            document.getElementById('password').focus();
            document.getElementById('username').focus();
            return false;

        }
    }
</script>

</html>