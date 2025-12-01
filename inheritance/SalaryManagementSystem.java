package org.officeAssignment.inheritance;

class Employee {

    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Base Salary : ₹" + baseSalary);
    }
}
class Manager extends Employee {

    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary); // calling parent constructor
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("----- Manager Details -----");
        System.out.println("Name         : " + name);
        System.out.println("ID           : " + id);
        System.out.println("Base Salary  : ₹" + baseSalary);
        System.out.println("Bonus        : ₹" + bonus);
        System.out.println("Total Salary : ₹" + calculateSalary());
    }
}
public class SalaryManagementSystem {
    public static void main(String[] args) {

        Employee emp = new Employee("Rahul", 101, 30000);
        Manager mgr = new Manager("Yuva", 201, 50000, 15000);

        emp.displayDetails();
        System.out.println("Total Salary : ₹" + emp.calculateSalary());
        System.out.println();

        mgr.displayDetails();
    }
}
