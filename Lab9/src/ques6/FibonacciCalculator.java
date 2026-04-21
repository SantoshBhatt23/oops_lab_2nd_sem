package ques6;

// Runnable class to compute Fibonacci numbers
class FibonacciCalculator implements Runnable {
    @Override
    public void run() {
        System.out.println("[Fibonacci Thread] Started computation...");
        long f1 = 1, f2 = 1;

        System.out.println("[Fibonacci Thread] Fib 1: " + f1);
        System.out.println("[Fibonacci Thread] Fib 2: " + f2);

        // 1. Compute the first 50 Fibonacci numbers
        for (int i = 3; i <= 50; i++) {
            long fn = f1 + f2;
            System.out.println("[Fibonacci Thread] Fib " + i + ": " + fn);
            f1 = f2;
            f2 = fn;
        }

        // 2. Make the thread sleep as requested
        System.out.println("\n[Fibonacci Thread] Computed 50 numbers. Going to sleep...");
        try {
            // Sleeping for 2 seconds. Because this thread has higher priority,
            // going to sleep is what allows the lower-priority Prime thread to take over the CPU.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("[Fibonacci Thread] Interrupted.");
        }

        // 3. Wake up and continue computing
        System.out.println("[Fibonacci Thread] Woke up! Continuing computation...");
        for (int i = 51; i <= 60; i++) {
            long fn = f1 + f2;
            System.out.println("[Fibonacci Thread] Fib " + i + ": " + fn);
            f1 = f2;
            f2 = fn;
        }

        System.out.println("[Fibonacci Thread] Completely finished.");
    }
}
