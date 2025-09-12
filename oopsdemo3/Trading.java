package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 4, 2025
* Time    : 4:33:43 PM
* Project : CoreJava
*Method overriding example
*/

public class Trading {
	protected double tradeAmount;
	
	//constructor
	public Trading(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	
	// Method to be overridden
    public void tradeDetails() {
        System.out.println("General Trading: Amount invested = " + tradeAmount);
    }

    // Profit/Loss calculation (default)
    public double calculateProfitLoss() {
        return 0; // No calculation for general trading
    }	
	
	
}
