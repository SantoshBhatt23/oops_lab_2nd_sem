
import java.util.Scanner;


public class FreqCheck {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] freq = new int[26];
        for(int i = 0 ; i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i = 0 ; i<freq.length;i++){
            if(freq[i]>n) System.out.print((char)(i+'a'));
        }
        sc.close();
    }
}
