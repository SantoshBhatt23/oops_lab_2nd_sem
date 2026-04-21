package ques2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String vowels = "aeiouAEIOU";
        for(int i = 0 ; i< input.length();i++){
            char ch = input.charAt(i);
            if(vowels.indexOf(ch)!=-1){
                System.out.println(ch+" at position "+i);
            }
        }
    }
}
