
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delivery</title>
</head>
<body>
hiiiiiiiiiiiiii
<table>
  <thead>
  <tr>
    <th>Order ID</th>
    <th>Recipient Name</th>
    <th>Recipient Address</th>
    <th>Delivery Status</th>
    <th>Delivery Date</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${deliveries}" var="delivery">
    <tr>
      <td>${delivery.orderId}</td>
      <td>${delivery.recipientName}</td>
      <td>${delivery.recipientAddress}</td>
      <td>${delivery.deliveryStatus}</td>
      <td>${delivery.deliveryDate}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>
