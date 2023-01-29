
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>payment-transaction</title>
</head>
<body>
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
