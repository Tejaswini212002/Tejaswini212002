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


public class Saveservice extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String cname=request.getParameter("cname");
		String make=request.getParameter("make");
		String model=request.getParameter("model");
		String year=request.getParameter("year");
		String color=request.getParameter("color");
		String cnum=request.getParameter("cnum");
		String pdate=request.getParameter("pdate");
		String service=request.getParameter("service");
		pw.println(cname+" "+make+" "+model+" "+year+" "+color+" "+cnum+" "+pdate+" "+service  );
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
			String insert="insert into serviceinfo(cname,make,model,year,color,cnum,pdate,service) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pre=con.prepareStatement(insert);
			pre.setString(1, cname);
			pre.setString(2, make);
			pre.setString(3, model);
			pre.setString(4, year);
			pre.setString(5, color);
			pre.setString(6, cnum);
			pre.setString(7, pdate);
			pre.setString(8, service);
			pre.executeUpdate();
			response.sendRedirect("Dashboard.jsp");
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
