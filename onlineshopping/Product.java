package onlineshopping;

/**
 * Author  : Vedant.Raturi
 * Date    : Sep 6, 2025
 * Time    : 11:59:52 AM
 * Project : CoreJava

 */


abstract class Product {
	String productName;
	double price;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	public abstract void showProductDetails();
}

