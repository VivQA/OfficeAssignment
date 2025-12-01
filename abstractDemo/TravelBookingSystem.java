package org.officeAssignment.abstractDemo;

abstract class Transport {

    abstract void bookTicket();
}

class Flight extends Transport {

    @Override
    void bookTicket() {
        System.out.println("Booking a flight ticket... Seat selected, meal preference added.");
    }
}

class Train extends Transport {

    @Override
    void bookTicket() {
        System.out.println("Booking a train ticket... Coach and berth selected.");
    }
}
public class TravelBookingSystem {
    public static void main(String[] args) {

        Transport t1 = new Flight();
        t1.bookTicket();   // Calls Flight implementation

        Transport t2 = new Train();
        t2.bookTicket();   // Calls Train implementation
    }
}
