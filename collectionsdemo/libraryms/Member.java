package collectionsdemo.libraryms;

import java.util.Objects;

/**
* Author  : Vedant.Raturi
* Date    : Sep 9, 2025
* Time    : 2:15:37 PM
* Project : CoreJava

*/

public class Member {
	private int id;
    private String name;
    private String email;
    private String phoneNumber;
    
    //Constructors	
	public Member(int id, String name, String email, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	//Getters
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	//toString
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phoneNumber);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	
    
    
    
}
