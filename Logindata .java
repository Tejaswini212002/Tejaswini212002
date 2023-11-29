package user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Logindata extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
			String check="select * from userinfo where uname=? and pass=?";
			PreparedStatement pre=con.prepareStatement(check);
			pre.setString(1, uname);
			pre.setString(2, pass);
			ResultSet rs=pre.executeQuery();
			if(rs.next()) {
				pw.println("Login success");
				response.sendRedirect("Dashboard.jsp");
			}
			else {
				pw.println("Login error");
			}
		}
		catch(SQLException e) {
			pw.println("<h1>"+e.getMessage()+"</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
