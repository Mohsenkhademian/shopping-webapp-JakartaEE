
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Comment-Page</title>
</head>
<body>
<form action="/comment" method="post">
    <label for="text">Comment text:</label>
    <input type="text" id="text" name="text"><br>
    <label for="likeCount">Like Count:</label>
    <input type="number" id="likeCount" name="likeCount"><br>
    <label for="dateTime">Date and Time:</label>
    <input type="datetime-local" id="dateTime" name="dateTime" placeholder="yyyy-MM-ddTHH:mm:ss"><br>
    <input type="submit" value="Save Comment">
</form>

</body>
</html>
