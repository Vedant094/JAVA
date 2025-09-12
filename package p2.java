package p2;
import p1.C1;
import p1.I1;
class C2 implements I1{
	public int div(int x,int y){
	return x/y;
	}
}
class main{
	public static void main(String Args[]){
	System.out.println("Sum is: "+sum(6,4));
	System.out.println("Diff is: "+sub(6,4));
	System.out.println("Div is: "+div(8,4));
	}
}