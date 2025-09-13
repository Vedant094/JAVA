package truckproject;

public class Toyota implements Truck{
	private int axles;
	private int weight;
	private String make="Toyota";
	
	
	public Toyota(int axles, int weight) {
		super();
		this.axles = axles;
		this.weight = weight;
	}

	@Override
	public int getAxles() {
		return axles;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public String getTruck() {
		return make;
	}

}
