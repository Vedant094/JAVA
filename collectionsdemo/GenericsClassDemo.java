package collectionsdemo;

/**
* Author  : Vedant.Raturi
* Date    : Sep 8, 2025
* Time    : 4:02:38 PM
* Project : CoreJava

*/
//Generic types should be always Wrapper
public class GenericsClassDemo {

	public static void main(String[] args) {
		Sample<String> s1=new Sample<String>("Java Generics");// Object of Generic class for Type String
		System.out.println("Display from Generic class by passing String Object: "+s1.getData());
		
		Sample<Integer> s2=new Sample<Integer>(200);// Object of Generic class for type Integer
		System.out.println("Display from Generic class by passing Integer Object: "+s2.getData());
		
		Sample<Double> s3=new Sample<Double>(555.50); //Object of Generic class for Type Double
		System.out.println("Display from Generic Class by passing Double Object: "+s3.getData());

	}

}
