package oopsdemo3;

/**
* Author  : Vedant.Raturi
* Date    : Sep 5, 2025
* Time    : 2:53:19 PM
* Project : CoreJava

*/

public class CargoShipment {
	private String shipmentId;
    private String sender;
    private String receiver;
    private double weight;   // in kg
    private String destination;
    private String cargoType;
    
    //Constructor 1:Only shipmentId and destination(basic booking)
	public CargoShipment(String shipmentId, String destination) {
		this.shipmentId = shipmentId;
		this.destination = destination;
	}

	
	//Constructor 2:Shipment with sender, receiver and weight
	public CargoShipment(String shipmentId, String sender, String receiver, double weight) {
		this.shipmentId = shipmentId;
		this.sender = sender;
		this.receiver = receiver;
		this.weight = weight;
		this.cargoType="General";
	}

	//Constructor 3:Shipment with all details
	public CargoShipment(String shipmentId, String sender, String receiver, double weight, String destination,
			String cargoType) {
		this.shipmentId = shipmentId;
		this.sender = sender;
		this.receiver = receiver;
		this.weight = weight;
		this.destination = destination;
		this.cargoType = cargoType;
	}
	
	// Method to display shipment details
    public void showShipmentDetails() {
        System.out.println("Shipment ID: " + shipmentId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Destination: " + destination);
        System.out.println("Cargo Type: " + cargoType);
        System.out.println("-----------------------------------");
    }
	
	
    
    
}
