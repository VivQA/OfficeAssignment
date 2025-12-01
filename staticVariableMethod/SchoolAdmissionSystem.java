package org.officeAssignment.staticVariableMethod;

class Student {

    private String name;
    private int admissionNumber;

    private static int totalStudents = 0;

    public Student(String name) {
        this.name = name;
        totalStudents++;
        this.admissionNumber = totalStudents;
    }

    public void displayDetails() {
        System.out.println("Student Name      : " + name);
        System.out.println("Admission Number  : " + admissionNumber);
        System.out.println();
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Admitted: " + totalStudents);
    }
}
public class SchoolAdmissionSystem {
    public static void main(String[] args) {

        Student s1 = new Student("Vivek");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Yuva");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.displayTotalStudents();
    }
}
