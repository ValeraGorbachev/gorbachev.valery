
<%--<%@ page import="app.entity.Bouquet" %>--%>
<%--<%@ page import="java.util.List" %>--%>
<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: User--%>
<%--  Date: 22.09.2021--%>
<%--  Time: 13:02--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--  <title>Bouquets</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table>--%>
<%--  <tr>--%>
<%--    <th>Bouquet Id</th>--%>
<%--    <th>Bouquet Name</th>--%>
<%--    <th>Bouquet Price</th>--%>
<%--    <th>   </th>--%>
<%--  </tr>--%>

<%--  <%--%>
<%--    List<Bouquet> bouquets = (List<Bouquet>) request.getAttribute("Bouquets");--%>
<%--    if (bouquets != null && !bouquets.isEmpty()) {--%>
<%--      for (Bouquet b : bouquets) {--%>
<%--        out.print("<tr>");--%>
<%--        out.print("<td>" + b.getBouquetId() + "</td>");--%>
<%--        out.print("<td>" + b.getBouquetName() + "</td>");--%>
<%--        out.print("<td>" + b.getBouquetPrice() + "</td>");--%>

<%--      }--%>
<%--    } else out.println("<p> There are no car yet! </p>");--%>
<%--  %>--%>
<%--</table>--%>

<%--</body>--%>
<%--</html>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">

<table border="6">
  <tr>
  <tr>
        <th>Bouquet Id</th>
        <th>Bouquet Name</th>
        <th>Bouquet Price</th>

  </tr>
  <c:forEach  var="bouquet" items="${bouquetList}">
    <tr>
      <td>${bouquet.getBouquetId()}</td>
      <td>${bouquet.bouquetName}</td>
      <td>${bouquet.bouquetPrice}</td>

      <td>
        <form action="deleteBouquet" method="get">
          <input type="hidden" name="BouquetIdParam" value="${bouquet.getBouquetId()}"/>
          <button class="w3-btn w3-hover-green w3-round-large" type="submit">Delete</button>
        </form>
      </td>
<%--      <td>--%>
<%--        <br>--%>
<%--        <form action="/deleteBouquet" method="get">--%>
<%--          <input type="hidden" name="BouquetIdParam" value="${bouquet.getBouquetId()}"/>--%>
<%--          <button class="w3-btn w3-hover-green w3-round-large" type="submit">Delete</button>--%>
<%--        </form>--%>
<%--      </td>--%>
      <td>

        <form action="bouquetUpdate" method="get">
          <br>
          <input type="hidden" name="BouquetIdParam" value="${bouquet.getBouquetId()}" />
          <input type="hidden" name="BouquetNameParam" value="${bouquet.getBouquetName()}" />
          <input type="hidden" name="BouquetPriceParam" value="${bouquet.getBouquetPrice()}" />

          <button  class="w3-btn w3-hover-green w3-round-large" type="submit">Update</button>
        </form>
      </td>
    </tr>
  </c:forEach>
</table>

<form action="bouquet" method="get">
  <button class="w3-btn w3-hover-green w3-round-large" type="submit">Add new Bouquet</button>
</form>

</body>
</html>