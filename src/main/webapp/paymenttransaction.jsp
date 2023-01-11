
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>payment-transaction</title>
</head>
<body>
welcome to payment-transaction
<table>
    <thead>
    <tr>
        <th>Amount</th>
        <th>Transaction Time</th>
        <th>Customer</th>
        <th>Account Number</th>
        <th>CVV2</th>
        <th>Card Expiration Date</th>
        <th>Order</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="paymentTransaction" items="${paymentTransactions}">
        <tr>
            <td>${paymentTransaction.amount}</td>
            <td>${paymentTransaction.transactionTime}</td>
            <td>${paymentTransaction.customer.name}</td>
            <td>${paymentTransaction.accountNumber}</td>
            <td>${paymentTransaction.cvv2}</td>
            <td>${paymentTransaction.cardExpirationDate}</td>
            <td>${paymentTransaction.order.orderDate}</td>
            <td>${paymentTransaction.order.id}</td>
            <td>${paymentTransaction.customer.id}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
