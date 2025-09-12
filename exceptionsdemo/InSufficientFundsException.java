package exceptionsdemo;

/**
* Author  : Vedant.Raturi
* Date    : Sep 8, 2025
* Time    : 9:46:23 AM
* Project : CoreJava

*/
//user defined Exception class
public class InSufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	public InSufficientFundsException(double amount) {
		this.amount=amount;
	}

	public double getAmount() {
		return amount;
	}
	
	

}
