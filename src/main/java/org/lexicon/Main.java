package org.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a operand: div:'/', multi:'*', div: '-', add:'+' or type 'q' to quit: ");
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Invalid input! Please enter only one character.");
                continue;  // Skip to the next iteration if it's not a valid operator
            }
            char operator = input.charAt(0); // we need the first char for operator comparison
            if (operator == 'q' || operator == 'Q') {
                break;
            }
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid operator! Please enter one of +, -, *, /.");
            } // operator validation
            switch (operator) {
                case '+':
                    System.out.println("you selected Addition");
                    int a, b;
                    while (true) {
                        System.out.println("Enter first number (must be an positive int): ");
                        while (!scanner.hasNextInt()) { // Ensure it's an integer and must be false for invalid input condition to run
                            System.out.println("invalid input! (pos int)");
                            scanner.next(); // must have or the code loops, must break the loop
                        }
                        a = scanner.nextInt();
                        if (a > 0) break;
                        System.out.println("numb must be positive!");
                    }
                    while (true) {
                        System.out.println("Enter the second number (must be a positive integer): ");
                        while (!scanner.hasNextInt()) { // Ensure it's an integer and must be false for invalid input condition to run
                            System.out.println("Invalid input! Please enter a valid positive integer.");
                            scanner.next(); // must have or the code loops
                        }
                        b = scanner.nextInt();
                        if (b > 0) break; // Exit loop if number is positive
                        System.out.println("Number must be positive!");
                    }

                    System.out.println("The result is: " + Calculator.add(a, b));
                    break;
            }


        }// true
    }//main method
}//main class