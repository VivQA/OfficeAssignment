package org.officeAssignment.methodoverriding;


class Ride {

    protected double distance;

    public Ride(double distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return 0.0;
    }
}

class BasicRide extends Ride {

    public BasicRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 10;   // ₹10 per km
    }
}

class PremiumRide extends Ride {

    public PremiumRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return (distance * 20) + 50;  // ₹20 per km + ₹50 extra
    }
}
public class RideFareCalculator {
    public static void main(String[] args) {

        Ride r1 = new BasicRide(10);      // 10 km
        Ride r2 = new PremiumRide(10);    // 10 km

        System.out.println("Basic Ride Fare   : ₹" + r1.calculateFare());
        System.out.println("Premium Ride Fare : ₹" + r2.calculateFare());
    }
}
