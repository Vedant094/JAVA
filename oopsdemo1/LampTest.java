package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 10:33:09 AM
* Project : CoreJava
//Java program to implement main class and instance class in a same file
*/
class Lamp{
	//stores value for light
	//true if light is on
	//false if light is off
	
	boolean isOn;
	//method to turn On the light
	
	void turnOn() {
		isOn=true;
		System.out.println("Light On? "+isOn);
	}
	//method to turn Off the light
	void turnOff() {
		isOn=false;
		System.out.println("Light On? "+isOn);
	}
}
public class LampTest {

	public static void main(String[] args) {
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		//switch on led & halogen
		System.out.println("Switching on the light: ");
		led.turnOn();
		halogen.turnOn();
		System.out.println();
		
		//switch off led & halogen
		System.out.println("Switching off the light: ");
		led.turnOff();
		led.turnOff();

	}

}
