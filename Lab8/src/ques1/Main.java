package ques1;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String processedInput = input.toLowerCase();
        int first = processedInput.indexOf("the ");
        int last = processedInput.lastIndexOf("the ");
        if(first==-1||first==last){
            System.out.println("Not enough occurences of 'the'.");
            exit(0);
        }
        String res = input.substring(first+3,last);
        System.out.println(res);
    }
}
