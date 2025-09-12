package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 9, 2025
 * Time    : 10:21:03 AM
 * Project : CoreJava

 */

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//Create Generic ArrayList of type String

		ArrayList<String> p1=new ArrayList<>();

		//Add elements to ArrayList - It maintains order of insertion. Data stored inform of objects

		p1.add("Java");
		p1.add("Perl");
		p1.add("C++");
		p1.add("C# 5.0");
		p1.add("Java"); // Store duplicate elements
		p1.add("Python");

		//Display ArrayList contents as List
		System.out.println("Programming Languages ArrayList: "+p1);

		//Access elements using get() method
		System.out.println("Element at Index 1 is: "+p1.get(1));
		System.out.println("Does ArrayList contains element Java ?: "+p1.contains("java"));

		//Add elements at Specific Index
		p1.add(2,"Oracle");
		System.out.println("Programming Languages ArrayList: "+p1);


		//Manipulations
		System.out.println("Is ArrayList Empty ? : "+p1.isEmpty());
		System.out.println("The Position of Python : "+p1.indexOf("Python"));
		System.out.println("The size of ArrayList is "+p1.size());

		//Create a Arryalist to store marks

		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(89);
		marks.add(45);
		marks.add(68);
		marks.add(94);
		marks.add(75);

		System.out.println();
//		System.out.println("Printing using iterator: ");
//		Iterator<Integer> iterator=marks.iterator();
//		while(iterator.hasNext()) {
//			int m=iterator.next();
//			System.out.println("The marks are : "+m);
//		}

		// marks.add("Hello"); //Compiler Error - Type Safety

		System.out.println("The Marks ArrayList is :"+marks);
		System.out.println("The Size of Marks ArrayList is : "+marks.size());
		System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

		Collections.sort(marks);
		System.out.println("Marks ArrayList after Sorting :"+marks);
	}

}
