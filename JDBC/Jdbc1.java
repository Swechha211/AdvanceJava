package com.jdvc;
import java.sql.*;

public class Jdbc1 {
	public static void main(String[] args) throws Exception {
		 String url = "jdbc:mysql://localhost:3306/student";
		 String uname = "root";
		 String pass = "MySQL123#";
		 String query = "SELECT * FROM STUDENT where id = 1 ";
		
		//load and register driver 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //create connection
		 Connection con = DriverManager.getConnection(url, uname, pass);
		 
		 //create statement
		 Statement st = con.createStatement();
		 
		 //execute query and store the table structure data in ResultSet
		 ResultSet rs = st.executeQuery(query);
		 
		 rs.next(); //take pointer to next record
		 
		 //process the result
		 String name = rs.getString("name");
		 
		 System.out.println(name);
		 
		 //close the connection
		 st.close();
		 con.close();
		 
		 
		 
	}
	

}
