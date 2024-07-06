package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

/**
 * Servlet implementation class AddFeedbackController
 */
@WebServlet("/AddFeedbackController")
public class AddFeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFeedbackController() {
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
		String feedback = request.getParameter("feedback");
		String feedbackagains = request.getParameter("feedbackagains");
		String status = "Active";

		UserBean b = new UserBean();
       
        UserDao dao = new UserDao();

		

		b.setName(name);		
		b.setAddress(address);
		b.setEmail(email);
		b.setFeedback(feedback);
		b.setFeedbackagains(feedbackagains);
		b.setStatus(status);

		
		if (dao.InsertUserFeedbackData(b)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Feedback submitted successfully')");
			out.println("location='UserHome.jsp';");
			out.println("</script>");
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('UnSuccessful')");
			out.println("location='AddFeedback.jsp';");
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
