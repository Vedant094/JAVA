package exceptionsdemo;

import java.util.Scanner;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 6, 2025
 * Time    : 2:23:00 PM
 * Project : CoreJava
 *Program to find Division of 2 nos without Exception Handling
 */

public class DivisionDemo {

	public static void main(String[] args) {
		int a, b, result;
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers :");
		a = input.nextInt();
		b = input.nextInt();
		try {
			result = a / b;
			System.out.println("Result = " + result);
		}

		catch(ArithmeticException e) {
			System.out.println("Divide by Zero Error. Please enter second number as NON-ZERO");
            e.printStackTrace(); //Name,Description, StackTrace
            System.out.println("Exception Description :"+e.getMessage());
            System.out.println("Exception Name & Description :"+e.toString());
		}
		finally {input.close();
		System.out.println("In finally block");
		}
	}

}
