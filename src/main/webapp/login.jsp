
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <head>
        <title>login</title>

        <style>
            /* The modal (background) */
            .modal {
                display: none; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 1; /* Sit on top */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }

            /* Modal Content/Box */
            .modal-content {
                background-color: #fefefe;
                margin: 15% auto; /* 15% from the top and centered */
                padding: 20px;
                border: 1px solid #888;
                width: 80%; /* Could be more or less, depending on screen size */
            }

            /* The Close Button */
            .close {
                color: #aaa;
                float: right;
                font-size: 28px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: black;
                text-decoration: none;
                cursor: pointer;
            }
        </style>

    </head>
<body>
<form action="/login" method="post">
    <input type="email" required name="email" placeholder="Enter Email :"><br><br>
    <input type="password" required name="password" placeholder="Enter Password :"><br><br>
    <input type="submit" name="" value="login">
</form>

<div id="errorModal" class="modal">
    <div class="modal-content">
        <span id="errorModalClose" class="close">&times;</span>
        <p id="errorModalContent"></p>
    </div>
</div>

<script>
    function showErrorModal(errorMessage) {
        // Get the modal element
        var modal = document.getElementById("errorModal");

        // Get the modal's content element
        var modalContent = document.getElementById("errorModalContent");

        // Set the error message as the content of the modal
        modalContent.innerHTML = errorMessage;

        // Show the modal
        modal.style.display = "block";
    }

    <%
        String error = request.getParameter("error");
        if(error != null && error.equals("Invalid email or password")) {
    %>
    showErrorModal("<%= error %>");
    <%
        }
    %>

    // Get the modal close button
    var closeButton = document.getElementById("errorModalClose");
    // When the user clicks the close button, hide the modal
    closeButton.onclick = function() {
        modal.style.display = "none";
    }

    // When the user clicks anywhere outside of the modal, hide it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
</script>
</body>
</html>
