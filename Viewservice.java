package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Viewservice {
	public static List data() {
		List ulist=new ArrayList();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservice","root","root");
			
			String sql = "SELECT * FROM serviceinfo";
			PreparedStatement pre = con.prepareStatement(sql);
			ResultSet rs=pre.executeQuery();
			while(rs.next()) {
				String temp=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getString(6)+":"+rs.getString(7)+":"+rs.getString(8)+":"+rs.getString(9);
				ulist.add(temp);
			}
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	
		return ulist;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
