
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>offer</title>
</head>
<body>
hi offersssss
<table>
  <tr>
    <th>price</th>
  </tr>
<c:forEach offers="${offers}" var="offer">
  <tr>
    <td>${offer.price}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>
