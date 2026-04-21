package ques3;

public class SinCalculate implements Runnable {
    double x;
    int terms;
    double result = 0;

    SinCalculate(double angle , int terms){
        this.x= angle;
        this.terms = terms;
    }
    @Override
    public void run() {
        for(int n = 0 ; n<terms ; n++){
            result += Math.pow(-1,n)*Math.pow(x,2*n+1) / factorial(2*n+1) ;
        }

        System.out.println("Thread1 -> Series calculated sin(x) : " + result );
        System.out.println("Therad1 -> Math.cos(x) verification : "+Math.sin(x));
    }

    private long factorial(int n){
        long result = 1;
        for(int i = 1 ; i<=n ; i++){
            result *= i;
        }
        return result;
    }
}
