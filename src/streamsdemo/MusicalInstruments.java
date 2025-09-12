package streamsdemo;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 12, 2025
 * Time    : 10:36:29 AM
 * Project : AdvancedJava

 */

public class MusicalInstruments {
	private String name;
	private String type;
	private double price;
	
	
	public MusicalInstruments(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "MusicalInstruments [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	
	




}
