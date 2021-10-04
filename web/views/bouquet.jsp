<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addBouquet</title>
</head>
<body>
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
        <button onclick="location.href='/'">Back to main</button>
    </div>
</div>
</body>
</html>