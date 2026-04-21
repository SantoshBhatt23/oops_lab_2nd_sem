package ques3;

public class ThreadDemo {
    static void main(String[] args) {
        //setting arguments:
        int terms = 10;
        double degrees = 45.0;
        double radians = Math.toRadians(45.0);


        //Creating instance of Runnable class:
        SinCalculate sinCalculate = new SinCalculate(radians,terms);
        CosCalculate cosCalculate = new CosCalculate(radians,terms);

        //creating threads from runnable objects:
        Thread myThread1 = new Thread(sinCalculate);
        Thread myThread2 = new Thread(cosCalculate);

        //start thread:
        myThread1.start();
        myThread2.start();
    }
}
