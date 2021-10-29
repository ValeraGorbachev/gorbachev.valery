<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">--%>
<%--    <meta charset="UTF-8">--%>

<%--</head>--%>
<%--<body>--%>
<%--<jsp:include page="_menu.jsp"></jsp:include>--%>
<%--<jsp:include page="_header.jsp"></jsp:include>--%>

<%--<h3>Login Page</h3>--%>
<%--<p style="color: red;">${errorString}</p>--%>


<%--<form method="POST" action="${pageContext.request.contextPath}/login">--%>
<%--    <table border="0">--%>
<%--        <tr>--%>
<%--            <td>User Name</td>--%>
<%--            <td><input type="text" name="userName" value= "${user.userName}" /> </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>Password</td>--%>
<%--            <td><input type="text" name="password" value= "${user.password}" /> </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            &lt;%&ndash;    <tr>&ndash;%&gt;--%>
<%--            &lt;%&ndash;      <td>Email</td>&ndash;%&gt;--%>
<%--            &lt;%&ndash;      <td><input type="text" name="password" value= "${user.email}" /> </td>&ndash;%&gt;--%>
<%--            &lt;%&ndash;    </tr>&ndash;%&gt;--%>
<%--        <tr>--%>
<%--        <tr>--%>
<%--            <td>Remember me</td>--%>
<%--            <td><input type="checkbox" name="rememberMe" value= "Y" /> </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td colspan ="3">--%>
<%--                <input type="submit" value= "Submit" />--%>
<%--                <a href="${pageContext.request.contextPath}/login">Cancel</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        html {
            background-color:#214c84;
            background-blend-mode:overlay;
            display:flex;
            align-items:center;
            justify-content:center;
            background-image:url(http://bloom.by/upload/iblock/79c/79c8db754b7479b6f38172b7fe28279d.jpg);
            background-repeat:no-repeat;
            background-size:cover;
            height:100%;
        }

        body {
            background-color:transparent;
        }

        .registration-cssave{
            padding:50px 0;
        }

        .registration-cssave form {
            max-width:800px;
            padding:50px 70px;
            border-radius:10px;
            box-shadow:4px 4px 15px rgba(0, 0, 0, 0.2);
            background-color:#fff;
        }

        .registration-cssave form h3 {
            font-weight:bold;
            margin-bottom:30px;
        }

        .registration-cssave .item {
            border-radius:10px;
            margin-bottom:25px;
            padding:10px 20px;
        }

        .registration-cssave .create-account {
            border-radius:30px;
            padding:10px 20px;
            font-size:18px;
            font-weight:bold;
            background-color:#3f93ff;
            border:none;
            color:white;
            margin-top:20px;
        }

        @media (max-width: 576px) {
            .registration-cssave form {
                padding:50px 20px;
            }
        }
    </style>
</head>
<body>

<div class="registration-cssave">
    <form method="POST" action="${pageContext.request.contextPath}/login">
        <h3 class="text-center">Форма входа</h3>
        <div class="form-group">
            <input class="form-control item" type="text" name="userName" maxlength="15" minlength="4" pattern="^[a-zA-Z0-9_.-]*$" id="userName" placeholder="Логин" value= "${user.userName}" required>
        </div>
        <div class="form-group">
            <input class="form-control item" type="password" name="password" minlength="4" id="password" placeholder="Пароль" value= "${user.password}" required>
        </div>
        <div class="form-group">
            <button class="btn btn-primary btn-block create-account" type="submit"  value= "Submit" >Вход в аккаунт</button>
            <a href="${pageContext.request.contextPath}/login">Cancel</a>
        </div>

    </form>
</div>
</body>
</html>




