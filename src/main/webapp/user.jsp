<%--<%@ taglib prefix="c" uri="http://jakarta.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>User-Page</title>
</head>
<body>
hi User
<c:if test="${not empty message}">
    <p> ${message} </p>
</c:if>
<c:if test="${not empty users}">
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Username</th>
            <th>Password</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>


</body>
</html>
