
import java.util.Scanner;


public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account no: ");
        int AcNo = sc.nextInt();
        System.out.print("Enter balance in beggining of month: ");
        double balanceBegin = sc.nextDouble();
        System.out.print("Enter total of all items charged this month: ");
        double charges = sc.nextDouble();
        System.out.print("Enter total of all credits applied this month: ");
        double credits = sc.nextDouble();
        System.out.print("Enter allowed credit limits: ");
        double creditLimit = sc.nextDouble();

        double newBalance = balanceBegin + charges - credits;
        if(newBalance>creditLimit){
            System.out.println("Credit Limit Exceeded!");
        }else{
            System.out.println("Credit limit not exceeded.");
        }
    }
}
