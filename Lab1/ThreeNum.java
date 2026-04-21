import java.util.Scanner;
public class ThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //sum,avg,product,largest,smallest
        double avg = (num1+num2+num3)/3.0;
        int sum = num1 + num2 + num3;
        int largest,smallest;
        if(num1>num2){
            if(num1>num3){
                largest = num1;
            }else{
                largest = num3;
            }
        }else{
            if(num2>num3){
                largest = num2;
            }else{
                largest = num3;
            }
        }
        if(num1<num2 && num1<num3){
            smallest = num1;
        }else if(num2<num3 && num2 < num1){
            smallest = num2;
        }else{
            smallest = num3;
        }
        System.out.println("Sum = "+sum);
        System.out.println("avg = "+avg);
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
    }
}
