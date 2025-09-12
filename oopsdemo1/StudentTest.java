package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 2, 2025
* Time    : 4:26:03 PM
* Project : CoreJava

*/
//Java program to implement object oriented programming
public class StudentTest {

	public static void main(String[] args) {
		//Create am object of student class
		Student s1=new Student();
		Student s2=new Student();
		
		//invoke methods of student class using dot operator
		
		s1.input();
		float tot=s1.calculate();
		s1.display();
		System.out.println("Total Displayed From Main: "+tot);
		
		//invoke methods of student class using dot operator
		s2.input();
		float tot1=s2.calculate();
		s2.display();
		System.out.println("Total Displayed from main: "+tot1);

	}

}
