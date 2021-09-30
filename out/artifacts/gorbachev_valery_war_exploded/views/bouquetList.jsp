<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 22.09.2021
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<table border="6">
  <tr>
    <th>bouquetId</th>
    <th>bouquetName</th>
    <th>bouquetPrice</th>
  </tr>
  <c:forEach items="${bouquetlist}" var="bouquet">
    <tr>
      <td>${bouquet.getBouquetId()}</td>
      <td>${bouquet.getBouquetName()}</td>
      <td>${bouquet.getBouquetPrice}</td>
      <td>
        <form action="bouquetList" method="get">
          <input type="hidden" name="UserIdParam" value="${bouquet.getBouquetId()}"/>
          <button type="submit">Delete</button>
        </form>
      </td>
      <td>
        <form action="bouquetId" method="get">
          <br>
          <label>name</label>
          <input type="hidden" name="BouquetIdParam" value="${bouquet.getBouquetId}" />
          <input type="hidden" name="BouquetNameParam" value="${bouquet.getBouquetName()}" />
          <input type="hidden" name="BouquetPriceParam" value="${bouquet.getBouquetPrice}" />/>
          <button type="submit">Edit</button>
        </form>
      </td>
    </tr>
  </c:forEach>
</table>
<form action="bouquetadd" method="get">
  <button type="submit">Add new User</button>
</form>
</body>
</html>