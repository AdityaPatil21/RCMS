package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

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
 * Servlet implementation class RoadComplaintCon
 */
@MultipartConfig
@WebServlet("/RoadComplaintCon")
public class RoadComplaintCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
	InputStream image=null;		
	String imageName="";
	String path=null;
	File upload=null; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoadComplaintCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String location = request.getParameter("location");			
		String pincode = request.getParameter("pincode");			
		String description = request.getParameter("description");
		String email = request.getParameter("email");
		String status = "Pending";
		UserBean b = new UserBean();
	
		UserDao dao=new UserDao();
		String result=null;
		ResultSet rs;
		try {
			rs = dao.alreadyPlace();
			result=rs.getString(2);
			System.out.println(result);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		Part part=request.getPart("file");
		
		if(part!=null)
		{
			image=part.getInputStream();
			System.out.println("is size:"+image.available());
			
			imageName=dao.extractFileName(part);
			System.out.println("name:"+imageName);
		}
		

		
		b.setLocation(location);
		b.setPincode(pincode);
		b.setDescription(description);
        b.setEmail(email);		
		b.setStatus(status);
		b.setImage(image);		
		b.setImage_name(imageName);
		b.setResult(result);
		
		if (dao.AddRoadComplaint(b)) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Compaint submitted successfully')");
			out.println("location='RoadComplaint.jsp';");
			out.println("</script>");
		} else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Not send..Try Again')");
			out.println("location='RoadComplaint.jsp';");
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