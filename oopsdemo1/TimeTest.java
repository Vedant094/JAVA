package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 12:51:17 PM
* Project : CoreJava

*/

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(12,45,55);
		Time t2=new Time(10,30,30);
		System.out.println(t1);
		System.out.println(t2);
		t1.add(t2);
		t1.display();
		

	}

}
