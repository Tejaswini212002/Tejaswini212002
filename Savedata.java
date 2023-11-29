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


public class Savedata extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("name");
			String uname=request.getParameter("username");
			String email=request.getParameter("email");
			String mobile=request.getParameter("mobile");
			String pass=request.getParameter("password");
			
			pw.println(name+" "+uname+" "+email+" "+mobile+" "+pass);
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
				String check="select * from userinfo where uname=?";
				PreparedStatement pre=con.prepareStatement(check);
				pre.setString(1, uname);
				ResultSet rs=pre.executeQuery();
				if(rs.next()) {
					pw.println("<h1>User already exist</h1>");
				}
				else {
					String insert="insert into userinfo(name,uname,email,mobile,pass) values(?,?,?,?,?)";
					PreparedStatement i_pre=con.prepareStatement(insert);
					i_pre.setString(1, name);
					i_pre.setString(2, uname);
					i_pre.setString(3, email);
					i_pre.setString(4, mobile);
					i_pre.setString(5, pass);
					i_pre.executeUpdate();
					pw.println("signup success ");
					response.sendRedirect("Login.jsp");
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
