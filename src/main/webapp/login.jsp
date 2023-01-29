
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
    <div class="row bg-dark p-4 navitm">
        <h5 class="titr text-light">به سایت مبلمان و لوازم خانگی خوش آمدید.</h5>
        <div class="col-2">
            <span class="logoitm" href="#">مبلمان و لوازم خانگی</span>
        </div>
        <div class="col-1">
            <a href="homepage.jsp">صفحه اصلی</a>
        </div>
        <div class="col-1">
            <a href="#">محصولات</a>
        </div>
        <div class="col-1">
            <a href="#">مقاله ها</a>
        </div>
        <div class="col-4">
            <a href="#">تماس با ما</a>
        </div>
        <div class="col-2">
            <a href="https://mailto:mohsenkhademian18@gmail.com">mohsenkhademian18@gmail.com</a>
        </div>
        <div class="col-1">
            <a href="#">021-000000</a>
        </div>
    </div>

    <!--offconvas+nav -->
    <nav class="row navbar backcl text-light greenheader">
        <div class="container-fluid">


            <button id="showconvasbtn" class="btn" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">
                مبلمان و لوازم خانگی
            </button>
            <h4 id="greenheadertitle">لوازم خانگی</h4>
            <!-- convas -->
            <div
                    class="offcanvas offcanvas-end"
                    tabindex="-1"
                    id="offcanvasRight"
                    aria-labelledby="offcanvasRightLabel">
                <div class="offcanvas-header bg-light">
                    <button
                            type="button"
                            class="btn-close text-reset"
                            data-bs-dismiss="offcanvas"
                            aria-label="Close"
                    ></button>
                </div>
                <div class="offcanvas-body bg-light">
                    <form class="d-flex" role="search">
                        <input
                                class="w-100 p-2 mb-3"
                                type="text"
                                placeholder="جستجو..."
                                id="inpsrch"
                        />
                    </form>
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="#">صفحه اصلی</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">محصولات</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">مقالات</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">تماس با ما</a>
                        </li>
                    </ul>
                </div>
            </div>

            <!-- navitm -->

            <form action="" class="convas-searchbox">
                <input
                        class="form-control"
                        list="datalistOptions"
                        id="exampleDataList"
                        placeholder="جستجو کنید..."
                />
                <datalist id="datalistOptions">
                    <option value="مبلمان"></option>
                    <option value="اجاق گاز"></option>
                    <option value="تلویزیون"></option>
                    <option value="لوازم آشپزخانه"></option>
                    <option value="سرمایش،گرمایش"></option>
                    <option value="مایکروویو، مایکروفر"></option>
                    <option value="محصولات حراجی"></option>
                    <option value="یخچال فریزر"></option>
                </datalist>
            </form>

            <ul id="user-basket-icons" class="d-flex mt-2">
                <li>
                    <a class="nav-link text-dark" aria-current="page" href="registration.html">

                        <span class="fas fa-user"></span>
                        ورود/ثبت نام
                    </a>
                </li>
                <li>
                    <a class="nav-link text-dark" href="#"
                    ><span class="fas fa-shopping-basket"></span
                    ></a>
                </li>
            </ul>
        </div>
</div>
</div>
</nav>
</div>
<!-- ----------------------mainpage--------------------------- -->
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

    <!-- footer -->
    <div class="row footer bg-dark">
        <div class="col-12 col-lg-3">
            <div class="text-light f1 me-lg-3">
                <p>برای تغییر این متن بر روی دکمه ویرایش کلیک کنید. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
                <h4>ما را دنبال کنید</h4><hr>
                <span class="fab fa-telegram"></span>
                <span class="fab fa-instagram"></span>
                <span class="fab fa-facebook"></span>
                <span class="fab fa-twitter"></span>
                <span class="fab fa-whatsapp"></span>
            </div>
        </div>
        <div class="col-12 col-lg-3">
            <div class="text-light f1 ">
                <p>برای تغییر این متن بر روی دکمه ویرایش کلیک کنید. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p><hr>
                <h4>لینک های مرتبط : </h4>
                <ul class="mx-3">
                    <li>وبلاگ ها</li>
                    <li>فهرست مطالب</li>
                    <li>آدرس شعب</li>
                    <li>تماس با ما</li>
                </ul>
            </div>
        </div>
        <div class="col-12 col-lg-6 ">
            <div class="text-light f2">
                <h4 class="mt-4">مجوز ها</h4>
                <div class="row">
                    <div class="col-6 mb-3">
                        <img src="assets2/css/pics/arm1.png" alt="">
                    </div>
                    <div class="col-6 mb-3">
                        <img src="assets2/css/pics/arm2.png" alt="">
                    </div>
                    <div class="col-6">
                        <img src="assets2/css/pics/arm3.png" alt="">
                    </div>
                    <div class="col-6">
                        <img src="assets2/css/pics/arm4.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>


<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"
></script>
<script src="assets2/js/enter.js"></script>
</body>
</html>
