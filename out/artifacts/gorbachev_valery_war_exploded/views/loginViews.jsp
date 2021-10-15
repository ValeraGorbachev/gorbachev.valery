<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 06.10.2021
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<jsp:include page="bouquet.jsp"></jsp:include>

<h3>Login Page</h3>
<p style="color: red;">${errorString}</p>


<form method="POST" action="${pageContext.request.contextPath}/login">
    <table border="0">
        <tr>
            <td>User Name</td>
            <td><input type="text" name="login" value= "${user.getLogin}" /> </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="text" name="password" value= "${user.getPassword}" /> </td>
        </tr>
        <tr>
            <%--    <tr>--%>
            <%--      <td>Email</td>--%>
            <%--      <td><input type="text" name="password" value= "${user.email}" /> </td>--%>
            <%--    </tr>--%>
        <tr>
        <tr>
            <td>Remember me</td>
            <td><input type="checkbox" name="rememberMe" value= "Y" /> </td>
        </tr>
        <tr>
            <td colspan ="3">
                <input type="submit" value= "Submit" />
                <a href="${pageContext.request.contextPath}/login">Cancel</a>
            </td>
        </tr>
    </table>
</form>

</body>
</html>