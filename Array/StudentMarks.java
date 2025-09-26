package org.officeAssignment.Array;

public class StudentMarks {
    public static void main(String[] args) {
                // Subjects
                String[] subjects = {"Math", "Science", "English", "History"};

                // Marks for 3 students (3 rows, 4 columns)
                int[][] marks = {
                        {85, 90, 78, 88},  // Student 1
                        {76, 81, 95, 89},  // Student 2
                        {92, 87, 85, 90}   // Student 3
                };

                // Display header
                System.out.print("Student\t");
                for (String subject : subjects) {
                    System.out.print(subject + "\t");
                }
                System.out.println("Total");

                // Display marks and calculate total
                for (int i = 0; i < marks.length; i++) {
                    int total = 0;
                    System.out.print("S" + (i + 1) + "\t\t");
                    for (int j = 0; j < marks[i].length; j++) {
                        System.out.print(marks[i][j] + "\t\t");
                        total += marks[i][j];
                    }
                    System.out.println(total);
                }
            }
        }

    }
}
