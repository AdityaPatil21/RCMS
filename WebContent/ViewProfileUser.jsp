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
     <img src="assets/img/logo.jpg" height="100px;"> <a class="navbar-brand text-brand" href="Home.jsp">Road <span class="color-b">Complaint </span>Management</a>

      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">

          <li class="nav-item">
            <a class="nav-link active" href="UserHome.jsp">Home</a>
          </li>

          

            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span>Welcome<%response.setContentType("text/html");  
				 HttpSession sessio=request.getSession(true);  
	               if(session!=null){  
	               String name=(String)session.getAttribute("name");  
	                out.print(" "+name+""); }   %></span></a>
            <div class="dropdown-menu">
              <a class="dropdown-item " href="ViewProfileUser.jsp">View profile</a>
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



    <!-- ======= Services Section ======= -->
   <section class="section-news section-t8" style="background-color:#000;">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="title-wrap d-flex justify-content-center">
              <div class="title-box">
                <h4 class="title-a" style="color:#fff;">User Profile</h4>
              </div>
            </div>
          </div>
        <%
                     Connection con=DBConnection.getConnection();
                     Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select * from user");
                     //while(rs.next())
                     if(rs.next() == false) {
                    	%>
									<h4 style="text-align: right; margin-right: 70px">
										<b>No Users Present</b>
									</h4>
									<%
                     }
                    else{
                    	int count=0;
                    	do{	 
                    	 if(count == 0) {	
                    	 %>
			
    
         <center><div class="row gutters-sm">
            
            <div class="padding">
           <!--  <div class="container center_div"> -->
            <div class="col-md-8" align="center">
              <div class="card mb-3">
                <div class="card-body">
                  
                  <div class="row">
                    <div class="col-sm-3">
                      <label class="mb-0">Name</label>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <%response.setContentType("text/html");  
                      if(session!=null){  
	                String name=(String)session.getAttribute("name"); 	          
	                out.print(" "+name+""); }   %>
                    </div>
                  </div>
                  <hr>
                  
                  <div class="row">
                    <div class="col-sm-3">
                      <label class="mb-0">Address</label>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <%response.setContentType("text/html");  
                      if(session!=null){  
	                String address=(String)session.getAttribute("address"); 	          
	                out.print(" "+address+""); }   %>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <label class="mb-0">Mobile No</label>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <%response.setContentType("text/html");  
                      if(session!=null){  
	                String mobileno=(String)session.getAttribute("mobileno"); 	          
	                out.print(" "+mobileno+""); }   %>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <label class="mb-0">Date of Birth</label>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <%response.setContentType("text/html");  
                      if(session!=null){  
	                String dob=(String)session.getAttribute("dob"); 	          
	                out.print(" "+dob+""); }   %>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <label class="mb-0">Email</label>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <%response.setContentType("text/html");  
                      if(session!=null){  
	                String email=(String)session.getAttribute("email"); 	          
	                out.print(" "+email+""); }   %>
                    </div>
                  </div>
                  
                 
                </div>
              </div><%}%><%count++; }while(rs.next());}%>
</div>
             
              </div>
</div></center> 
        </div>
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