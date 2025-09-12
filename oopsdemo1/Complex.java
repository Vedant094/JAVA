package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 12:24:17 PM
* Project : CoreJava
Program to add 2 complex numbers- Real & Imaginary part
*/

public class Complex {
	private double real;
	private double imaginary;
	
	
	// Generate Constructor using fields
	public Complex(double real, double imaginary) {//parameterized constructor
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void add(Complex obj) {//method which accepts object as an argument
		// c1.real+=c2.real
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;	
	}
	
	
	 public void display()
		{
			System.out.println("r"+this.real+" + i"+this.imaginary);
		}
	
}
