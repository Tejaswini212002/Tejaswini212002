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

 
public class Updateservice extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String sno=request.getParameter("sno");
		String make=request.getParameter("make");
		String model=request.getParameter("model");
		String year=request.getParameter("year");
		String color=request.getParameter("color");
		String cnum=request.getParameter("cnum");
		String pdate=request.getParameter("pdate");
		String service=request.getParameter("service");
		pw.println(sno+" "+make+" "+model+" "+year+" "+color+" "+cnum+" "+pdate+" "+service  );
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
			String insert="update serviceinfo set make=?,model=?,year=?,color=?,cnum=?,pdate=?,service=? where cno=?";
			PreparedStatement pre=con.prepareStatement(insert);
			pre.setString(1, make);
			pre.setString(2, model);
			pre.setString(3, year);
			pre.setString(4, color);
			pre.setString(5, cnum);
			pre.setString(6, pdate);
			pre.setString(7, service);
			pre.setString(8, sno);
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
