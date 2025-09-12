package miscellaneous;
import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * Author  : Vedant.Raturi
 * Date    : Sep 12, 2025
 * Time    : 11:39:27 AM
 * Project : AdvancedJava

 */
//In Java, static import concept is introduced in 1.5 version. 
//2
//* With the help of static import, we can access the static members 
//3
//* of a class directly without class name or any object. 
//4
//* For Example: we always use sqrt() method of Math class by 
//5
//* using Math class i.e. Math.sqrt(), 
//6
//* but by using static import we can access sqrt() method directly. 


public class StaticImportDemo {

	public static void main(String[] args) {
		// calling of predefined methods without static import
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 2));
		System.out.println(Math.abs(6.3));

		// calling of predefined methods with static import
		out.println(sqrt(4));
		out.println(pow(2, 2));
		out.println(abs(6.3));
	}

}
