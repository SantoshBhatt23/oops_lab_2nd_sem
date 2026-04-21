package src.com.mathapp;

public class Calculator {
    // Methods to perform calculations
    public int getSum(int a, int b) { return a + b; }
    public int getProduct(int a, int b) { return a * b; }
    public int getDifference(int a, int b) { return a - b; }
    public int getQuotient(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}
