package jdbcdemo;

import java.sql.*;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 10, 2025
 * Time    : 2:14:22 PM
 * Project : AdvancedJava

 */

public class SelectDemo {
	//Database credentials
	private static final String URL="jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER="root";
	private static final String PASSWORD="VEDANT@123";

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			//Step1: Load MySql JDBC driver (optional for JDBC 4.0+.but safer)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MYSQL Driver Loaded Successfully");

			//Step2: Establish Connection
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("Connected to Database Successfully");

			//Step3: Create Statement
			stmt=conn.createStatement();

			//Step4: Execute Query
			String sql="SELECT customerNumber,customerName,city,creditLimit FROM customers";
			rs=((java.sql.Statement) stmt).executeQuery(sql);

			System.out.println("------------Employee Records---------");

			//Step5: Process ResultSet
			while(rs.next()) {
				int id=rs.getInt("customerNumber");
				String name=rs.getString("customerName");
				String city=rs.getString(3);
				double credit=rs.getDouble(4);

				System.out.printf("CustomerId: %d | Customer Name: %s |City: %s | "+"CreditLimit: %.2f%n",id,name,city,credit);
			}
		}
		catch(Exception e) {
			System.out.println("Database Operation Failed.");
			e.printStackTrace();
		}
		finally {
			//Step6: Close resources manually
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Resources Closed.");
		}
	}
}
