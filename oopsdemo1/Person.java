package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 2:14:59 PM
* Project : CoreJava

*/

public class Person {
	private String name,constituency;
	private int age;
	private Scanner sc;
	
	public Person() { //Generate a Implicit constructor
			System.out.println("Voter Eligibility App");
			age=0;
			name="";
			constituency="Bengaluru";
			sc=new Scanner(System.in);
	}
	//Constructor with 2 arguments
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		this.constituency="Mumbai";
	}

	//parameterized constructor 3 arguments
	public Person(String name, String constituency, int age) {
		this.name = name;
		this.constituency = constituency;
		this.age = age;
	}
	
	 void input()
		{
			System.out.println("Enter ur Name:");
			name=sc.nextLine();
			System.out.println("Enter ur Age:");
			age=sc.nextInt();
		}
		
		void print()
		{
			System.out.println("Name is :"+name);
			System.out.println("Age is :"+age);
			System.out.println("Constituency is :"+constituency);
		}
			
	
}
