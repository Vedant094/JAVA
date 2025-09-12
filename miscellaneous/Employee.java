package miscellaneous;

import java.util.Objects;

/**
* Author  : Vedant.Raturi
* Date    : Sep 8, 2025
* Time    : 2:53:32 PM
* Project : CoreJava

*/

public class Employee implements Cloneable  {
		
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
