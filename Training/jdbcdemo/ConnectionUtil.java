package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 11, 2025
 * Time    : 9:40:40 AM
 * Project : AdvancedJava

 */
//Utility class to create connection with MYSQL database
public class ConnectionUtil {
	
	public static Connection createConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","VEDANT@123");
		return con;
		
	}
}
