<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="customer" method="POST">
    <%--<label for="name">Name:</label>
    <input type="text" id="names" name="name"><br><br>--%>
    <label for="name">name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="email">email:</label>
    <input type="email" id="email" name="email"><br><br>
    <input type="submit" value="Save User">
</form>

<form action="customer" method="GET">
    <input type="submit" value="List Users">
</form>

</body>
</html>