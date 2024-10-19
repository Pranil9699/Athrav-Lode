package com.arthrv.p23;

import java.util.Scanner;

public class ExceptionHandlingDemo {
 
    // Method to demonstrate exception handling
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Arithmetic Exception (e.g., division by zero)
            int result = divideByNumber(number);
            System.out.println("Result of division by " + number + " is: " + result);

        } catch (ArithmeticException e) {
            // Catch block for handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Catch block for handling any other exception
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            // This block will always execute
            System.out.println("Program execution complete.");
            scanner.close(); // Closing scanner to avoid resource leaks
        }
    }
 
    // Method that throws an ArithmeticException
    public static int divideByNumber(int number) throws ArithmeticException {
        return 100 / number;
    }
}
