package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 2, 2025
* Time    : 4:42:11 PM
* Project : CoreJava

*/
//main class to test Employee class methods
public class CoforgeEmployeeTest {

	public static void main(String[] args) {
		// create objects e1,e2,e3 of Employee Class
		Employee developer=new Employee();
		Employee tester=new Employee();
		Employee sales=new Employee();
		
		
		System.out.println("******Coforge Technologies******");
		//invoke Methods(Method call)
		developer.inputEmployeeDetails();
		developer.calculateNetSalary();
		developer.displayEmployeeDetails();
		
		tester.inputEmployeeDetails();
		tester.calculateNetSalary();
		tester.displayEmployeeDetails();
		
		sales.inputEmployeeDetails();
		sales.calculateNetSalary();
		sales.displayEmployeeDetails();

	}

}
