package ques4;

import java.util.Scanner;

public class Game {
    static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Welcome to the Two-Player Number Game ---");

            System.out.print("Player 1, enter an integer to play your turn: ");
            int dummyInput1 = scanner.nextInt();

            System.out.print("Player 2, enter an integer to play your turn: ");
            int dummyInput2 = scanner.nextInt();

            System.out.println("\nCalculating results...");

            //Thread Creation
            RandomNumber task1 = new RandomNumber("Player 1");
            RandomNumber task2 = new RandomNumber("Player 2");

            Thread thread1 = new Thread(task1);
            Thread thread2 = new Thread(task2);

            // --- Start Threads ---
            thread1.start();
            thread2.start();

            // join() ensures the main program pauses until both thread1 and thread2 complete their run() methods
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                System.out.println("A thread was interrupted.");
            }


            int p1Num = task1.getRandomNumber();
            int p2Num = task2.getRandomNumber();

            System.out.println("\n--- Final Results ---");
            if (p1Num > p2Num) {
                int points = p1Num - p2Num;
                System.out.println("Player 1 is the Winner!");
                System.out.println("Player 1 gets " + points + " points.");

            } else if (p2Num > p1Num) {
                int points = p2Num - p1Num;
                System.out.println("Player 2 is the Winner!");
                System.out.println("Player 2 gets " + points + " points.");

            } else {
                System.out.println("It's a tie! Both players rolled " + p1Num);
                System.out.println("No points awarded.");
            }

            scanner.close();
    }
}
