package oopsdemo4;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 6, 2025
 * Time    : 10:22:04 AM
 * Project : CoreJava

 */

public class CreditCardPayment implements Payment{
	private String transactionId;
	private boolean paymentSuccess;


	public CreditCardPayment() {
		this.transactionId = "TXN" + (int)(Math.random() * 1000000);
		//random() is a static method of Math class which is used to 
	    //generate a random number between 0.0 and 1.0.
	}


	@Override
	public void processPayment(double amount) {
		System.out.println("\nProcessing payment of $" + amount + " via Credit Card");
        // Simulate payment processing
        paymentSuccess = Math.random() > 0.1; // 90% success rate for demo
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Status: " + (paymentSuccess ? "Success" : "Failed"));
		
	}


	@Override
	public boolean isPaymentSuccessful() {
		
		return this.paymentSuccess;
	}


	@Override
	public String getTransactionId() {
		
		return this.transactionId;
	}
	
	

}
