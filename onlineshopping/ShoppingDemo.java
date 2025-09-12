package onlineshopping;

/**
* Author  : Vedant.Raturi
* Date    : Sep 6, 2025
* Time    : 12:05:23 PM
* Project : CoreJava

*/
/*
Shopping System with:

Abstract Class (Product) → base for all products.

Concrete Products (Laptop, Mobile) extending Product.

Interfaces (OnlinePayment, Discount) → for payment & discount behaviors.

ShoppingCart → manages multiple products, applies discounts, and makes payments.
*/
// Main Class


public class ShoppingDemo {
    public static void main(String[] args) {
        // Customer's Shopping Cart
        ShoppingCart cart = new ShoppingCart("Rohit");

        // Adding Products
        cart.addProduct(new Laptop("Dell XPS 15", 85000));
        cart.addProduct(new Mobile("iPhone 15", 120000));

        // Show cart
        cart.showCartDetails();

        // Apply discount
        double finalAmount = cart.applyDiscount(cart.getTotalAmount());

        // Make payment
        cart.payOnline(finalAmount);
        
        
        //Another Customer's Shopping Cart
        ShoppingCart cart2 = new ShoppingCart("Anita");
        cart2.addProduct(new Laptop("Samsung Galaxy S23", 70000));
        cart2.addProduct(new Mobile("Refrigerator", 120000));
        cart2.showCartDetails();
        cart2.payOnline(finalAmount);
    }
}

