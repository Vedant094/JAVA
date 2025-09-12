package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 11, 2025
* Time    : 12:06:55 PM
* Project : AdvancedJava

*/
class Skills
{
	Connection con;
	CallableStatement cstmt;
	ResultSet rs;
	
	int id;
	
	public Skills() throws Exception {
		con=ConnectionUtil.createConnection();
		
	}
	
	public void getSkils(int candidateId) throws Exception
	{
		//call SP with single param
		cstmt=con.prepareCall("{ call get_candidate_skill(?) }");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		// Check if the ResultSet is empty
	    if (!rs.next()) {
	        System.out.println("No Skills");
	    } else {
	        // If there is data, process it
	        do {
	            System.out.println(String.format("%s - %s",
	                    rs.getString("first_name") + " "
	                    + rs.getString("last_name"),
	                    rs.getString("skill")));
	        } while (rs.next());
	    }
		
		/*
		 * while (rs.next()) { System.out.println(String.format("%s - %s",
		 * rs.getString("first_name") + " " + rs.getString("last_name"),
		 * rs.getString("skill"))); }
		 */
		
		con.close();
}
}
public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			Skills s=new Skills();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Candidate Details to get Skills: ");
			System.out.println("Enter Candidate Id : ");
			int id=scan.nextInt();
			
			s.getSkils(id);
			scan.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
