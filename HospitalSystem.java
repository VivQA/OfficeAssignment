package org.officeAssignment;

class Person {

    protected String name;
    protected int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Child class
class Doctor extends Person {

    private String specialization;
    private String hospitalName;


    public Doctor(String name, int age, String specialization, String hospitalName) {
        super(name, age);   // calling parent class constructor
        this.specialization = specialization;
        this.hospitalName = hospitalName;
    }


    public void displayDoctorDetails() {
        System.out.println("----- Doctor Details -----");

        // calling parent method using super
        super.displayPersonDetails();

        System.out.println("Specialization : " + specialization);
        System.out.println("Hospital Name  : " + hospitalName);
    }
}
public class HospitalSystem {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Dr. Vivek", 35, "Cardiology", "Apollo Hospital");

        doc.displayDoctorDetails();
    }
}
