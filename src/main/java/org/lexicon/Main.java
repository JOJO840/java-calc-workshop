package org.lexicon;

import java.util.Scanner;

import org.lexicon.Calculator;  // Import your Calculator class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask for operator input
            System.out.println("Enter an operator: div:'/', multi:'*', sub:'-', add:'+' or type 'q' to quit: ");
            String input = scanner.next();  // Read the operator as a String

            // Ensure the input is exactly one character long
            if (input.length() != 1) {
                System.out.println("Invalid input! Please enter only one character.");
                continue;  // Skip to the next iteration if input is invalid
            }

            char operator = input.charAt(0); // Extract the operator character

            // Exit condition if the user enters 'q' or 'Q'
            if (operator == 'q' || operator == 'Q') {
                System.out.println("Exiting program...");
                break; // Exit the loop and terminate the program
            }

            // Get the two numbers from the user
            System.out.print("Enter the first number: ");
            while (!scanner.hasNextInt()) {  // Validate if input is an integer
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            while (!scanner.hasNextInt()) {  // Validate if input is an integer
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();  // Clear invalid input
            }
            int num2 = scanner.nextInt();

            // Perform the calculation using the Calculator class
            switch (operator) {
                case '+':
                    System.out.println("The result of addition is: " + Calculator.add(num1, num2));
                    break;
                case '-':
                    System.out.println("The result of subtraction is: " + Calculator.sub(num1, num2));
                    break;
                case '*':
                    System.out.println("The result of multiplication is: " + Calculator.mult(num1, num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("The result of division is: " + Calculator.div(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please enter one of the specified operators.");
            }
        }

        scanner.close();  // Close the scanner resource
    }
}
