package oopsdemo1;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 3, 2025
 * Time    : 3:11:10 PM
 * Project : CoreJava

 */

class Test {

	//destructor

	public void finalize() { //override finalize() method of Object class
		System.out.println("Object Destroyed & Garbage Collected.");
	}
}

public class DestructorDemo {

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		Test t4=new Test();
		Test t5=new Test();
		
		t1=null;
		t2=null;
		t3=null;
		System.gc();
		System.out.println("in main method");
		
	}
}
