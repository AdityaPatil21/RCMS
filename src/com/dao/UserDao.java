package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.Part;

import com.bean.UserBean;
import com.connection.DBConnection;

public class UserDao {
	
	Connection connection=null;
	Boolean resultStatus=Boolean.FALSE;
	PreparedStatement ps;
	ResultSet rs;
    Statement st=null;
    String sql;
    boolean flag = false;
    public ResultSet alreadyPlace() throws SQLException {
		String sql = "select * from tbl_res order by RAND() limit 1";
		connection = DBConnection.getConnection();
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		if (rs.next()) {
			resultStatus = true;
		}
		return rs;
	}
	public boolean InsertUserData(UserBean b) {
		sql = "insert into user(name,address,email,mobileno,dob,password,aadharno,status) values(?,?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			
			ps.setString(1, b.getName());
			ps.setString(2, b.getAddress());
			ps.setString(3, b.getEmail());
			ps.setString(4, b.getMobileno());
			ps.setString(5, b.getDob());
			ps.setString(6, b.getPassword());			
			ps.setString(7, b.getAadharno());
			ps.setString(8, b.getStatus());
			

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
	}

	public UserBean CheckUser(String email, String password) {
		UserBean bean=new UserBean();
		sql = "select * from user where email='" + email + "' and password='" + password + "' ";
		int flag = 0;
		try {
			Statement stmt = DBConnection.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				flag = 1;
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));					
				bean.setAddress(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setMobileno(rs.getString(5));
				bean.setDob(rs.getString(6));
				bean.setPassword(rs.getString(7));
				bean.setAadharno(rs.getString(8));
				bean.setStatus(rs.getString(9));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(flag ==1)
			return bean;
		else 
			return null;
	}

	public boolean DeleteUser(int id) {
		String sql="delete from user where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public boolean UpdateUserData(UserBean b) {
		sql = "update user set name = ?,address =?,email= ?,mobileno= ?,dob= ?,password= ? where id = ?";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			
			ps.setString(1, b.getName());
			ps.setString(2, b.getAddress());
			ps.setString(3, b.getEmail());
			ps.setString(4, b.getMobileno());
			ps.setString(5, b.getDob());
			ps.setString(6, b.getPassword());
			/*ps.setString(7, b.getStatus());*/
			ps.setInt(7, b.getId());
			

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
	}

	public boolean UpdateUserPassword(String oldpass, String newpass) {
    
		sql="update user set password=? where password='"+oldpass+"'";
		
		Connection con = DBConnection.getConnection();
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, newpass);
			
			int index=ps.executeUpdate();
			
			if(index>0)
			{
				flag=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}

	public String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		System.out.println("contentDisp:" + contentDisp);
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}

	public boolean AddRoadComplaint(UserBean b) {
		sql = "insert into roadcomplaint(image,imagename,location,pincode,description,email,status,result) values(?,?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			
			ps.setBlob(1, b.getImage());
			ps.setString(2, b.getImage_name());
			ps.setString(3, b.getLocation());
			ps.setString(4, b.getPincode());
			ps.setString(5, b.getDescription());
			ps.setString(6, b.getEmail());			
			ps.setString(7, b.getStatus());
			ps.setString(8, b.getResult());

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
	}

	public boolean AddStreetLightComplaint(UserBean b) {
		sql = "insert into streetlightcomplaint(image,imagename,location,pincode,description,email,status) values(?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			
			ps.setBlob(1, b.getImage());
			ps.setString(2, b.getImage_name());
			ps.setString(3, b.getLocation());
			ps.setString(4, b.getPincode());
			ps.setString(5, b.getDescription());
			ps.setString(6, b.getEmail());			
			ps.setString(7, b.getStatus());
			

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
	}

	public boolean AddPipelineComplaint(UserBean b) {
		sql = "insert into pipelinecomplaint(image,imagename,location,pincode,description,email,status) values(?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			
			ps.setBlob(1, b.getImage());
			ps.setString(2, b.getImage_name());
			ps.setString(3, b.getLocation());
			ps.setString(4, b.getPincode());
			ps.setString(5, b.getDescription());
			ps.setString(6, b.getEmail());			
			ps.setString(7, b.getStatus());
			

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
	}

	public boolean UpdateStreetLightStatus(int id, String status) {
		if(status.equalsIgnoreCase("Approve"))
			status="Pending";
		else if(status.equalsIgnoreCase("Reject"))
			status="Approve";
		else 
			status="Reject";
		
		String sql="update streetlightcomplaint set status=? where id=?";
		
		try {
			ps=DBConnection.getConnection().prepareStatement(sql);
			ps.setString(1, status);
			ps.setInt(2, id);
			
			int index=ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet SelectStreetLight() {
		ResultSet rs= null;
		String sql ="Select * from streetlightcomplaint";
		try {
			PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
			rs = pstmt.executeQuery();			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	
	}

	public boolean UpdatePipelineStatus(int id, String status) {
		if(status.equalsIgnoreCase("Approve"))
			status="Pending";
		else if(status.equalsIgnoreCase("Reject"))
			status="Approve";
		else 
			status="Reject";
		
		String sql="update pipelinecomplaint set status=? where id=?";
		
		try {
			ps=DBConnection.getConnection().prepareStatement(sql);
			ps.setString(1, status);
			ps.setInt(2, id);
			
			int index=ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet SelectPipeline() {
		ResultSet rs= null;
		String sql ="Select * from pipelinecomplaint";
		try {
			PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
			rs = pstmt.executeQuery();			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	
	}

	public boolean UpdateRoadStatus(int id, String status) {
		if(status.equalsIgnoreCase("Approve"))
			status="Pending";
		else if(status.equalsIgnoreCase("Reject"))
			status="Approve";
		else 
			status="Reject";
		
		String sql="update roadcomplaint set status=? where id=?";
		
		try {
			ps=DBConnection.getConnection().prepareStatement(sql);
			ps.setString(1, status);
			ps.setInt(2, id);
			
			int index=ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet SelectRoad() {
		ResultSet rs= null;
		String sql ="Select * from roadcomplaint";
		try {
			PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
			rs = pstmt.executeQuery();			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	
	}

	public boolean UpdateReasonStatus(int id, String status) {
		if(status.equalsIgnoreCase("Approve"))
			status="Pending";
		else if(status.equalsIgnoreCase("Reject"))
			status="Approve";
		else 
			status="Reject";
		
		String sql="update reason set status=? where id=?";
		
		try {
			ps=DBConnection.getConnection().prepareStatement(sql);
			ps.setString(1, status);
			ps.setInt(2, id);
			
			int index=ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}

	public ResultSet SelectReason() {
		ResultSet rs= null;
		String sql ="Select * from reason";
		try {
			PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
			rs = pstmt.executeQuery();			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}

	public boolean AddOtherComplaint(UserBean b) {
		sql = "insert into othercomplaint(image,imagename,location,pincode,description,email,status) values(?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			
			ps.setBlob(1, b.getImage());
			ps.setString(2, b.getImage_name());
			ps.setString(3, b.getLocation());
			ps.setString(4, b.getPincode());
			ps.setString(5, b.getDescription());
			ps.setString(6, b.getEmail());			
			ps.setString(7, b.getStatus());
			

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
		
	}

	public boolean InsertUserFeedbackData(UserBean b) {
		sql = "insert into feedback(name,address,email,feedback,feedbackagains,status) values(?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
						
			ps.setString(1, b.getName());
			ps.setString(2, b.getAddress());
			ps.setString(3, b.getEmail());
			ps.setString(4, b.getFeedback());
			ps.setString(5, b.getFeedbackagains());
			ps.setString(6, b.getStatus());
			

			int index = ps.executeUpdate();

			if (index > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
	}

	public boolean DeleteFeedback(int id) {
		String sql="delete from feedback where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	
	}

	
	}
	


