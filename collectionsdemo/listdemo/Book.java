package collectionsdemo.listdemo;

/**
* Author  : Vedant.Raturi
* Date    : Sep 9, 2025
* Time    : 11:35:50 AM
* Project : CoreJava

*/

public class Book {
	//Attributes
	private int id;
    private String name,author,publisher;
    private int quantity;
    
    //generate Constructors
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	//Generate Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
    
   
    
    
}
