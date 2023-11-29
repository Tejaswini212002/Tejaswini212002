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
import java.sql.SQLException;


public class Deleteservice extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String sno=request.getParameter("sno");
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
			String insert="delete from serviceinfo where cno=?";
			PreparedStatement pre=con.prepareStatement(insert);
			pre.setString(1, sno);
			pre.executeUpdate();
			response.sendRedirect("View.jsp");
		}
		catch(SQLException e) {
			pw.println(e);
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
