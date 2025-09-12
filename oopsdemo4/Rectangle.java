package oopsdemo4;

/**
* Author  : Vedant.Raturi
* Date    : Sep 6, 2025
* Time    : 9:57:52 AM
* Project : CoreJava

*/

public class Rectangle implements Shape{
	private double width;
	private double height;
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	public void draw() {
		System.out.println("Drawing Reactangle");
		
	}


	@Override
	public double getArea() {
		return this.height*this.width;
	}
	
	
	
	
	
}
