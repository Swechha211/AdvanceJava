package com.jdvc;
import java.sql.*;
public class RestaurantDb {
	public static void main(String[] args)	throws Exception{

		String url = "jdbc:mysql://localhost:3306/hotel";
		String uname = "root";
		String pass = "MySQL123#";
		String query = "INSERT INTO RESTAURANT(res_name, res_category) values('Moktan Restaurant','Fast Food') ";
		String query1 = "INSERT INTO RESTAURANT(res_name, res_category) values(?,?) ";
		String query2 = "SELECT * FROM RESTAURANT";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		
		int  result = st.executeUpdate(query);
		
		if(result>0)
		{
			System.out.println("successfully inserted");
		}
		else{
			System.out.println("Insertion Failed");
		}
		
		
PreparedStatement st1 = con.prepareStatement(query1);
		
		st1.setString(1,"BajraBarahi Restaurant");
		st1.setString(2, "Casual Dinning");
		
		int result1 = st1.executeUpdate();
		
		if(result1>0)
		{
			System.out.println("successfully inserted");
		}
		else{
			System.out.println("Insertion Failed");
		}
		
		Statement st2 = con.createStatement();
		ResultSet rs = st2.executeQuery(query2);
		while(rs.next()){
		int res_id = rs.getInt("res_id");
		String res_name = rs.getString("res_name");
		String res_category = rs.getString("res_category");
	
	System.out.println(res_id+" "+res_name+" "+res_category);
		}
		
		st.close();
		con.close();
	}

}
