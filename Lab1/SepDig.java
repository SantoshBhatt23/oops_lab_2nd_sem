import java.util.Scanner;
public class SepDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 5 digit number = ");
        int num = sc.nextInt();
        int digits[] = new int[5];
        int i = 4;
        while(num!=0){
            int dig = num%10;
            num/=10;
            digits[i] = dig;
            i--;
        }
        for(int j = 0 ; j<5 ; j++){
            System.out.print(digits[j]+"   ");
        }
    }
}
