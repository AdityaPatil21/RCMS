package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.HigherAuthorityBean;
import com.dao.HigherAuthorityDao;


/**
 * Servlet implementation class HigherAuthorityRegistrationController
 */
@WebServlet("/HigherAuthorityRegistrationController")
public class HigherAuthorityRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HigherAuthorityRegistrationController() {
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
		String status = "Active";

		HigherAuthorityBean b = new HigherAuthorityBean();
		

		b.setName(name);		
		b.setAddress(address);
		b.setEmail(email);
		b.setMobileno(mobileno);		
		b.setDob(dob);
		b.setPassword(password);
		b.setStatus(status);

		HigherAuthorityDao dao = new HigherAuthorityDao();

		if (dao.InsertHigherAuthorityData(b)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Registration Successful')");
			out.println("location='HigherAuthorityLogin.jsp';");
			out.println("</script>");
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Registration UnSuccessful')");
			out.println("location='HighterAuthorityRegistration.jsp';");
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
