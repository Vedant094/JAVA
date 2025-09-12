package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author  : Vedant.Raturi
* Date    : Sep 10, 2025
* Time    : 3:34:18 PM
* Project : AdvancedJava

*/

public class SelectDemo3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","VEDANT@123");
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("SELECT id,first_name,dob,phone,email from candidates");
			
			
			while(rs.next())
			{
				// Retrieve data by column name or index
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDate(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
			con.close();

		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}


	}

}
