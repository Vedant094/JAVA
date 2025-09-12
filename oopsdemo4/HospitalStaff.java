package oopsdemo4;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 5, 2025
 * Time    : 4:10:00 PM
 * Project : CoreJava

 */

public abstract class HospitalStaff {
	private String name;
	private String id;
	private String department;


	public HospitalStaff(String name, String id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	//Abstract method - must be implemented by subclass
	public abstract void performDuties();

	// Concrete method - shared by all subclasses
	public void attendMeeting() {
		System.out.println(name + " is attending a hospital meeting.");
	}
	
	//Generate Getters
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}




}
