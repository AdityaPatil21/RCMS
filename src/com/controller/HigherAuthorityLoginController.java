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
import com.bean.HigherAuthorityBean;
import com.dao.AuthorityDao;
import com.dao.HigherAuthorityDao;

/**
 * Servlet implementation class HigherAuthorityLoginController
 */
@WebServlet("/HigherAuthorityLoginController")
public class HigherAuthorityLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HigherAuthorityLoginController() {
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
		
		HigherAuthorityDao dao=new HigherAuthorityDao();
		//UserBean user;// = new UserBean();
		HigherAuthorityBean admin=dao.CheckHigherAuthority(email, password);
		
		if(admin == null) {
			out.println("<script type=\"text/javascript\">");
			 out.println("alert('No Such User Present...')");
			 out.println("location='HigherAuthorityRegistration.jsp';");
			 out.println("</script>");
		}
		else if((admin.getEmail()!=null && admin.getEmail()!="") && (admin.getPassword()!=null && admin.getPassword()!=""))
		{
			if(admin.getStatus().equals("Active"))
			{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Login Successful')");
			out.println("location='HigherAuthorityHome.jsp';");
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
				out.println("location='HigherAuthorityLogin.jsp';");
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
