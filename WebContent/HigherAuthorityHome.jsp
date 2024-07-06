<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.connection.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Road Complaint Management</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: EstateAgency - v4.10.0
  * Template URL: https://bootstrapmade.com/real-estate-agency-bootstrap-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
  
 
</head>

<body>

   <!-- ======= Header/Navbar ======= -->
  <nav class="navbar navbar-default navbar-trans navbar-expand-lg fixed-top">
    <div class="container">
      <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#navbarDefault" aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <img src="assets/img/logo.jpg" height="100px;"><a class="navbar-brand text-brand" href="Home.jsp">Road <span class="color-b">Complaint </span>Management</a>

      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">

          <li class="nav-item">
            <a class="nav-link active" href="HigherAuthorityHome.jsp">Home</a>
          </li>
<li class="nav-item">
            <a class="nav-link active" href="ViewFeedback1.jsp">View Feedback</a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="ViewUsers.jsp">View Users</a>
          </li>

            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span>Welcome Higher Authority</span></a>
            <div class="dropdown-menu">
             <!--  <a class="dropdown-item " href="ViewProfileHigherAuthority.jsp">View profile</a> -->
              <a class="dropdown-item " href="LogoutController">Logout</a>
            </div>
          </li> 
          
         
         
        </ul>
      </div>

     <!--  <button type="button" class="btn btn-b-n navbar-toggle-box navbar-toggle-box-collapse" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01">
        <i class="bi bi-search"></i>
      </button>
 -->
    </div>
  </nav><!-- End Header/Navbar -->
<br><br>
  <!-- ======= Footer ======= -->
  <section class="section-footer">
    <div class="container">
      <div class="row">
    
        <div class="col-sm-12 col-md-4 section-md-t3">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">Services</h3>
            </div>
            <div class="w-body-a">
              <div class="w-body-a">
                <ul class="list-unstyled">
                  <li class="item-list-a">
                    <i class="bi bi-chevron-right"></i> <a href="ViewReasons.jsp">View Rejected complaints</a>
                  </li>
                 <!--  <li class="item-list-a">
                    <i class="bi bi-chevron-right"></i> <a href="#">Legal</a>
                  </li>
                  <li class="item-list-a">
                    <i class="bi bi-chevron-right"></i> <a href="#">Agent Admin</a>
                  </li>
                  <li class="item-list-a">
                    <i class="bi bi-chevron-right"></i> <a href="#">Careers</a>
                  </li>
                  <li class="item-list-a">
                    <i class="bi bi-chevron-right"></i> <a href="#">Affiliate</a>
                  </li>
                  <li class="item-list-a">
                    <i class="bi bi-chevron-right"></i> <a href="#">Privacy Policy</a>
                  </li> -->
                </ul>
              </div>
            </div>
          </div>
        </div>
        
      </div>
    </div>
  </section>

   

  <div id="preloader"></div>
  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>