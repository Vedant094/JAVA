package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 12:43:05 PM
* Project : CoreJava
Java program to perform addition of 2 Times
 * t1 --> 12 : 45 :55 
 * t2 --> 10 : 30 :30
 *        23    16 :25
 * 
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
*/

public class Time {

	private int hrs,min,sec;
	
	
	
	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}
	void add(Time obj) {
		this.hrs+=obj.hrs;
		this.min+=obj.min;
		this.sec+=obj.sec;
		
		if(this.sec>60) {
			this.sec=this.sec-60;
			this.min++;
			
		}
		if(this.min>60) {
			this.min=this.min-60;
			this.hrs++;
			
		}
	}
	void display() {
		System.out.println("The time is hrs:min:sec: "+hrs+":"+min+":"+sec);
	}
	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", min=" + min + ", sec=" + sec + "]";
	}
	
	
}
