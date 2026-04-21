package ques6;

// Runnable class to compute Prime numbers
class PrimeCalculator implements Runnable {
    @Override
    public void run() {
        System.out.println("\n[Prime Thread] Started computation...");
        int count = 0;
        int num = 2;

        while (count < 25) {
            if (isPrime(num)) {
                System.out.println("[Prime Thread] Prime " + (count + 1) + ": " + num);
                count++;
            }
            num++;
        }
        System.out.println("[Prime Thread] Finished computing 25 prime numbers.\n");
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
