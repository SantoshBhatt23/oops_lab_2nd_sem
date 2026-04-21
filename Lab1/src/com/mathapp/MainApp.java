package src.com.mathapp;

import java.util.Scanner; // Importing the built-in Scanner package

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Sum: " + calc.getSum(num1, num2));
        System.out.println("Product: " + calc.getProduct(num1, num2));
        System.out.println("Difference: " + calc.getDifference(num1, num2));
        System.out.println("Quotient: " + calc.getQuotient(num1, num2));
        
        input.close();
    }
}