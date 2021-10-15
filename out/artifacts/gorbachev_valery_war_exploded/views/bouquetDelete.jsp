<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DeleteBouquet</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
<div><h1>Delete your Bouquet</h1>

    <div>
        <%
            if (request.getAttribute("bouquetId") != null &&
                    request.getAttribute("bouquetName") != null &&
                    request.getAttribute("bouquetPrice") != null
            ) {
                out.print("<p>Bouquet '" + request.getAttribute("bouquetId") + "' deleted!</p>");
            }
        %>
    </div>

    <div>
        <h2>Delete Bouquet</h2>
    </div>
    <div>
        <form method="post">

            <label>Id:
                <input type="text" name="bouquetId"><br/>
            </label>
            <label>Name:
                <input type="text" name="bouquetName"><br/>
            </label>

            <label>Price:
                <input type="text" name="bouquetPrice"><br/>
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