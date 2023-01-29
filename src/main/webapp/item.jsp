
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/item" method="post" enctype="multipart/form-data">

    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br>
    <label for="description">Description:</label>
    <input type="text" id="description" name="description"><br>
    <label for="price">Price:</label>
    <input type="number" id="price" name="price" required min="0" max="10000"><br>
    <label for="itemPhoto">Item Photo:</label>
    <input type="file" id="itemPhoto" name="itemPhoto"><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
