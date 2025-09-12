package p2;
import p1.*;
class C2 implements I1{
	public int div(int x,int y){
	return x/y;
	}

	public static void main(String Args[]){
	C1 c=new C1();
	System.out.println("Sum is: "+c.sum(6,4));
	System.out.println("Diff is: "+c.sub(6,4));
	C2 a=new C2();
	System.out.println("Div is: "+a.div(8,4));
	}
}