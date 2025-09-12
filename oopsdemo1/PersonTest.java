package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 2:22:19 PM
* Project : CoreJava

*/

public class PersonTest {

	public static void main(String[] args) {
		Person objPerson1=new Person(); //Invoke implicit constructor
		
		objPerson1.input();
		objPerson1.print();
		
		System.out.println("-----------------------------");
		Person objPerson2=new Person("Mike",45); //invoke constructor with 2 arguments
				
		objPerson2.print();
		
		System.out.println("-----------------------------");
		Person objPerson3=new Person("Navin","Chennai",45); //invoke constructor with 3 arguments
		
		objPerson3.print();
		
		System.out.println("-----------------------------");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name, Constituency & Age: ");
		String name=s.next();
		String c=s.next();
		int a=s.nextInt();
		
		Person objPerson4=new Person(name,c,a);
		objPerson4.print();
		
		

	}

}
