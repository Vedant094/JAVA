import java.util.*;
class A extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("This is Thread A and I = "+i);
		}
	}
}
class B extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("This is Thread B and J = "+i);
		}
	}
}
class C extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("This is Thread C and K = "+i);
		}
	}
}
class main{
	public static void main(String Args[]){
		A a=new A();
		a.start();
		B b=new B();
		b.start();
		C c=new C();
		c.start();
	}
}