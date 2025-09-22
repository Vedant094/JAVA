package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 11, 2025
 * Time    : 11:23:06 AM
 * Project : AdvancedJava
// Instance class to Update data in candidates table using PreparedStatement

 */

public class UpdateDemo {
	public static void main(String[] args) {
		Candidates c1=new Candidates();

		System.out.println("Update Candidate Details: ");
		try {
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}