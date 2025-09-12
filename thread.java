import java.util.*;
class Xyz{
	synchronized void wish(int x){
		for(int i=1;i<=10;i++){
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i*x);
		}
	}
}
class A extends Thread{
	Xyz d;
	A(Xyz d){
		this.d=d;
	}
	public void run(){
		d.wish(5);
	}
}
class B extends Thread{
	Xyz d;
	B(Xyz d){
		this.d=d;
	}
	public void run(){
		d.wish(6);
	}
}
class main{
	public static void main(String args[]){
		Xyz d=new Xyz();
		A a=new A(d);
		a.start();
		B b=new B(d);
		b.start();
	}
}