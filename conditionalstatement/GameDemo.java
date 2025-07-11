package org.officeAssignment.conditionalstatement;

public class GameDemo {
    public static void main(String[] args) {
        for (int level = 1; level <= 10; level++) {

            // Skip level 3
            if (level == 3) {
                System.out.println("Level " + level + " is locked. Skipping...");
                continue;
            }

            // Eliminate player at level 6
            if (level == 6) {
                System.out.println("Player eliminated at Level " + level + ". Game Over!");
                break;
            }

            // Normal level completion
            System.out.println("Player completed Level " + level);
        }
    }
}
