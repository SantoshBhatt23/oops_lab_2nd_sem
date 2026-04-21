package ques1;

import java.util.Scanner;

public class CalcAmount {
    public static void main(String ... args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        int principal = sc.nextInt();
        System.out.println("Enter the rate : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the number of months: ");
        int months = sc.nextInt();
        System.out.println("Amount at the end of "+months+" Months : ");
        System.out.println((principal*rate*months)/(100*12));
    }
}
