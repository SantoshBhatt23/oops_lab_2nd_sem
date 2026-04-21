package ques1;

public class MyThread extends Thread{
    MyThread(){
        super("Santosh");
    }
    public void run(){
        System.out.println(getName()+" is running.");
    }
}
