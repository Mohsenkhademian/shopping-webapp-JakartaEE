
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Storage Details</title>
</head>
<body>
<h1>Storage Details</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Address</th>
        <th>Capacity</th>
        <th>Available Capacity</th>
    </tr>
    <tr>
        <td>${storage.name}</td>
        <td>${storage.address}</td>
        <td>${storage.capacity}</td>
        <td>${storage.availableCapacity}</td>
    </tr>
</table>
<h2>Items</h2>
<table>
    <tr>
        <th>Order ID</th>
        <th>Product Name</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    <c:forEach var="item" items="${storage.items}">
        <tr>
            <td>${item.orderId}</td>
            <td>${item.productName}</td>
            <td>${item.description}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
</table>
</body>