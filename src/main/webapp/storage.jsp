
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Storage Details</title>
</head>
<body>
<form action="/storage" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address"><br>
    <label for="capacity">Capacity:</label>
    <input type="number" id="capacity" name="capacity"><br>
    <label for="availableCapacity">Available Capacity:</label>
    <input type="number" id="availableCapacity" name="availableCapacity"><br>
    <label for="items">Items:</label>
    <input type="text" id="items" name="items"><br>
    <input type="submit" value="Submit">
</form>

</body>