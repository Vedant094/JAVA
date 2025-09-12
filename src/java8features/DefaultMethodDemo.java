package java8features;

/**
* Author  : Vedant.Raturi
* Date    : Sep 11, 2025
* Time    : 3:38:32 PM
* Project : AdvancedJava

*/

public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle car=new Car("BMW");
		
		//invoke overriden methods
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		
		//invoke default methods
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		
		//invoke static method of Interface
		System.out.println(Vehicle.getHorsePower(2500, 400));

	}

}
