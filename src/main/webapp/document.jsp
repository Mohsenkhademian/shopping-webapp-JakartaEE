
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
  <script src="assets2/js/enter.js"></script>
  <link rel="stylesheet" href="assets2/css/homestyle.css"/>
  <link rel="stylesheet" href="assets2/css/registrationform.css"/>
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script> -->
  <title>مقالات</title>
</head>
<body>
<div class="container-fluid">
  <div class="row bg-dark p-4 navitm">
    <h5 class="titr text-light">به سایت فروشگاه لوازم خانگی خوش آمدید.</h5>
    <div class="col-2">
      <span class="logoitm" href="#">فروشگاه لوازم خانگی</span>
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
              <a class="nav-link" aria-current="page" href="homepage.jsp">صفحه اصلی</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="product.jsp">محصولات</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="document.jsp">مقالات</a>
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
          <a class="nav-link text-dark" href="signup.jsp"
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
  <div class="row me-3 p-5">
    <div class="col-12">
      <div class="row maghale">
        <div class="headtitle">
          <h1 class="me-5 pb-3">چگونه خانه خود را چیدمان کنیم؟</h1>
        </div>
        <div class="col-12 col-lg-6">
          <p>
            10 نکته کلیدی برای چیدمان بهتر منزل
            طراح های منزل از قانون خاصی پیروی نمی کنند و قانون های سختی وجود ندارد. ما باید خلاقیت، اکتشافات و تصورات را بالا ببریم. به گزارش نمناک نکاتی وجود دارد که ما را راهنمایی می کند که به نتیجه درستی برسیم.
            توصیه هایی کاربردی برای چیدمان منزل
            1. وسایل اضافه را در اتاق استراحت قرار دهید :خانه را زیاد با وسایل شلوغ نکنید و فضا برای مانور قرار دهید. این خبر خوبی است برای افرادی که می خواهند از بودجه کم استفاده کنند و لازم نیست همه ی فضاهای خانه را با وسایل پر کنید. بودجه را صرف وسایل زیاد نکنید بلکه صرف وسایل با کیفیت کنید.

            2. پوستر را در ارتفاع دست آویزان کنید :در گالری ها و موزه ها پوستر را در وسط و مرکز 57 اینچ تا 60 اینچ آویزان می کنند. (چشم متوسط انسانها سطح 57 اینچ می بیند.)

            3. چطور وسایل را با فرش تنظیم کنید:سه راه تنظیم وسایل با فرش وجود دارد. فرش به اندازه کافی بزرگ باشد که همه سطح زمین را فرا بگیرد، این باعث می شود که منزل اشرافی تر بنظر بیاید. می توانید 12 تا 18 اینچ سطح زمین را خالی بگذارید. اگر شما اتاق کوچکی دارید پهن کردن یک فرش بهترین انتخاب است تا پهن کردن قالیچه های کوچک. فقط پایه های جلویی صندلی ها را روی فرش قرار دهید.
          </p>
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d1.jpg" alt="">
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d4.jpg" alt="">

        </div>
        <div class="col-12 col-lg-6">
          <p>
            4. جلب توجه ایجاد کنید :جلب توجه شما می تواند یک هود زیبا در آشپزخانه باشد یا یک تکه هنری در اتاق نشیمن یا یک تابلو در اتاق خواب باشد. چیزهایی را انتخاب کنید که جلب توجه می کنند مثل :شومینه و چراغ چون با هم جلب توجه می کنند.

            5. سوی دید را در نظر بگیرید :جلب توجه از هر اتاق به اتاق دیگر متفاوت است. بهترین گزینه برای جلب توجه درست کردن ورودی خانه است چون هر شخصی در ابتدا ورودی منزل را تماشا میکنند.

            6. ویرایش وسایل :اگر وسایلتان با هم تطبیق ندارد از آن استفاده نکنید، آن را کنار بگذارید شاید جای دیگر به کار آمد، مثلا منزل خود را عوض کردید و به جای بزرگتر نقل مکان کردید.

            7. مقیاس متفاوت : وسیله ای که در مغازه خوب بنظر می آید ممکن است در منزل شما مثل فیلی در یک اتاق باشد یا ممکن است خیلی کوچک باشد.بنابر این مقیاس خیلی مهم است.

            نقطه کانونی اتاق و فضای خود را پیدا کنید. بسیاری از اتاق‌ها دارای کانون‌های داخلی هستند. برای مثال: یک پنجره بزرگ با یک منظره، یا یک شومینه. اگر اتاق شما یک مرکز کانونی داخلی نداشته باشد، می‌توان آن را ایجاد کرد. اگر می‌خواهید از یک اتاق برای مطالعه استفاده کنید، می‌توانید قفسه کتاب را نقطه کانونی خود در نظر بگیرید.
          </p>
        </div>
        <div class="col-12 col-lg-6">

          <p>
            به‌خصوص اتاق‌خواب است؛ که محل آرامش و آسایش شما پس از استرس‌ها و تنش‌های روزانه است.
            ترکیب رنگ سفید و خاکستری از دیگر ترکیب‌های محبوب و زیباست. می‌توان در چیدمان منزل رنگ دیوارها را سفید در نظر گرفته و مبلمان را خاکستری برگزید. این نوع ترکیب‌ بندی ظاهری مدرن به منزلتان می‌بخشد.
            رنگ‌بندی طوسی و آبی. دیوارها طوسی (میزان تیره و یا روشن آن را بسته به سلیقه و اثاثیه متفاوت است) با مبلمان آبی. می‌توانید از آبی کمرنگ و پررنگ هم‌زمان در رنگ ‌بندی مبلمان استفاده کنید. رنگ آبی را به‌راحتی می‌توان با دیگر رنگ‌ها نیز ترکیب کرد.
            نقطه کانونی اتاق و فضای خود را پیدا کنید. بسیاری از اتاق‌ها دارای کانون‌های داخلی هستند. برای مثال: یک پنجره بزرگ با یک منظره، یا یک شومینه. اگر اتاق شما یک مرکز کانونی داخلی نداشته باشد، می‌توان آن را ایجاد کرد. اگر می‌خواهید از یک اتاق برای مطالعه استفاده کنید، می‌توانید قفسه کتاب را نقطه کانونی خود در نظر بگیرید. همچنین می‌توانید مبلمان وجود داشته باشد.
          </p>
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d3.jpg" alt="">
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d2.jpg" alt="">

        </div>
        <div class="col-12 col-lg-6">
          <p>
            8. اضافه کردن لامپ :در آشپزخانه کابینت ها با چراغ هستند و همه ی چراغ ها در ساخت یکی نیستند و نور متفاوت دارند و همین چراغ ها جلب توجه زیادی می کنند.

            9. ایجاد درخشندگی با وسایل متناسب :بستگی به شخصیت شما دارد که از چه وسایلی برای آراستن استفاده کنید. هر چه بیشتر سعی کنید نتیجه بهتری هم می گیرید. هماهنگی وسایلی که با هم متناسب نیستند جلوه زیبایی به منزل نمی دهد، مثل:صندلی مربعی یا یک قفسه کتاب و یک لوستر بزرگ در یک اتاق منظم نتیجه خیلی رضایت بخشی ندارد.

            10. همه ی خلاقیت هایی که بر حسب علاقه است را کنار بگذارید: راهنما داشتن باعث یک شروع خوب میشود حتی اگر بعضی وسایل با فضا سازگار نباشد. چیدمان دکوراسیون به چیدمان مدرن معنی نمی شود، با یک راهنمای مناسب می توانید دکوراسیون زیبایی داشته باشید.
            رنگ سفید طیف گسترده‌ای از طراحان و طرفداران را شامل می‌شود. ترکیبات بسیار زیبا و جذابی در این دسته‌بندی را می‌توان یافت، ازجمله آبی و سفید، صورتی و سفید، بنفش و سفید، زرد و سفید و حتی ترکیب چند رنگ یا مبلمان طرح دار و رنگی با رنگ سفید.
            قهوه‌ای از دیگر رنگ‌های پرطرفدار است، که به دلیل تیره بودن، خصوصاً برای مبلمان انتخاب مناسبی است. همچنین از این رنگ در ترکیبات پرده نیز می‌توان استفاده کرد. کرم و قهوه‌ای کلاسیک‌ترین انتخاب‌ در اصول طراحی و چیدمان دکوراسیون منزل هستند. قهوه‌ای و زرد ترکیب هیجان‌انگیزی است که طرحی آنتیک به فضا القا می‌کند. حتی اگر تمایل به استفاده بیشش از حد رنگ قهوه‌ای ندارید، می‌توانید ریزه ‌کاری‌های دکور را به این رنگ بسپارید.
          </p>
        </div>
        <div class="col-12 col-lg-6">
          <p>
            رنگ آبی حس خونسردی و آرامش در انسان را تقویت می‌کند؛ بنابراین انتخاب بسیار مناسبی برای چیدمان منزل به‌خصوص اتاق‌خواب است؛ که محل آرامش و آسایش شما پس از استرس‌ها و تنش‌های روزانه است.
            ترکیب رنگ سفید و خاکستری از دیگر ترکیب‌های محبوب و زیباست. می‌توان در چیدمان منزل رنگ دیوارها را سفید در نظر گرفته و مبلمان را خاکستری برگزید. این نوع ترکیب‌ بندی ظاهری مدرن به منزلتان می‌بخشد.
            رنگ‌بندی طوسی و آبی. دیوارها طوسی (میزان تیره و یا روشن آن را بسته به سلیقه و اثاثیه متفاوت است) با مبلمان آبی. می‌توانید از آبی کمرنگ و پررنگ هم‌زمان در رنگ ‌بندی مبلمان استفاده کنید. رنگ آبی را به‌راحتی می‌توان با دیگر رنگ‌ها نیز ترکیب کرد.
            رنگ کرم و مشتقات آن از دیگر رنگ‌های محبوب اکثر خانه‌ها است؛ که انتخاب‌های فراوانی را برایمان به همراه می‌آورد. از ترکیبات مؤثر رنگ کرم می‌توان به دیوارهای کرم روشن و مبلمان و دکور سبز اشاره کرد. رنگ کرم به‌تنهایی نیز نمای خودش را دارد و با ترکیب‌های طلایی، از ترکیبات پر طرفدار است.

          </p>
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d5.jpg" alt="">
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d6.jpg" alt="">

        </div>

        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d7.jpg" alt="">
        </div>
        <div class="col-12 col-lg-6">
          <img src="assets2/css/pics/d3.jpg" alt="">

        </div>
        <div class="col-12 col-lg-6">
          <p>
            مطمئن شوید که تابلویی که بالای مبل خود آویز می‌کنید بیش از دوسوم اندازه مبل نباشد.
            یک فرش بزرگ کل سطح اتاق را می‌پوشاند، اما به یاد داشته باشید که باید فاصله ۱۲ تا ۱۸ سانتی‌متری از گوشه دیوارها خالی بماند.
            گاهی اوقات کم هم زیاد است. این موضوع در طراحی، فضای منفی نامیده می‌شود؛ که ناحیه‌ای است که توسط المان‌های زیادی اشغال شده باشد. اغلب این فضا، منطقه سفید در دیوارهاست. جاهایی که برای پر کردن وسوسه‌انگیز هستند و دوست داریم آن‌ها را با هرچیزی که دم دستمان است، پر کنیم.
            اصل سادگی و دوری از شلوغی بیش از حد را فراموش نکنید.
          </p>
        </div>
      </div>
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
<script src="assets2/js/enter.js"></script>
</body>
</html>
