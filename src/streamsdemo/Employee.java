package streamsdemo;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 12, 2025
 * Time    : 10:57:48 AM
 * Project : AdvancedJava

 */

public class Employee {
	private int salary;
	private String name;
	
	
	
	public Employee(String name,int salary) {
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
