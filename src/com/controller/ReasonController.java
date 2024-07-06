package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AuthorityBean;
import com.dao.AuthorityDao;

/**
 * Servlet implementation class ReasonController
 */
@WebServlet("/ReasonController")
public class ReasonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReasonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String reason = request.getParameter("reason");		
		String location = request.getParameter("location");	
		String description = request.getParameter("description");
		String email = request.getParameter("email");		
		String status = "Pending";

		AuthorityBean b = new AuthorityBean();
		
		b.setReason(reason);
		b.setLocation(location);
		b.setDescription(description);
		b.setEmail(email);
		b.setStatus(status);

		AuthorityDao dao = new AuthorityDao();

		if (dao.AddReason(b)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Reason added successfully')");
			out.println("location='Reason.jsp';");
			out.println("</script>");
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('UnSuccessful')");
			out.println("location='Reason.jsp';");
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
