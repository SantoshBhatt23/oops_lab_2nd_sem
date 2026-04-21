
import java.util.Scanner;

class X{
    int i,j;
    X(int i,int j){
        this.i = i;
        this.j = j;
    }
    X(){};
}

class Y extends X{
    //constructor:
    Y(){}
    int findProduct(){
        return i*j;
    }

}
class Z extends Y{
    int findSum(){
        return i+j;
    }
    int findDiff(){
        return i-j;
    }
}

public class MultiLevelDemo{
    public static void main(String[] args){
        Z obj = new Z();
        System.out.print("Enter the value of i: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print("Enter the value of j: ");
        int j = sc.nextInt();

        obj.i = i;
        obj.j = j;

        int product = obj.findProduct();
        int sum = obj.findSum();
        int diff = obj.findDiff();

        System.out.println("Product of i and j : "+product);
        System.out.println("Sum of i and j: "+sum);
        System.out.println("Diff of i and j: "+ diff);

        sc.close();
    }
}