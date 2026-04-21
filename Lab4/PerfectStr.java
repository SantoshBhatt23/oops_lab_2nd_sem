import java.util.Scanner;

public class PerfectStr {
    public static void main(String[] args) {
        System.out.print("----------Perfect String Checker----------");
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i<str.length();i++){
            for(int j = i+1 ; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println("The string "+str+" is not a perfect string.");
                    System.exit(0);
                }
            }
        }
        System.out.println("String "+str+" is a perfect string");
    }
}
