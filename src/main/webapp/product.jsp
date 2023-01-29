
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
          referrerpolicy="no-referrer"
  />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <link rel="stylesheet" href="assets2/css/homestyle.css" />
  <title>محصولات</title>
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
      <a href="product.jsp">محصولات</a>
    </div>
    <div class="col-1">
      <a href="document.jsp">مقاله ها</a>
    </div>
    <div class="col-4">
      <a href="#">تماس با ما</a>
    </div>
    <div class="col-2">
      <a href="https://mailtomohsenkhademian18@gmail.com">mohsenkhademian18@gmail.com</a>
    </div>
    <div class="col-1">
      <a href="#">021-445459</a>
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
          <a class="nav-link text-dark" aria-current="page" href="Enter.html">

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
  <div class="row" id="loadproducts">
    <div class="col-12 col-lg-4">
      <h2 class="mt-3">دسته بندی محصولات</h2>
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
    <div class="col-6 col-lg-2">
      <div class="harajitm">
        <img src="assets2/css/pics/9.png" alt="">
        <div>
          <h3>تلویزیون</h3>
          <p>21,600,000 تومان</p>
          <button type="button">
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
          <button type="button">
            افزودن به سبد خرید
            <span class="fas fa-shopping-basket"></span>
          </button>
        </div>
      </div>
    </div>
    <div class="col-6 col-lg-2"><div class="harajitm">
      <img src="assets2/css/pics/abmive.png" alt="">
      <div>
        <h3>دستگاه آبمیوه گیری</h3>
        <p>12,000,000 تومان</p>
        <button type="button">
          افزودن به سبد خرید
          <span class="fas fa-shopping-basket"></span>
        </button>
      </div>
    </div></div>
    <div class="col-6 col-lg-2">
      <div class="harajitm">
        <img src="assets2/css/pics/p-21-min.png" alt="">
        <div>
          <h3>ماشین لباسشویی</h3>
          <p>17,500,000 تومان</p>
          <button type="button">
            افزودن به سبد خرید
            <span class="fas fa-shopping-basket"></span>
          </button>
        </div>
      </div>
    </div>
    <!-- ------------------secondline--------------------- -->

    <div class="col-12 col-lg-4">

      <div class="filterproducts w-100">
        <label class="w-100" for="slcc">فیلتر بر اساس</label>
        <select class="w-100" name="slc" id="slcc">
          <option value="1">ارزان ترین</option>
          <option value="2">گرانترین</option>
          <option value="3">جدیدترین</option>
          <option value="4">قدیمی ترین</option>
        </select>
      </div>
    </div>
    <div class="col-6 col-lg-2">
      <div class="harajitm">
        <img src="assets2/css/pics/9.png" alt="">
        <div>
          <h3>تلویزیون</h3>
          <p>21,600,000 تومان</p>
          <button type="button">
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
          <button type="button">
            افزودن به سبد خرید
            <span class="fas fa-shopping-basket"></span>
          </button>
        </div>
      </div>
    </div>
    <div class="col-6 col-lg-2"><div class="harajitm">
      <img src="assets2/css/pics/abmive.png" alt="">
      <div>
        <h3>دستگاه آبمیوه گیری</h3>
        <p>12,000,000 تومان</p>
        <button type="button">
          افزودن به سبد خرید
          <span class="fas fa-shopping-basket"></span>
        </button>
      </div>
    </div></div>
    <div class="col-6 col-lg-2">
      <div class="harajitm">
        <img src="assets2/css/pics/p-21-min.png" alt="">
        <div>
          <h3>ماشین لباسشویی</h3>
          <p>17,500,000 تومان</p>
          <button type="button">
            افزودن به سبد خرید
            <span class="fas fa-shopping-basket"></span>
          </button>
        </div>
      </div>
    </div>
    <!-- ------------------thirdline--------------------- -->
    <div class="col-3"></div>
    <div class="col-5">
      <nav class="mt-4 npbox" >
        <ul class="pagination" dir="ltr">
          <li class="page-item">
            <a class="page-link" href="#">1</a>
          </li>
          <li class="page-item"><a class="page-link" href="#">2</a></li>
          <li class="page-item"><a class="page-link" href="#">3</a></li>
        </ul>
      </nav>
    </div>
    <div class="col-3"></div>
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
