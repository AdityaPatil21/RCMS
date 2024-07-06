package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.AuthorityBean;
import com.dao.AuthorityDao;

/**
 * Servlet implementation class AdminLoginController
 */
@WebServlet("/AuthorityLoginController")
public class AuthorityLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorityLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		AuthorityDao dao=new AuthorityDao();
		//UserBean user;// = new UserBean();
		AuthorityBean admin=dao.CheckAuthority(email, password);
		
		if(admin == null) {
			out.println("<script type=\"text/javascript\">");
			 out.println("alert('No Such User Present...')");
			 out.println("location='AuthorityRegistration.jsp';");
			 out.println("</script>");
		}
		else if((admin.getEmail()!=null && admin.getEmail()!="") && (admin.getPassword()!=null && admin.getPassword()!=""))
		{
			if(admin.getStatus().equals("Active"))
			{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Login Successful')");
			out.println("location='AuthorityHome.jsp';");
			out.println("</script>");
			out.print("welcome"+email);
			HttpSession session=request.getSession();  
	        session.setAttribute("email",admin.getEmail());  
	        session.setAttribute("name", admin.getName());
	        session.setAttribute("id", admin.getId());
	        session.setAttribute("address", admin.getAddress());
	        session.setAttribute("dob", admin.getDob());
	        session.setAttribute("mobileno", admin.getMobileno());
		    }
			else {
				request.setAttribute("ErrMsg", "Wait for activation of your account!...");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Wait For Activation')");
				out.println("location='AuthorityLogin.jsp';");
				out.println("</script>");
			}
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
