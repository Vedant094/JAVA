package oopsdemo1;

/**
* Author  : Vedant.Raturi
* Date    : Sep 3, 2025
* Time    : 2:39:21 PM
* Project : CoreJava
Java OOP example for an Air Cargo Booking System.
*/

//AirCargo class demonstrating Encapsulation & this keyword



public class AirCargo {
	// Attributes (Encapsulation - private fields)
	  private String bookingId;
	  private String senderName;
	  private String destination;
	  private double weight;
	  private double costPerKg;
	  
	  //Constructor
	  public AirCargo(String bookingId, String senderName, String destination, double weight, double costPerKg) {
		this.bookingId = bookingId;
		this.senderName = senderName;
		this.destination = destination;
		this.weight = weight;
		this.costPerKg = costPerKg;
	  }
	  
	  //GetBooking id
	  public String getBookingId() {
		  return bookingId;
	  }
	  
	  //SetBooking id
	  public void setBookingId(String bookingId) {
		  this.bookingId = bookingId;
	  }
	  
	  //GetSenderName
	  public String getSenderName() {
		  return senderName;
	  }
	  
	  //SetSenderName
	  public void setSenderName(String senderName) {
		  this.senderName = senderName;
	  }
	  
	  //GetDestination
	  public String getDestination() {
		  return destination;
	  }
	  
	  //SetDestination
	  public void setDestination(String destination) {
		  this.destination = destination;
	  }
	  
	  //GetWeight
	  public double getWeight() {
		  return weight;
	  }
	  
	  //SetWeight
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  //GetCostPerKg
	  public double getCostPerKg() {
		  return costPerKg;
	  }
	  
	  //SetCostPerKg
	  public void setCostPerKg(double costPerKg) {
		  this.costPerKg = costPerKg;
	  }
	  
	  
	  // Method to calculate total cost
	    public double calculateCost() {
	        return this.weight * this.costPerKg;
	    }
	    
	    public void bookCargo() {
	        System.out.println("\n✅ Cargo booked successfully with Booking ID: " + this.bookingId);
	    }
	    
	    public void generateBill() {
	        System.out.println("--------- Cargo Bill ---------=-----");
	        System.out.println("Booking ID: " + this.bookingId);
	        System.out.println("Sender Name: " + this.senderName);
	        System.out.println("Destination: " + this.destination);
	        System.out.println("Weight: " + this.weight + " kg");
	        System.out.println("Rate per Kg: ₹" + this.costPerKg);
	        System.out.println("Total Cost: ₹" + calculateCost());
	        System.out.println("-------------------------------------");
	  
	  
}
}
