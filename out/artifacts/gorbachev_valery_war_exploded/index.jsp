<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Flower Shop!</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Flower Shop!</h1>
</div>

<div class="w3-container w3-center">
    <div class="w3-bar w3-padding-large w3-padding-24">
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/bouquetList'">List Bouquets
        </button>
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/bouquet'">Add Bouquet</button>
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/bouquetDelete'">Delete Bouquet
        </button>

        <%
            String userName = (String) session.getAttribute("userName");
            if (userName==null) {
        %>
        <div hidden>

            <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/login'">login</button>


        </div>
        <%
        }else{
        %>
        <p>
            <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/login'">login</button>

        </p>
        <% }
        %>



<%--                <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/login'">login</button>--%>
                <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/userAdd'">Create new User</button>
        <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/logout'">Logout</button>
    </div>
</div>
</body>
</html>
