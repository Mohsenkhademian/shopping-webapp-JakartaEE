
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delivery</title>
</head>
<body>
<form action="/delivery" method="post">
  <div>
    <label for="recipientName">Recipient Name:</label>
    <input type="text" id="recipientName" name="recipientName" required>
  </div>
  <div>
    <label for="recipientAddress">Recipient Address:</label>
    <input type="text" id="recipientAddress" name="recipientAddress" required>
  </div>
  <div>
    <label for="recipientNumberPhone">Recipient Phone Number:</label>
    <input type="text" id="recipientNumberPhone" name="recipientNumberPhone" required>
  </div>
  <div>
    <label for="deliveryStatus">Delivery Status:</label>
    <input type="checkbox" id="deliveryStatus" name="deliveryStatus">
  </div>
  <div>
    <label for="deliveryDateTime">Delivery Date and Time:</label>
    <input type="datetime-local" id="deliveryDateTime" name="deliveryDateTime" required>
  </div>
  <div>
    <button type="submit">Create Delivery</button>
  </div>
</form>


</body>
</html>
