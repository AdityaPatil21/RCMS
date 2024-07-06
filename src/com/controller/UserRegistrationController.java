package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bean.UserBean;
import com.dao.UserDao;

/**
 * Servlet implementation class UserRegistrationController
 */
/*@MultipartConfig*/
@WebServlet("/UserRegistrationController")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*InputStream image=null;		
	String imageName="";
	String path=null;
	File upload=null; 
  */
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");		
		String address = request.getParameter("address");		
		String email = request.getParameter("email");
		String mobileno = request.getParameter("mobileno");
		String dob = request.getParameter("dob");		
		String password = request.getParameter("password");	
		String aadharno = request.getParameter("aadharno");
		/*String seque = request.getParameter("seque");
		String answer = request.getParameter("answer");*/
		String status = "Active";

		UserBean b = new UserBean();
       
        UserDao dao = new UserDao();

		

		b.setName(name);		
		b.setAddress(address);
		b.setEmail(email);
		b.setMobileno(mobileno);		
		b.setDob(dob);
		b.setPassword(password);
		b.setAadharno(aadharno);
		b.setStatus(status);

		
		if (dao.InsertUserData(b)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Registration Successful')");
			out.println("location='UserLogin.jsp';");
			out.println("</script>");
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Registration UnSuccessful')");
			out.println("location='UserRegister.jsp';");
			out.println("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
