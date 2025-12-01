package org.officeAssignment.Oops;

public class Ticket {
        // Attributes of a ticket
        String movieName;
        String showTime;
        String seatNumber;
        String userName;

        // Constructor to initialize ticket details
        public Ticket(String movieName, String showTime, String seatNumber, String userName) {
            this.movieName = movieName;
            this.showTime = showTime;
            this.seatNumber = seatNumber;
            this.userName = userName;
        }

        // Method to display ticket details
        public void displayTicket() {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Show Time: " + showTime);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("User Name: " + userName);
            System.out.println("---------------------------");
        }
    }

