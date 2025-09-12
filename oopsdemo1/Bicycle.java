package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 10:44:11 AM
* Project : CoreJava
 define attributes, methods & Objects in a Single Main class
*/

public class Bicycle {
	
	int gear;
	
	void applyBrake() {
		System.out.println("Applying Brakes....");
	}
	
	public void startCycling() {
		gear=gear+1;
		System.out.println("Cycling in Gear No: "+gear);
//		System.out.println("Increase Gear by one...");
//		int i=2;
//		Scanner scan=new Scanner(System.in);
//		while(i>2) {
//			
//			int g=scan.nextInt();
//			i--;
//		}
//		scan.close();
	}
	
	public static void main(String[] args) {
		Bicycle sportsBicycle=new Bicycle();
		
		
		sportsBicycle.startCycling();
		sportsBicycle.applyBrake();

	}

}
