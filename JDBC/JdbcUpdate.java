package com.jdvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/student";
		 String uname = "root";
		 String pass = "MySQL123#";
		 String query = "UPDATE STUDENT set name = 'Hari' where id = 1";
		
		//load and register driver 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //create connection
		 Connection con = DriverManager.getConnection(url, uname, pass);
		 
		 //create statement
		 Statement st = con.createStatement();
		 
		 int result = st.executeUpdate(query);
		 if(result > 0)
			 System.out.println("Successfully updated");
		 else
			 System.out.println("Unsuccessful");
		
		 //close the connection
		 st.close();
		 con.close();
	}

}
