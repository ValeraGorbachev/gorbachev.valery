<%@ page import="app.entity.Bouquet" %>
<%@ page import="java.util.List" %>
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
  <title>Bouquets</title>
</head>
<body>
<table>
  <tr>
    <th>Bouquet Id</th>
    <th>Bouquet Name</th>
    <th>Bouquet Price</th>
    <th>   </th>
  </tr>

  <%
    List<Bouquet> bouquets = (List<Bouquet>) request.getAttribute("Bouquets");
    if (bouquets != null && !bouquets.isEmpty()) {
      for (Bouquet b : bouquets) {
        out.print("<tr>");
        out.print("<td>" + b.getBouquetId() + "</td>");
        out.print("<td>" + b.getBouquetName() + "</td>");
        out.print("<td>" + b.getBouquetPrice() + "</td>");

      }
    } else out.println("<p> There are no car yet! </p>");
  %>
</table>

</body>
</html>