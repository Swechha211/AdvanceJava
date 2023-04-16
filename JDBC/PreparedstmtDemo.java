package com.jdvc;
import java.sql.*;

public class PreparedstmtDemo {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/student";
		 String uname = "root";
		 String pass = "MySQL123#";
		 String query = "INSERT INTO STUDENT (id,name) VALUES (?,?) ";
		
		//load and register driver 
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //create connection
		 Connection con = DriverManager.getConnection(url, uname, pass);
		 
		 //create statement
		 PreparedStatement st = con.prepareStatement(query);
		 
		 //set parameters
		 st.setInt(1, 3);
		 st.setString(2, "Ram");
		 int result = st.executeUpdate();
		 
		 if(result > 0)
			 System.out.println("successfully inserted");
		 else
			 System.out.println("Unsuccessful");
		 
		
		 
		 //close the connection
		 st.close();
		 con.close();
		
	}

}
