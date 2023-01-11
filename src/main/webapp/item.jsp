
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hi itemmssss

<table>
    <tr>
        <th>Id</th>
        <th>Order Id</th>
        <th>Storage Id</th>
        <th>Offer Id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${items}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.orderId}</td>
            <td>${item.storageId}</td>
            <td>${item.offerId}</td>
            <td>${item.name}</td>
            <td>${item.description}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
