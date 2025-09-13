package truckproject;

public class NoidaToll implements TollBooth{
	private int totalTrucks;
	private int totalReceipts;
	
	


	@Override
	public void collectReceipts() {
		System.out.println("Totals since last collection:"
				+ " $"+totalReceipts+" Trucks: "+totalTrucks);
		
		
				
		System.out.println("Resetting the values now.....");
		//resetting the values of totalTrucks and totalReceipts 
		totalTrucks=0;
		totalReceipts=0;
		
	}

	@Override
	public void calculateToll(Truck truck) {
		int tollcost=(truck.getAxles()*5+(truck.getWeight()/500)*10);
		System.out.println("Arrival of "+truck.getTruck()+" Truck");
		System.out.println(truck.getTruck()+" has "+truck.getAxles()+" axles"+
				" and total weight is "+truck.getWeight()+ ".  Toll due: $"+tollcost);
		
		totalTrucks++;
		totalReceipts+=tollcost;
		
		
		
	}

}
