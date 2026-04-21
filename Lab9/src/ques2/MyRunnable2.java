package ques2;

class MyActiveTask implements Runnable {
    Thread t;

    MyActiveTask() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread created: " + t);

        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class MyRunnable2 {
    public static void main(String[] args) {
        new MyActiveTask();
    }
}