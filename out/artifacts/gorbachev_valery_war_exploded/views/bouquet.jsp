<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addBouquet</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
<div><h1>Add your Bouquet</h1>

    <div>
        <%
            if (request.getAttribute("bouquetId") != null &&
                    request.getAttribute("bouquetName") != null &&
                    request.getAttribute("bouquetPrice") != null
            ) {
                out.print("<p>Bouquet '" + request.getAttribute("bouquetId") + "' added!</p>");
            }
        %>
    </div>

    <div>
        <h2>Add Bouquet</h2>
    </div>
    <div>
        <form method="post">




        <label>Name:
                <input type="text" name="bouquetName"><br/>
            </label>

            <label>Price:
                <input type="text" name="bouquetPrice"><br/>
            </label>
            <button  type="submit">Submit</button>
        </form>
    </div>
    <div>
        <button onclick="location.href='/index.jsp'">Back to main</button>
    </div>
</div>
</body>
</html>