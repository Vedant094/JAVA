package miscellaneous.banking;

/**
* Author  : Vedant.Raturi
* Date    : Sep 8, 2025
* Time    : 4:39:30 PM
* Project : CoreJava

*/

public class BankingGenericsDemo {

	public static void main(String[] args) {
		//using Generic Class for different types of account numbers
		BankAccount<Integer> savingsAcc=new BankAccount<Integer>("Alice", 123456);
		BankAccount<String> currentAcc=new BankAccount<String>("Bob","CURR-7890");
		BankAccount<Long> loanAcc=new BankAccount<Long>("Charlie", 9876543210L);
		
		System.out.println("=== Account Details ===");
        savingsAcc.displayAccountInfo();
        currentAcc.displayAccountInfo();
        loanAcc.displayAccountInfo();

        System.out.println("\n=== Transactions ===");
        // Using Generic Method for different transaction types
        BankingUtil.printTransaction("Deposit of $5000");// String
        BankingUtil.printTransaction(2500.75);  // double amount
        BankingUtil.printTransaction(12345);    // transaction ID

	}

}
