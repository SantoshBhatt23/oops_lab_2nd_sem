
import java.util.Scanner;

public class ParkingFee {
    public static double calculateCharges(int hours){
        double totalCharge = 0.0;
        if(hours<=3) totalCharge = 2.00;
        else{
            totalCharge = 2.00 + 0.50*(hours-3);
            if(totalCharge>10.0){
                totalCharge = 10.0d;
            }
        }
        return totalCharge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of hours of parking: ");
        int hours = sc.nextInt();
        double fee = calculateCharges(hours);
        System.out.println("Fees for parking = "+fee);
    }
}
