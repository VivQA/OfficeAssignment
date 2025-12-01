package org.officeAssignment.interfectDemo;

interface Payment {
    void processPayment(double amount);
    void generateReceipt();
}


class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generating receipt for Credit Card payment.");
    }
}

class UpiPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Generating receipt for UPI payment.");
    }
}

public class EcommercePaymentSystem {

    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(2500);
        payment1.generateReceipt();

        System.out.println("------------------------");

        Payment payment2 = new UpiPayment();
        payment2.processPayment(899);
        payment2.generateReceipt();
    }
}
