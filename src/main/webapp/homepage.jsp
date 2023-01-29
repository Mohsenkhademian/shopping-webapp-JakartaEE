
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
    <!-- <link rel="stylesheet" href="/assets/css/all.css" /> -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
            integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link rel="stylesheet" href="assets2/css/homestyle.css" />
    <title>صفحه اصلی</title>
</head>
<body>
<div class="container-fluid">
    <div class="row bg-dark p-4 navitm">
        <h5 class="titr text-light">به سایت فروشگاه لوازم خانگی خوش آمدید.</h5>
        <div class="col-2">
            <span class="logoitm" href="#">فروشگاه لوازم خانگی</span>
        </div>
        <div class="col-1">
            <a href="#">صفحه اصلی</a>
        </div>
        <div class="col-1">
            <a href="product.jsp">محصولات</a>
        </div>
        <div class="col-1">
            <a href="document.jsp">مقاله ها</a>
        </div>
        <div class="col-4">
            <a href="#">تماس با ما</a>
        </div>
        <div class="col-2">
            <a href="https://mailto:mohsenkhademian18@gmail.com">mohsenkhademian18@gmail.com</a>
        </div>
        <div class="col-1">
            <a href="#">021-0000000</a>
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
                            <a class="nav-link" href="product.html">محصولات</a>
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
                    <a class="nav-link text-dark" aria-current="page" href="signup.jsp">

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
    <div class="row">
        <div class="col-12 col-lg-4">
            <div class="dastebandibox">
                <ul class="m-4 mt-5">
                    <li><span class="fas fa-tv"></span><a href="#">
                        تلویزیون </a><i class="fas fa-chevron-left"></i></li>

                    <hr>
                    <li>
                        <span class="fas fa-hot-tub"></span><a href="#">
                        سرمایش،گرمایش</a><i class="fas fa-chevron-left"></i></li>
                    <hr>
                    <li>
                        <span class="fas fa-broom"></span><a href="#">
                        جارو برقی</a> <i class="fas fa-chevron-left"></i></li>
                    <hr>
                    <li>
                        <span class="fas fa-dice-d6"></span><a href="#">
                        ماشین ظرفشویی</a><i class="fas fa-chevron-left"></i></li>
                    <hr>
                    <li>
                        <span class="fas fa-desktop"></span><a href="#">
                        سینما خانگی و ساندبار</a>
                        <i class="fas fa-chevron-left"></i>
                    </li>
                    <hr>
                    <li>
                        <span class="fas fa-chair"></span><a href="#">
                        وسایل چوبی</a><i class="fas fa-chevron-left"></i></li>
                    <hr>
                    <li>
                        <span class="fas fa-door-closed"></span><a href="#">
                        یخچال فریزر</a><i class="fas fa-chevron-left"></i></li>
                    <hr>
                </ul>
            </div>
        </div>
        <div class="col-12 col-lg-5 mt-4">
            <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="assets2/css/pics/7.png" class="d-block" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="assets2/css/pics/6.png" class="d-block" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="assets2/css/pics/9.png" class="d-block" alt="...">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
        <div class="col-12 col-lg-3">
            <div class="harajitm">
                <img src="assets2/css/pics/p-21-min.png" alt="">
                <div>
                    <h3>ماشین لباسشویی</h3>
                    <p>14,600,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>


        </div>
    </div>

    <div class="row mt-4 mb-4" id="vizhebox">
        <div class="col-12 col-lg-3">
            <div id="picbox1">
                <img src="assets2/css/pics/sperso.png" alt="pic1">
                <button class="shopbtn">فروشگاه</button>
            </div>
        </div>
        <div class="col-12 col-lg-3">
            <div id="picbox2">
                <img src="assets2/css/pics/jaroo.png" alt="pic2">
                <button class="shopbtn">فروشگاه</button>
            </div>
        </div>
        <div class="col-12 col-lg-3">
            <div id="picbox3">
                <img src="assets2/css/pics/abmive.png" alt="pic3">
                <button class="shopbtn">فروشگاه</button>
            </div>
        </div>
        <div class="col-12 col-lg-3">
            <div id="picbox4">
                <img src="assets2/css/pics/7.png" alt="pic4">
                <button class="shopbtn">فروشگاه</button>
            </div>
        </div>
    </div>


    <div class="row">
        <h1 class="text-end">جدید ترین محصولات</h1><hr>
        <div class="col-6 col-lg-2">
            <div class="harajitm">
                <img src="assets2/css/pics/p-21-min.png" alt="">
                <div>
                    <h3>ماشین لباسشویی</h3>
                    <p>17,500,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>
        </div>
        <div class="col-6 col-lg-2">
            <div class="harajitm mb-5">
                <img src="assets2/css/pics/6.png" alt="">
                <div>
                    <h3>تلویزیون</h3>
                    <p>14,600,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>
        </div>
        <div class="col-6 col-lg-2">
            <div class="harajitm">
                <img src="assets2/css/pics/abmive.png" alt="">
                <div>
                    <h3>دستگاه آبمیوه گیری</h3>
                    <p>12,000,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>
        </div>
        <div class="col-6 col-lg-2">
            <div class="harajitm">
                <img src="assets2/css/pics/sperso.png" alt="">
                <div>
                    <h3>دستگاه اسپرسوساز</h3>
                    <p>9,500,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>
        </div>
        <div class="col-6 col-lg-2">
            <div class="harajitm">
                <img src="assets2/css/pics/9.png" alt="">
                <div>
                    <h3>تلویزیون</h3>
                    <p>21,600,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>
        </div>
        <div class="col-6 col-lg-2">
            <div class="harajitm">
                <img src="assets2/css/pics/7.png" alt="">
                <div>
                    <h3> ال سی دی</h3>
                    <p>16,900,000 تومان</p>
                    <button type="button" onclick="window.location.href='order.jsp'">
                        افزودن به سبد خرید
                        <span class="fas fa-shopping-basket"></span>
                    </button>
                </div>
            </div>
        </div>
    </div>


    <div class="row newitm mb-5">
        <div class="col-12 col-lg-3">
            <img src="assets2/css/pics/slider-8-min.png" alt="">
        </div>
        <div class="col-12 col-lg-6">
            <div class="col-12">
                <img src="assets2/css/pics/blog-3-min.jpg" alt="">
            </div>
            <div class="col-12">
                <img src="assets2/css/pics/blog-5-min.jpg" alt="">
            </div>
        </div>
        <div class="col-12 col-lg-3">
            <img src="assets2/css/pics/slider-5-min.png" alt="">
        </div>
    </div>


    <div class="row commentbox mb-4 mt-2">
        <h1 class="text-end">نظرات مشتریان</h1><hr>
        <div id="cm1" class="col-6 col-lg-4 mt-3">
            <div id="cmb1">
                <h3>آقای مرادی</h3>
                <p>برای تغییر این متن بر روی دکمه ویرایش کلیک کنید. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
            </div>
        </div>
        <div class="col-6 col-lg-4 mt-3">
            <div id="cmb2">
                <h3>خانم احمدی</h3>
                <p>برای تغییر این متن بر روی دکمه ویرایش کلیک کنید. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
            </div>
        </div>
        <div class="col-6 col-lg-4 mt-3">
            <div id="cmb3">
                <h3>آقای زرین بال</h3>
                <p>برای تغییر این متن بر روی دکمه ویرایش کلیک کنید. لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.</p>
            </div>
        </div>
    </div>
    <div class="row brands bg-light p-4 mt-4 mb-5">
        <div class="col-2">
            <div><img src="assets2/css/pics/brand-1.svg" alt=""></div>
        </div>
        <div class="col-2">
            <div><img src="assets2/css/pics/brand-2.png" alt=""></div>
        </div>
        <div class="col-2">
            <div><img src="assets2/css/pics/brand-3.svg" alt=""></div>
        </div>
        <div class="col-2">
            <div><img src="2assets2/css/pics/brand-4.svg" alt=""></div>
        </div>
        <div class="col-2">
            <div><img src="assets2/css/pics/brand-5.svg" alt=""></div>
        </div>
        <div class="col-2">
            <div><img src="assets2/css/pics/brand-2.png" alt=""></div>
        </div>
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
</body>
</html>
