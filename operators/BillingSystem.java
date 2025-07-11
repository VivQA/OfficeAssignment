package org.officeAssignment.operators;

public class BillingSystem {
    public static void main(String[] args) {
        int quantity = 500;
        double price = 100.0;
        double totalAmount = quantity * price;

        // Print item details
        System.out.println("Item 1 - Qty: " + quantity + ", Price: ₹" + price + ", Total: ₹" + totalAmount);

        double discount = 0;

        // Apply 10% discount if total > 1000
        if (totalAmount > 1000) {
            discount = totalAmount * 0.10;
            System.out.println("Eligible for 10% discount: ₹" + discount);
        } else {
            System.out.println("No discount applicable.");
        }

        double finalAmount = totalAmount - discount;
        System.out.println("Final Amount to Pay: ₹" + finalAmount);

        // Using Ternary Operator for Gift Eligibility
        String giftMessage = (finalAmount > 2000)
                ? "Congratulations! You're eligible for a special gift!"
                : "No special gift this time.";
        System.out.println(giftMessage);
    }
}
