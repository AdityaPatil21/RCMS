<!DOCTYPE html>
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
            <a class="nav-link active" href="Home.jsp">Home</a>
          </li>

          <li class="nav-item">
            <a class="nav-link" href="AboutUs.jsp">About Us</a>
          </li>
          

          <li class="nav-item">
            <a class="nav-link " href="UserLogin.jsp">User</a>
          </li>

          <li class="nav-item">
            <a class="nav-link " href="AuthorityLogin.jsp">Authority</a>
          </li>

         <!--  <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
            <div class="dropdown-menu">
              <a class="dropdown-item " href="property-single.html">Property Single</a>
              <a class="dropdown-item " href="blog-single.html">Blog Single</a>
              <a class="dropdown-item " href="agents-grid.html">Agents Grid</a>
              <a class="dropdown-item " href="agent-single.html">Agent Single</a>
            </div>
          </li> -->
          <li class="nav-item">
            <a class="nav-link " href="HigherAuthorityLogin.jsp">Higher Authority</a>
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
    <!-- ======= Services Section ======= -->
   <section class="section-news section-t8" >
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="title-wrap d-flex justify-content-center">
              <div class="title-box">
                <h4 class="title-a" style="color:#000;">Higher Authority Login</h4>
              </div>
            </div>
          </div>
        
       <div class="col-lg-6">
          <img src="assets/img/login.jpg" height="350px;">
          </div>   
        <div class="col-lg-6">      
           <form action="HigherAuthorityLoginController" method="post" class="formone">
    
            <div class="form-group mt-1">
            <label><b>Email</b></label>
              <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required>
            </div>
            <div class="form-group mt-1">
            <label><b>Password</b></label>
              <input type="password" name="password" class="form-control" id="password" placeholder="Your password" required>
            </div>
            
         
          <br>
       <div class="text-center"> 
          <div class="form-group mt-1">
                     <button type="submit" style="background-color:#2eca6a; height:40px; width:200px;">Login</button>
                    </div><br>
                  <!--   <a href="HighterAuthorityRegistration.jsp" style="color:red">Register here!!!</a> -->
       </div>
        </form>
          </div></div>
        <br>
      </div>
    </section><!-- End Services Section -->


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