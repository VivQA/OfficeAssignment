package org.officeAssignment.Array;

public class SalesOfStore {
    public static void main(String[] args) {
        // Days of the week
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Sales data
        int[] sales = {1200, 900, 1500, 800, 1000, 1700, 1600};


        int maxSales = sales[0];
        int maxDayIndex = 0;

        // Find the maximum sales day
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxDayIndex = i;
            }
        }
        
        System.out.println("The highest sales were on " + days[maxDayIndex] + " with " + maxSales + " sales.");
    }
}
