package ques3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] newNames = new String[10];

        //Input 10 names:
        for(int i = 0 ; i<10 ; i++){
            names[i] = sc.nextLine();
        }

        for(int i = 0 ; i<10 ; i++){
            if(names[i].length()>3){
                newNames[i] = names[i].substring(3);
            }
            else{
                newNames[i] = "";
            }
        }

        Arrays.sort(newNames);

        for(String name : newNames){
            System.out.println(name);
        }
    }
}
