import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of trips: ");
        int n = sc.nextInt();
        double tMiles =0.0,tGallons=0.0;
        for(int i = 0 ; i<n ; i++){
            System.out.printf("Trip number: %d\n",i+1);
            System.out.printf("Enter the no of miles driven: ",i+1);
            double miles = sc.nextDouble();
            System.out.printf("Enter the gallons of fuel consumed: ");
            double gallons = sc.nextDouble();
            tMiles+=miles;
            tGallons+=gallons;
            double iMileage = miles/gallons;
            double cMileage = tMiles/tGallons;
            System.out.println("Avg mileage of journey: "+iMileage);
            System.out.println("Overall Average mileage till this journey: "+cMileage);
        }
        System.out.println("Program completed!");
    }

}
