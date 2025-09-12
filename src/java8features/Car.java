package java8features;

/**
* Author  : Vedant.Raturi
* Date    : Sep 11, 2025
* Time    : 3:40:00 PM
* Project : AdvancedJava

*/

public class Car implements Vehicle {
	private String brand;

	public Car(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is Speeding up!!!";
	}

	@Override
	public String slowDown() {
		return "Car is Slowing down!!!";
	}
	
	
}
