package truckproject;

public class TollTest {

	public static void main(String[] args) {
		//initializing Toll class object
		NoidaToll toll1=new NoidaToll();
		
		//initializing truck objects
		
		Truck fordTruck=new Ford(5,10000);
		Truck toyotaTruck=new Toyota(6,12000);
		Truck tataTruck=new Tata(4,8000);
		Truck smlTruck=new Sml(3,6000);
		
		toll1.calculateToll(fordTruck);
		toll1.calculateToll(toyotaTruck);
		toll1.calculateToll(tataTruck);
		toll1.calculateToll(smlTruck);
		
		toll1.collectReceipts();
		
		
	}

}
