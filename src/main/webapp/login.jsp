
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fa" dir="rtl">
<head>
    <meta charset="utf-8" />
    <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
            crossorigin="anonymous"
    />
   <link rel="stylesheet" href="assets2/css/all.css" />
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
            integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
    />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="assets2/js/enter.js"></script>
    <link rel="stylesheet" href="assets2/css/homestyle.css"/>
    <link rel="stylesheet" href="assets2/css/registrationform.css"/>
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script> -->
    <title>ورود</title>
</head>

<body>



<div class="container-fluid">
    <div class="row ">

        <div class="col-4"></div>
        <div id="loadpage" class="col-12 col-lg-4">
            <form class="frmregister" action="/login" method="post">
                <h3>ورود</h3>
                <label for="username"> آدرس ایمیل </label><i>*</i>
                <input type="text" id="username" name="email">

                <label for="password">رمز عبور</label><i>*</i>
                <input type="password" id="password" name="password">

<%--                <button id="enterbtn" class="mb-4" type="submit">ورود</button>--%>
                <input id="checkbx" type="checkbox">
                <label for="checkbx">مرا به خاطر بسپار</label>
                <a href="#" id="remember">
                    رمز عبور را فراموش کرده اید؟
                </a>
                <button id="enterbtn" class="mb-4" type="submit">ورود</button>
            </form>
        </div>
        <div class="col-4"></div>
    </div>



<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"
></script>
<script src="assets2/js/enter.js"></script>
</body>
</html>
