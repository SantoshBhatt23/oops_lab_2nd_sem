package ques3;

public class CosCalculate implements Runnable{
    double x;
    int terms;

    //Constructor:
    CosCalculate(double x , int terms){
        this.x = x;
        this.terms = terms;
    }

    //run method:
    public void run(){
        double result = 0;
        for(int n = 0 ; n<terms ; n++){
            result += Math.pow(-1,n)*Math.pow(x,2*n) / factorial(2*n);
        }
        System.out.println("Thread 2 -> Series calculated cos(x): " + result);
        System.out.println("Thread 2 -> Math.cos(x) verification: " + Math.cos(x));
    }

    //helper method:
    private long factorial(int n ){
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
