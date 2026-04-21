package ques7;

import java.util.Random;

class BankAccount {
    private int balance = 600;
    private boolean isFatherTurn = true; // Father starts first

    // Synchronized method for Father to deposit
    public synchronized void deposit() {
        while (!isFatherTurn) {
            try {
                wait();
            } catch (InterruptedException e)
            {

            }
        }

        Random rand = new Random();
        int amount = rand.nextInt(200) + 1; // Rs. 1 to 200
        balance += amount;
        System.out.println("Father deposited: Rs." + amount + " | Current Balance: Rs." + balance);

        if (balance > 2000) {
            System.out.println("--- Balance exceeds 2000. Son's turn to withdraw. ---");
            isFatherTurn = false;
            notifyAll(); // Wake up the Son thread
        }
    }

    // Synchronized method for Son to withdraw
    public synchronized void withdraw() {
        while (isFatherTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        Random rand = new Random();
        int amount = rand.nextInt(150) + 1; // Rs. 1 to 150

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Son withdrew: Rs." + amount + " | Current Balance: Rs." + balance);
        }

        if (balance < 500) {
            System.out.println("--- Balance below 500. Father's turn to deposit. ---");
            isFatherTurn = true;
            notifyAll(); // Wake up the Father thread
        }
    }
}
