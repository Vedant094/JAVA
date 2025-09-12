package oopsdemo1;

import java.util.Scanner;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 10:01:02 AM
* Project : CoreJava

*/

public class BookTest {

	public static void main(String[] args) {
		Book b1=new Book();
		
		//invoke setter methods -input
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		
		//invoke getter methods
		
		System.out.println("******Book Details******");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		System.out.println("Discounted Price of Book :"+b1.discountPrice());
		
		System.out.println(b1); //invokes toString() method of the instance class	
		
		Book b2=new Book();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Book Id, Name , Price & Publisher :");
		b2.setBookId(scan.nextInt());
		scan.nextLine();
		b2.setBookName(scan.nextLine());
		b2.setPrice(scan.nextFloat());
		scan.nextLine();
		b2.setPublisher(scan.nextLine());
		scan.close();
		
		System.out.println("******Book Details******");
		b2.display();
		System.out.println("Book Id               :"+b2.getBookId());
		System.out.println("Book Name             :"+b2.getBookName());
		System.out.println("Book Price            :"+b2.getPrice());
		System.out.println("Book Publisher        :"+b2.getPublisher());
		System.out.println("Discounted Book Price :"+b2.discountPrice());
		
		System.out.println("---------------------------------");
		
		System.out.println(b2);

	}

}
