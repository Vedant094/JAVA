package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 12:31:05 PM
* Project : CoreJava

*/

public class ComplexTest {

	public static void main(String[] args) {
		Complex obj1=new Complex(4, 2);
		Complex obj2=new Complex(2, 8);
		Complex obj3=new Complex(12, 9);
		
		obj1.add(obj2); //calls method add() by passing object obj2
		System.out.println("The additiom of 2 Complex Numbers: ");
		obj1.display();
		
		
		obj1.add(obj3);
		System.out.println("The additiom of 2 Complex Numbers: ");
		obj1.display();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter real and imaginary part of a complex number: ");
		double r=s.nextDouble();
		double i=s.nextDouble();
		
		Complex c4=new Complex(r, i);
		
		obj2.add(c4); //c2+c4
		System.out.println("The additiom of 2 Complex Numbers: ");
		obj2.display();
	}

}
