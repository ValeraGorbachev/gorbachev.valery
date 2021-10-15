<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Account</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <div><h1>Create new Account</h1>

        <div>
            <%
                if (

                        request.getAttribute("userName") != null &&
                        request.getAttribute("password") != null&&
                        request.getAttribute("email") != null&&
                        request.getAttribute("userRole") != null
                ) {
                    out.print("<p>User '" + request.getAttribute("id") + "' added!</p>");
                }
            %>
        </div>

        <div>
            <h2>New User</h2>
        </div>
        <div>
            <form method="post">

                <label>Name:
                    <input type="text" name="userName"><br/>
                </label>

                <label>Email:
                    <input type="text" name="email"><br/>
                </label>
                <label>Password:
                    <input type="text" name="password"><br/>
                </label>
                <label>UserRole:
                    <input type="text" name="userRole"><br/>
                </label>
                <button type="submit">Submit</button>
            </form>
        </div>
        <div>
            <button onclick="location.href='/index.jsp'">Back to main</button>
        </div>
    </div>
</body>
</html>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <style type="text/css">--%>
<%--        html {--%>
<%--            background-color:#214c84;--%>
<%--            background-blend-mode:overlay;--%>
<%--            display:flex;--%>
<%--            align-items:center;--%>
<%--            justify-content:center;--%>
<%--            background-image:url(http://bloom.by/upload/iblock/79c/79c8db754b7479b6f38172b7fe28279d.jpg);--%>
<%--            background-repeat:no-repeat;--%>
<%--            background-size:cover;--%>
<%--            height:100%;--%>
<%--        }--%>

<%--        body {--%>
<%--            background-color:transparent;--%>
<%--        }--%>

<%--        .registration-cssave{--%>
<%--            padding:50px 0;--%>
<%--        }--%>

<%--        .registration-cssave form {--%>
<%--            max-width:800px;--%>
<%--            padding:50px 70px;--%>
<%--            border-radius:10px;--%>
<%--            box-shadow:4px 4px 15px rgba(0, 0, 0, 0.2);--%>
<%--            background-color:#fff;--%>
<%--        }--%>

<%--        .registration-cssave form h3 {--%>
<%--            font-weight:bold;--%>
<%--            margin-bottom:30px;--%>
<%--        }--%>

<%--        .registration-cssave .item {--%>
<%--            border-radius:10px;--%>
<%--            margin-bottom:25px;--%>
<%--            padding:10px 20px;--%>
<%--        }--%>

<%--        .registration-cssave .create-account {--%>
<%--            border-radius:30px;--%>
<%--            padding:10px 20px;--%>
<%--            font-size:18px;--%>
<%--            font-weight:bold;--%>
<%--            background-color:#3f93ff;--%>
<%--            border:none;--%>
<%--            color:white;--%>
<%--            margin-top:20px;--%>
<%--        }--%>

<%--        @media (max-width: 576px) {--%>
<%--            .registration-cssave form {--%>
<%--                padding:50px 20px;--%>
<%--            }--%>
<%--        }--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="w3-container w3-blue-grey w3-opacity w3-right-align">--%>
<%--    <div><h1>Create new Account</h1>--%>

<%--        <div>--%>
<%--            <%--%>
<%--                if (--%>

<%--                        request.getAttribute("userName") != null &&--%>
<%--                                request.getAttribute("password") != null&&--%>
<%--                                request.getAttribute("email") != null&&--%>
<%--                                request.getAttribute("userRole") != null--%>
<%--                ) {--%>
<%--                    out.print("<p>User '" + request.getAttribute("id") + "' added!</p>");--%>
<%--                }--%>
<%--            %>--%>
<%--        </div>--%>

<%--<div class="registration-cssave">--%>
<%--    <form method="POST" action="${pageContext.request.contextPath}/login">--%>
<%--        <h3 class="text-center">Регистрация</h3>--%>
<%--        <div class="form-group">--%>
<%--            <input class="form-control item" type="text" name="userName" maxlength="15" minlength="4" pattern="^[a-zA-Z0-9_.-]*$" id="username" placeholder="Логин" value= "${user.userName}" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <input class="form-control item" type="password" name="password" minlength="4" id="password" placeholder="Пароль" value= "${user.password}" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <input class="form-control item" type="text" name="email" minlength="4" id="email" placeholder="email" value= "${user.email}" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <input class="form-control item" type="text" name="userRole" minlength="4" id="userRole" placeholder="UserRole" value= "${user.userRole}" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <button class="btn btn-primary btn-block create-account" type="submit"  value= "Submit" ></button>--%>
<%--            <button onclick="location.href='/index.jsp'">Back to main</button>--%>
<%--        </div>--%>

<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>

