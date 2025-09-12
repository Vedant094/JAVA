package oopsdemo4;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 6, 2025
 * Time    : 9:48:40 AM
 * Project : CoreJava

 */

public interface Shape {
	//implicitly public, static and final - constant
	public String LABEL="Shape";

	//interface methods are implicitly abstract and public
	void draw();

	public abstract double getArea();
}
