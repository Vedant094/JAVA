package oopsdemo4;

import java.util.Scanner;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 5, 2025
 * Time    : 4:39:34 PM
 * Project : CoreJava

 */

public class MyCalculator implements IMath{
	Scanner kb;
	
	
	@Override
	public void add() {
		kb = new Scanner(System.in);
		System.out.println("Enter any two integer values to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);
	}

	@Override
	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Subtraction");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("SUbtraction of "+a+" and "+b+" is "+s);
	}

	@Override
	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform Multiplication");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Mul of "+a+" and "+b+" is "+s);
	}

	@Override
	public void div() {
		 kb = new Scanner(System.in);
	        System.out.println("Enter any two integer values to perform Division");
	        int a=kb.nextInt();
	        int b=kb.nextInt();
	        int s=a/b;
	        System.out.println("Div of "+a+" and "+b+" is "+s);
	}
	void display()
	{
		System.out.println("My Calculator - Designed by V");
	}
	
	public static void main(String[] args) {
		MyCalculator c1=new MyCalculator();
		
		c1.display();
		System.out.println("Add Func: ");
		c1.add();
		System.out.println("Sub Func: ");
		c1.sub();
		System.out.println("Mul Func: ");
		c1.mul();
		System.out.println("Div Func: ");
		c1.div();
	}

}
