package com.jdvc;

import java.sql.*;

public class JdbcInsert {
	public static void main(String[] args) throws Exception{
		 String url = "jdbc:mysql://localhost:3306/student";
		 String uname = "root";
		 String pass = "MySQL123#";
		 String query = "INSERT INTO STUDENT(id, name) VALUES (2,'Sita')";
		
		//load and register driver 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //create connection
		 Connection con = DriverManager.getConnection(url, uname, pass);
		 
		 //create statement
		 Statement st = con.createStatement();
		 
		 int result = st.executeUpdate(query);
		 if(result > 0)
			 System.out.println("Successfully inserted");
		 else
			 System.out.println("Unsuccessful");
		
		 //close the connection
		 st.close();
		 con.close();
		 
	}

}
