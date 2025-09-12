package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 5, 2025
* Time    : 9:48:18 AM
* Project : CoreJava

*/

public class UpcastingDemo {

	public static void main(String[] args) {
		Product product;
		
		//product object refers to Book object
		product=new Book("Java Programming",450,"James Gosling"); // Upcasting
		System.out.println("---------------Book Details----------");
		product.display();//dynamic binding
		
		//Switching from one implementation to another is easy
        product=new Laptop("IdeaPad",60000.00,"Lenova"); //Upcasting
        System.out.println("------------- Laptop Details --------------");
        product.display();//Dynamic Binding

        product =new Book("Python Made Easy",650,"Balaguruswamy"); //Upcasting
        System.out.println("------------- Book Details --------------");
        product.display(); //Dynamic Binding
        
      //Access default variable from Test class
        Test t1=new Test(100,200,45,600);
        Test2 t2=new Test2(200,300,11,550);
        System.out.println("Default variable form Test Class : "+t1.a);
        t2.print(); //Invoke Default method of Test2 class
	}

}
