package exceptionsdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* Author  : Vedant.Raturi
* Date    : Sep 6, 2025
* Time    : 2:55:29 PM
* Project : CoreJava

*/
//Java program to demonstrate multiple catch blocks
public class MultipleDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		int a, b, c;
		try
		{
			System.out.println ("Enter Any 2 Numbers");
			a = Integer.parseInt (br.readLine ());
			b = Integer.parseInt (br.readLine ());
			System.out.println("Enter your Name : ");
			String name=br.readLine();
			
			c = a / b;
			
			System.out.println ("C VALUE = " + c);
			System.out.println("Thank You "+name);
		}
		
		catch(NumberFormatException nfe) {
			System.err.println("Please pass only integer values: "+nfe);
		}
		catch(ArithmeticException ae) {
			System.err.println("Please don't pass Second value as zero: "+ae);
		}
		
		finally {
			br.close();
			System.out.println("Inside Finally Block");
		}
		System.out.println("End of Main Method");
		
	}

}
