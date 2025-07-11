package org.officeAssignment.conditionalstatement;

public class RacingDemo {
    public static void main(String[] args) {

        double athlete1Time = 125.45;
        double athlete2Time = 120.45;

        System.out.println("Athlete 1 Time: " + athlete1Time + " seconds");
        System.out.println("Athlete 2 Time: " + athlete2Time + " seconds");


        if (athlete1Time < athlete2Time) {
            System.out.println("Athlete 1 is the winner!");
        } else if (athlete2Time < athlete1Time) {
            System.out.println("Athlete 2 is the winner!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
