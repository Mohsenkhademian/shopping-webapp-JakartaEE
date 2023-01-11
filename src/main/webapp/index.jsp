<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>HOME</title>
</head>
<body>
<%--
<form action="customer" method="POST">
    &lt;%&ndash;<label for="name">Name:</label>
    <input type="text" id="names" name="name"><br><br>&ndash;%&gt;
    <label for="name">name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="email">email:</label>
    <input type="email" id="email" name="email"><br><br>
    <input type="submit" value="Save User">
</form>

<form action="customer" method="GET">
    <input type="submit" value="List Users">
</form>
--%>



<%--

<form action="delivery" method="POST">
    <label>Order ID:</label>
    <input type="text" name="orderId"/><br/>

    <label>Recipient Name:</label>
    <input type="text" name="recipientName"/><br/>

    <label>Recipient Address:</label>
    <input type="text" name="recipientAddress"/><br/>

    <label>Delivery Status:</label>
    <input type="checkbox" name="deliveryStatus"/><br/>

    <label>Delivery Date:</label>
    <input type="date" name="deliveryDate"/><br/>

    <label>Select Items</label>
    <select name="itemIds" multiple>
        <c:forEach items="${items}" var="item">
            <option value="${item.id}">${item.name}</option>
        </c:forEach>
    </select>


    <button type="submit">Save</button>
</form>
<form action="delivery" method="GET">
    <input type="submit" value="List Delivery">
</form>

--%>


<%--

<form action="item" method="post">
    <label>Order Id:</label>
    <input type="text" name="orderId"/><br/>
    <label>Storage Id:</label>
    <input type="text" name="storageId"/><br/>
    <label>Offer Id:</label>
    <input type="text" name="offerId"/><br/>
    <label>Name:</label>
    <input type="text" name="name"/><br/>
    <label>Description:</label>
    <input type="text" name="description"/><br/>
    <label>Price:</label>
    <input type="text" name="price"/><br/>
    <input type="submit" value="Save"/>
</form>

<form action="item" method="GET">
    <input type="submit" value="List Items">
</form>
--%>






<%--
<form action="offer" method="post">
    <label>Price:</label>
    <input type="text" name="price"/><br/>
    <input type="submit" value="Save"/>
</form>

<form action="offer" method="GET">
    <input type="submit" value="List Offers">
</form>--%>


<form action="order" method="post">
    <label>Customer Id:</label>
    <input type="text" name="customerId"/><br/>
    <label>Customer Name:</label>
    <input type="text" name="customerName"/><br/>
    <label>Customer Address:</label>
    <input type="text" name="customerAddress"/><br/>
    <label>Order Date:</label>
    <input type="date" name="orderDate"/><br/>
    <label>Select Items</label>
    <select name="itemIds" multiple>
        <c:forEach items="${items}" var="item">
            <option value="${item.id}">${item.name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Save"/>
</form>

<form action="order" method="GET">
    <input type="submit" value="List Order">
</form>







</body>
</html>