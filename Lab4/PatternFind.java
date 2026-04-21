
import java.util.Scanner;

public class PatternFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter pattern: ");
        int p = sc.nextInt();
        String pattern = String.valueOf(p);

        int cnt = 0;
        for(int i = a ; i<=b ;i++){
            if(String.valueOf(i).contains(pattern)) cnt++;
        }
        System.out.println("The no. of times "+pattern+" occured between "+a+" to "+ b+": "+cnt);
    }

}
