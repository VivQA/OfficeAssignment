package org.officeAssignment.String;

public class PasswordEncryption {
    public static void main(String[] args) {
        // Original password
        String password = "MyPass123";

        // Manually reverse using a loop
        String encryptedPassword = "";
        for (int i = password.length() - 1; i >= 0; i--) {
            encryptedPassword += password.charAt(i);
        }
        
        // Display result
        System.out.println("Original password: " + password);
        System.out.println("Encrypted password: " + encryptedPassword);
    }
}
