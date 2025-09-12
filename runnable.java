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
	Thread t=Thread.currentThread();
	System.out.println("Main Thread Priority:"+t.getPriority());
	System.out.println("Main Thread Priority:"+t.getName());
	A obj1=new A();
	Thread th1=new Thread(obj1);
	th1.setPriority(1);
	th1.start();
	B obj2=new B();
	Thread th2=new Thread(obj2);
	th2.setPriority(6);
	th2.start();
	C obj3=new C();
	Thread th3=new Thread(obj3);
	th3.setPriority(4);
	th3.start();
	System.out.println("Priority of Thread A:"+th1.getPriority());
	System.out.println("Priority of Thread B:"+th2.getPriority());
	System.out.println("Priority of Thread C:"+th3.getPriority());
	}
}