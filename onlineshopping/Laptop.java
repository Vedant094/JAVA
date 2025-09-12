package onlineshopping;

/**
* Author  : Vedant.Raturi
* Date    : Sep 6, 2025
* Time    : 12:00:43 PM
* Project : CoreJava

*/

class Laptop extends Product {
    public Laptop(String productName, double price) {
        super(productName, price);
    }

    @Override
    public void showProductDetails() {
        System.out.println("Laptop: " + productName + " | Price: ₹" + price);
    }
}
