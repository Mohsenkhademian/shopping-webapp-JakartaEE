<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="admin" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>
    <input type="submit" value="Save User">
</form>

<form action="admin" method="GET">
    <input type="submit" value="List Users">
</form>

</body>
</html>