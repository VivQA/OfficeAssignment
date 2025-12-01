package org.officeAssignment.nonStaticMethodAndVariable;


class ShoppingCart {

    private String customerName;
    private double totalPrice;

    public ShoppingCart(String customerName) {
        this.customerName = customerName;
        this.totalPrice = 0.0;
    }

    public void addItem(double price) {
        totalPrice += price;
    }

    public void displayCart() {
        System.out.println("----- Shopping Cart -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Total Price   : ₹" + totalPrice);
        System.out.println();
    }
}
public class ShoppingSystem {
    public static void main(String[] args) {

        ShoppingCart cart1 = new ShoppingCart("Vivek");
        ShoppingCart cart2 = new ShoppingCart("Priya");

        cart1.addItem(500);
        cart1.addItem(1500);

        cart2.addItem(200);
        cart2.addItem(800);
        cart2.addItem(1200);

        cart1.displayCart();
        cart2.displayCart();
    }
}
