
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>order</title>
</head>
<body>
<form action="/order" method="post">
    <label for="customerName">Customer Name:</label>
    <input type="text" id="customerName" name="customerName" required>
    <br>
    <label for="customerAddress">Customer Address:</label>
    <input type="text" id="customerAddress" name="customerAddress" required>
    <br>
    <label for="orderDate">Order Date:</label>
    <input type="date" id="orderDate" name="orderDate" required>
    <br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
