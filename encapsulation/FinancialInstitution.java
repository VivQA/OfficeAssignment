package org.officeAssignment.encapsulation;


class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("----- Account Details -----");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : ₹" + balance);
        System.out.println();
    }
}
public class FinancialInstitution {
        public static void main(String[] args) {

            BankAccount account = new BankAccount();

            account.setAccountHolderName("Vivek Dhawade");
            account.setAccountNumber("ACC1234567");
            account.setBalance(50000);

            account.displayAccountDetails();
        }
    }

