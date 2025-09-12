package miscellaneous.banking;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 8, 2025
 * Time    : 4:37:58 PM
 * Project : CoreJava

 */
//utitlity class with a Generic Method
public class BankingUtil {
	// Generic method to print any type of transaction
	public static <T> void printTransaction(T transaction) {
		System.out.println("Transaction: " + transaction);
	}
}
