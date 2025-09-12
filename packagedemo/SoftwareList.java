package packagedemo;

import com.coforge.training.microsoftproj.OperatingSystem;
import com.coforge.training.oracleproj.Database;

/**
* Author  : Vedant.Raturi
* Date    : Sep 8, 2025
* Time    : 10:37:10 AM
* Project : CoreJava

*/

public class SoftwareList {

	public static void main(String[] args) {
		OperatingSystem op1=new OperatingSystem();
		Database db1=new Database();
		
		System.out.println("************List of Operating System From Microsoft**********");
		op1.listSoftware();//invoke method from other user defined package
		System.out.println("-----------------");
		
		System.out.println("***********List of Databases from Oracle*********");
		db1.printSoftware();

	}

}
