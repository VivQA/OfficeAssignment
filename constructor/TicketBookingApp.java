package org.officeAssignment.Oops;

public class TicketBookingApp {
        public static void main(String[] args) {
            // Create multiple ticket objects
            Ticket ticket1 = new Ticket("Avengers: Endgame", "6:00 PM", "A10", "Vivek");
            Ticket ticket2 = new Ticket("Spider-Man: No Way Home", "9:00 PM", "B15", "Swapnil");
            Ticket ticket3 = new Ticket("Inception", "3:00 PM", "C5", "Yuva");

            // Display ticket details
            ticket1.displayTicket();
            ticket2.displayTicket();
            ticket3.displayTicket();
        }
        
    }
