package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 5, 2025
* Time    : 9:59:08 AM
* Project : CoreJava

*/

public class Ticket {
	
	private String movieName;
    private double price;
    
    
	public Ticket(String movieName, double price) {
		this.movieName = movieName;
		this.price = price;
	}
	
	  public void showTicketDetails() {
	        System.out.println("Movie: " + movieName);
	        System.out.println("Price: " + price);
	    }
}
class RegularTicket extends Ticket{
	private String seatNumber;

	public RegularTicket(String movieName, double price, String seatNumber) {
		super(movieName, price);
		this.seatNumber = seatNumber;
	}
	
	public void showSeat() {
        System.out.println("Seat Number: " + seatNumber);
    }
	
}

class PremiumTicket extends Ticket{
	
	 private String loungeAccess;

	 public PremiumTicket(String movieName, double price, String loungeAccess) {
		super(movieName, price);
		this.loungeAccess = loungeAccess;
	 }
	 
	 public void showLoungeAccess() {
	        System.out.println("Lounge Access: " + loungeAccess);
	    }
	 
}
