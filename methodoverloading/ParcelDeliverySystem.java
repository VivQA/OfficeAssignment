package org.officeAssignment.methodoverloading;

class ParcelService {

    public double calculateCost(double weight) {
        return weight * 10;   // ₹10 per kg
    }

    public double calculateCost(double weight, double distance) {
        return (weight * 10) + (distance * 5);   // distance charge: ₹5 per km
    }

    public double calculateCost(double weight, double distance, String speed) {
        double baseCost = (weight * 10) + (distance * 5);

        if (speed.equalsIgnoreCase("express")) {
            baseCost += 200;   // express delivery extra charge
        }

        return baseCost;
    }
}
public class ParcelDeliverySystem {
    public static void main(String[] args) {

        ParcelService service = new ParcelService();

        double cost1 = service.calculateCost(5);  // weight only
        double cost2 = service.calculateCost(5, 50);  // weight + distance
        double cost3 = service.calculateCost(5, 50, "express");  // all 3

        System.out.println("Standard Delivery Cost     : ₹" + cost1);
        System.out.println("Out-of-Town Delivery Cost  : ₹" + cost2);
        System.out.println("Express Delivery Cost      : ₹" + cost3);
    }
}
