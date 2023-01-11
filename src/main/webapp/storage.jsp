
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>storage</title>
</head>
<body>
welcome to storage page
<table border="1" bgcolor="aqua">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Address</th>
        <th>Capacity</th>
        <th>Available Capacity</th>
        <th>Item List</th>
    </tr>
    <c:forEach storages="${storages}" var="storage">
        <tr>
            <td>${storage.id}</td>
            <td>${storage.name}</td>
            <td>${storage.address}</td>
            <td>${storage.capacity}</td>
            <td>${storage.availableCapacity}</td>
            <td>${storage.items}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
