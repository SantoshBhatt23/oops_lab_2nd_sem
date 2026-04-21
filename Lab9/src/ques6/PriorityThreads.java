package ques6;

public class PriorityThreads {
    public static void main(String[] args) {
        // Create Runnable tasks
        PrimeCalculator primeTask = new PrimeCalculator();
        FibonacciCalculator fibTask = new FibonacciCalculator();

        // Create Threads
        Thread primeThread = new Thread(primeTask);
        Thread fibThread = new Thread(fibTask);

        // Set Priorities according to the question
        fibThread.setPriority(8);
        primeThread.setPriority(5);

        // Start both threads
        // Even if we start Prime first, Fibonacci runs first because of its higher priority (8 vs 5)
        primeThread.start();
        fibThread.start();
    }
}