package ques2;

public class MyRunnable implements Runnable{

    @Override
    public void run() {;
        System.out.println( Thread.currentThread().getName() + " is running.");
    }
    //constructor:
    MyRunnable(){
        Thread myThread = new Thread(this);
        myThread.start();
    }
}
