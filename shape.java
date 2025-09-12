import java.util.*;
class Shape{
	void area(){
		System.out.println("Calculating area...");
	}
}
class Circle extends Shape{
	void area(){
	System.out.println("Calculating area of Circle...");
	}
}
class Triangle extends Shape{
	void area(){
	System.out.println("Calculating area of Triangle...");
	}
}
class Square extends Shape{
	void area(){
	System.out.println("Calculating area of Square...");
	}
}
class main{
	public static void main(String Args[]){
	Shape s1=new Circle();
	s1.area();
	Shape s2=new Triangle();
	s2.area();
	Shape s3=new Square();
	s3.area();
	}
}