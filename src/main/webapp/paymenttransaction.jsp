<%--&lt;%&ndash;<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>&ndash;%&gt;       have error !--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>payment-transaction</title>
</head>
<body>
<h2>show order data:</h2>
<table style="border: 1px solid black;">

    <tr style="border: 1px solid black;">
        <th >Customer Name</th>
        <th>Customer Address</th>
        <th>Order Date</th>
    </tr>
    <c:forEach items="${order}" var="order">
        <tr>
            <td><c:out value="${order.customerName}"/></td>
            <td><c:out value="${order.customerAddress}"/></td>
            <td><c:out value="${order.orderDate}"/></td>
        </tr>
    </c:forEach>
</table>


<br><br><br><br>
<form action="/paymenttransaction" method="post">
    <label for="amount">Amount:</label>
    <input type="text" id="amount" name="amount"><br>
    <label for="transactionDateTime">Transaction Date and Time:</label>
    <input type="datetime-local" id="transactionDateTime" name="transactionDateTime"><br>
    <label for="accountNumber">Account Number:</label>
    <input type="text" id="accountNumber" name="accountNumber"><br>
    <label for="cvv2">CVV2:</label>
    <input type="text" id="cvv2" name="cvv2"><br>
    <label for="cardExpirationDate">Card Expiration Date:</label>
    <input type="date" id="cardExpirationDate" name="cardExpirationDate"><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
