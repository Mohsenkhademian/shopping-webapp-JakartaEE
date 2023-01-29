<%@ page import="com.mhn.storewebappjakartaee.model.entity.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <!--Google analytics-->
    <!-- Google tag (gtag.js) -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=G-6YG8HKV40G"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'G-6YG8HKV40G');
    </script>
    <!--end-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/style.css" rel="stylesheet" type="text/css">
    <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="assets/fa/css/all.css" rel="stylesheet" type="text/css">
    <script src="assets/js/bootstrap.bundle.js" type="text/javascript"></script>
    <script src="assets/js/jquery-3.6.1.min.js" type="text/javascript"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <title>Table</title>
</head>
<body>
<nav class="navbar bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand navbar-txt">Company name</a>
        <form class="d-flex" role="search">
            <input class="form-control me-2 search-box" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success so-font" type="submit">Sign out</button>
        </form>
    </div>
</nav>
<div class="container-fluid">
    <div class="row main-row">
        <div class="col-2 col-menu">
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item-action item1">Dashboard</a>
                <a href="#" class="list-group-item list-group-item-action item2">Orders</a>
                <a href="#" class="list-group-item list-group-item-action item3">Products</a>
                <a href="#" class="list-group-item list-group-item-action item4">Customers</a>
                <a href="#" class="list-group-item list-group-item-action item5">Reports</a>
                <a href="#" class="list-group-item list-group-item-action item6">Intagiration</a>
                <span style="color:rgb(151, 151, 151); margin-left: 10px;">Saved reports</span>
                <a href="#" class="list-group-item list-group-item-action item7">Current month</a>
                <a href="#" class="list-group-item list-group-item-action item7">Last quarter</a>
                <a href="#" class="list-group-item list-group-item-action item7">Engagement</a>
                <a href="#" class="list-group-item list-group-item-action item7">Year-end sale</a>
            </div>
        </div>
        <div class="col-10 col-table">
            <div class="row dashboard-row align-items-center ">
                <div class="col-7">
                    <sapn class="dashboard db-font">Dashboard</sapn>
                </div>
                <div class="col-2 dashboard-col4">
                    <div class="d-flex justify-content-end">
                        <div class="p-2">
                            <div class="btn-group btn-group-sm" role="group" aria-label="Basic radio toggle button group">
                                <input type="radio" class="btn-check" name="btnradio" id="btnradio1" autocomplete="off" checked>
                                <label class="btn btn-outline-primary radio1" for="btnradio1">shock</label>
                                <input type="radio" class="btn-check" name="btnradio" id="btnradio2" autocomplete="off">
                                <label class="btn btn-outline-primary radio1" for="btnradio2">export</label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-2 dashboard-col4">
                    <div class="d-flex justify-content-end">
                        <div class="p-2">
                            <div class="btn-group btn-group-sm" role="group">
                                <button type="button" class="btn btn-primary dropdown-toggle drop1" data-bs-toggle="dropdown" aria-expanded="false">
                                    Dropdown
                                </button>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="#">Dropdown link</a></li>
                                    <li><a class="dropdown-item" href="#">Dropdown link</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
            <div class="row dashboard-row">
                <canvas id="myChart">
            </div>
            <div class="row section-title">
                <h2>Section title</h1>
            </div>
            <div class="table-responsive">
                <table class="table table-striped table-hover">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">First</th>
                        <th scope="col">Last</th>
                        <th scope="col">Handle</th>
                        <th scope="col">Header</th>
                        <th scope="col">Header</th>
                        <th scope="col">Header</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>
                            <a href="www.instagram.com"> Mark </a>
                        </td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">2</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">4</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">5</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">6</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">7</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">8</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">9</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">10</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">11</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">12</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">13</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">14</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">15</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">16</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    <tr>
                        <th scope="row">17</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>baby</td>
                        <td>words</td>
                        <td>out</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script src="assets/script.js"></script>
</body>
</html>
