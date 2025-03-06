package org.lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a operand: div:'/', multi:'*', div: '-', add:'+' or type 'q' to quit: ");
            char operator = scanner.next().charAt(0);
            if (operator == 'q' || operator == 'Q') {
                break;
            } if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid operator! Please enter one of +, -, *, /.");}
            switch (operator) {
                case '+':
                    System.out.println("Enter the first number: ");
                    int a = scanner.nextInt();
                    System.out.println("Enter the second number: ");
                    int b = scanner.nextInt();
                    System.out.println("The result is: " + Calculator.add(a, b));
                    break;
            }


        }// true
    }//main method
}//main class