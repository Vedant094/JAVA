package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//JDBC code to display the skills of the candidates
/**
* Author  : Vedant.Raturi
* Date    : Sep 10, 2025
* Time    : 4:12:37 PM
* Project : AdvancedJava

*/

public class JoinDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","VEDANT@123");
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select c.id,first_name,email ,name from candidates c INNER JOIN  "
					+ "candidate_skills s ON c.id=candidate_id  INNER JOIN  "
					+ "skills sk ON s.skill_id=sk.id;");

			while(rs.next())  {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+"  "+rs.getString(4));
			}
				 rs.close();
			     stmt.close();
			     con.close();
		}
		 catch(Exception e){ 
				System.out.println(e);
				}  


	}

}
