package miscellaneous.banking;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 8, 2025
 * Time    : 4:31:34 PM
 * Project : CoreJava

 */
//Generic Class for bank account
public class BankAccount<T> {
	private String accountHolder;
	private T accountNumber;  // Can be Integer, Long, String, etc.


	public BankAccount(String accountHolder, T accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}

	public T getAccountNumber() {
		return accountNumber;
	}

	public void displayAccountInfo() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
	}

}
