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
            <a class="nav-link" href="HigherAuthorityHome.jsp">Home</a>
          </li>

           
            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span>Welcome Higher Authority</span></a>
            <div class="dropdown-menu">
            <!--   <a class="dropdown-item " href="ViewProfileHigherAuthority.jsp">View profile</a> -->
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
        <div class="row">
          <div class="col-md-12">
            <div class="title-wrap d-flex justify-content-center">
              <div class="title-box">
                <h5 class="title-a" style= color:#000;">View Rejected Complaint Reasons</h5>
              </div>
            </div>
          </div>
      
     
				<div class="row">
					<div class="col-md-12">
					
						<!-- <div class="col-sm-offset-2 col-lg-6 "> -->
						 <form class="subscription-form">
                    <div style="margin-left:20px;margin-right:20px">
                    
                    <table class="table table-bordered table-dark" style="color:black" align="center">
                    
                     <%
                     Connection con=DBConnection.getConnection();
                     Statement st=con.createStatement();
                      ResultSet rs=st.executeQuery("select * from reason"); 
                     /* ResultSet rs=st.executeQuery("select reason.id,user.name,reason.location,reason.description, reason.status from reason inner join user on reason.email=user.email");
                      */
                     //while(rs.next())
                     if(rs.next() == false) {
                    	%>
                    	<h4 style="text-align:right;margin-right:70px"><b>No Users Present</b></h4>
                    	<%
                     }
                    else{
                    	int count=0;
                    	do{	 
                    	 if(count == 0) {	
                    	 %>
                    	 <tr  class="danger" style="color:white" align="center">
		                  
		                    
		                    <th>Location</th>
		                     <th>Description</th>
		                     <th>Reason</th>
		                    <!--  <th>email</th>	 -->	                    
		                     <th>Status</th>
		                    <!--  <th>Action</th> -->
		                  </tr>
		                  <%}%>
                    	 <TR align="center">
                    	<%-- <td><img alt="Profile Pic" class="img-circle" src="Profilepic.jsp?id=<%=rs.getInt(1) %>"  width="100px" height="80px"/></td>
                    	  --%>
                    	
                    	 <td style="color:white"><%=rs.getString(3) %></td> 
                    	<td style="color:white"><%=rs.getString(4) %></td>
                    	 <td style="color:white"><%=rs.getString(2) %></td>
                    	 
                    	  <th><a style="color:gold;" href="UpdateReasonController?id=<%=rs.getInt(1)%>&status=<%=rs.getString(6)%>"><%=rs.getString(6)%></a></th>
                    	<%--  <td><a style="color:red;" href="DeleteUserCon?id=<%=rs.getInt(1)%>"><b>Delete</b></a></td> --%>
                    	 </TR>                    	 
                    <%count++; }while(rs.next());}%> 
                   
                    </table>     
                  </form>
						
			          
			      			
			      		</div>
			      	</div>
		      	</div>
	      
     
</div>
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