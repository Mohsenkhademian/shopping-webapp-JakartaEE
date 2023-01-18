
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script type="text/javascript">
        <%
            String error = request.getParameter("error");
            if(error != null) {
        %>
        alert("<%= error %>");
        <%
            }
        %>
    </script>
</head>
</head>
<body>
<form action="/login" method="post">
<input type="email" required name="email" placeholder="Enter Email :"><br><br>
<input type="password" required name="password" placeholder="Enter Password :"><br><br>
    <input type="submit" name="" value="login">
</form>
</body>
</html>
