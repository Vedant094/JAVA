import java.util.*;
class A{
	public static void main(String Args[]){
		String a="Welcome";
		String b="java";
		String result=a+b;
		System.out.println(result);
		System.out.println(result.charAt(1));
		System.out.println(result.indexOf('a'));
		System.out.println(result.indexOf('a',8));
		String c="JAVA";
		System.out.println(b.equals(c));
		System.out.println(b.equalsIgnoreCase(c));

	}
}