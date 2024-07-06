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
            <a class="nav-link active" href="AuthorityHome.jsp">Home</a>
          </li>

          

            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span>Welcome<%response.setContentType("text/html");  
				 HttpSession sessio=request.getSession(true);  
	               if(session!=null){  
	               String name=(String)session.getAttribute("name");  
	                out.print(" "+name+""); }   %></span></a>
            <div class="dropdown-menu">
              <a class="dropdown-item " href="ViewProfileAuthority.jsp">View profile</a>
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
 <!-- ======= Services Section ======= -->
   <section class="section-news section-t8">
      <div class="container">
        
          <div class="col-md-12">
            <div class="title-wrap d-flex justify-content-center">
              <div class="title-box">
                <h4 class="title-a" style="color:#fff;">Add Reason</h4>
              </div>
            </div>
          </div>
        <div class="row">
        <div class="col-lg-6">
          <img src="assets/img/reason.jpg" height="250px;">
          </div>
          
        <div<%


                try{
                	
                String id=request.getParameter("id");
                	Connection con=DBConnection.getConnection();
                    Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select * from othercomplaint where id='"+id+"'"); 
                  /*  ResultSet rs=st.executeQuery("select * from addnewproduct"); */
                   /*  ResultSet rs=st.executeQuery("select addcategoryauction.id,addcategoryauction.categoryname,addsubcategoryauction.subcategoryname,addsessiondateauction.date,addsessiontimeauction.time,addcategoryauction.status from addcategoryauction inner join addsubcategoryauction on addcategoryauction.cat=addsubcategoryauction.cat inner join addsessiondateauction on addcategoryauction.cat=addsessiondateauction.cat inner join addsessiontimeauction on addcategoryauction.cat=addsessiontimeauction.cat");
                     */
                    //while(rs.next())
                    while(rs.next()) {
                   	%>
                   	 class="col-lg-6">      
           <form action="ReasonController" method="post" class="formone">
         
            <div class="form-group mt-1">
              <input type="text" name="reason" class="form-control" id="reason" placeholder="Enter Reason" required>
            </div>
         
            <div class="form-group mt-1">
              <input type="text" name="location" class="form-control" id="location" value="<%=rs.getString(4) %>" readonly>
            </div>
            <div class="form-group mt-1">
              <input type="text" name="description" class="form-control" id="description" value="<%=rs.getString(6) %>" readonly>
            </div>
            <div class="form-group mt-1">
              <input type="text" name="email" class="form-control" id="email" value="${email }" readonly>
            </div>
           
         
          <br>
       <div class="text-center"> 
          <div class="form-group mt-1">
                     <button type="submit" style="background-color:#2eca6a; height:40px; width:200px;">Submit</button>
                    </div>
                    
                  
       </div>
       
        </form>
          </div></center></div>
          <% 
               	}
            }catch(Exception e)
            {
            	
            	
            }
            %>
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