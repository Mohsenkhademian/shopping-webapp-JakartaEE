
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>order</title>
</head>
<body>
hi orderssss
<table>
    <tr>
        <th>Id</th>
        <th>Customer Id</th>
        <th>Customer Name</th>
        <th>Customer Address</th>
        <th>Order Date</th>
        <th>Item List</th>
    </tr>
    <c:forEach orders="${orders}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.customerId}</td>
            <td>${order.customerName}</td>
            <td>${order.customerAddress}</td>
            <td>${order.orderDate}</td>
            <td>${order.items}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
