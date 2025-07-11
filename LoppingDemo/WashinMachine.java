package org.officeAssignment.LoppingDemo;

public class WashinMachine {
    public static void main(String[] args) {
        int totalMinutes = 5;

        for (int minute = 1; minute <= totalMinutes; minute++) {
            System.out.println("Washing Minute: " + minute);
        }

        System.out.println("Washing complete!");
    }
}
