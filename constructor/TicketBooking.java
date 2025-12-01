package org.officeAssignment.constructor;

class Ticket {
        String movieName;
        String showTime;
        int seatNumber;
        String userName;

        public Ticket(String movieName, String showTime, int seatNumber, String userName) {
            this.movieName = movieName;
            this.showTime = showTime;
            this.seatNumber = seatNumber;
            this.userName = userName;
        }


        public void displayTicket() {
            System.out.println("----- Ticket Details -----");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Show Time  : " + showTime);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("User Name  : " + userName);
            System.out.println();
        }
    }

    public class TicketBooking {
        public static void main(String[] args) {


            Ticket t1 = new Ticket("Avengers: Endgame", "7:30 PM", 15, "Vivek");
            Ticket t2 = new Ticket("KGF 2", "9:00 PM", 22, "Rahul");
            Ticket t3 = new Ticket("Leo", "6:00 PM", 5, "Yuva");


            t1.displayTicket();
            t2.displayTicket();
            t3.displayTicket();
        }
    }
