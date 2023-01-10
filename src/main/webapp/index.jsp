<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/comment" method="PUT">
    <input type="text" name="userId" placeholder="Enter userId :"><br><br>
<%--    <input type="text" name="username" placeholder="Enter UserName :"><br><br>--%>
    <input type="text" name="text" placeholder="Enter text :"><br><br>
    <input type="submit">
</form>

</body>
</html>