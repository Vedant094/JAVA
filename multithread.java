import java.util.*;
class A extends Thread{
	public void run(){
	for(int i=0;i<=5;i++){
	System.out.println("This is Thread A and i= "+i);
	}
	}
}
class B extends Thread{
	public void run(){
	for(int i=0;i<=5;i++){
	System.out.println("This is Thread B and j= "+i);
	}
	}
}
class C extends Thread{
	public void run(){
	for(int i=0;i<=5;i++){
	System.out.println("This is Thread C and k= "+i);
	}
	}
}

class Pqr{
	public static void main(String Args[]){
	A obj1=new A();
	obj1.start();
	B obj2=new B();
	obj2.start();
	C obj3=new C();
	obj3.start();
	System.out.println("Priority of Thread A:"+obj1.getPriority());
	System.out.println("Priority of Thread B:"+obj2.getPriority());
	System.out.println("Priority of Thread C:"+obj1.getPriority());
	}
}