import java.util.Scanner;
public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String header1 = "Number";
        String header2 = "Square";
        String header3 = "Cube";
        String format = "%-10s %-10s %-10s\n";
        System.out.printf(format,header1,header2,header3);
        for(int i = 0 ; i<30 ;i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1 ; i<=10;i++){ //s:string d:integer f:decimal values
            System.out.printf("%-10d %-10d %-10d\n",i,(i)*(i),(i)*(i)*(i));
        }
    }
}
