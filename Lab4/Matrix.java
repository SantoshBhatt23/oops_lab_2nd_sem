import java.util.Scanner;

public class Matrix {

    public static void set(int value, int x, int y, int z, int[] array1D,int SIZE_Y,int SIZE_Z) {
        int index = (x * SIZE_Y * SIZE_Z) + (y * SIZE_Z) + z;
        array1D[index] = value;
        System.out.println("Stored " + value + " at 1D index: " + index);
    }

    public static int get(int x, int y, int z, int[] array1D,int SIZE_Y,int SIZE_Z) {
        int index = (x * SIZE_Y * SIZE_Z) + (y * SIZE_Z) + z;
        return array1D[index];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix: X,Y,Z");
        int SIZE_X = input.nextInt();
        int SIZE_Y = input.nextInt();
        int SIZE_Z = input.nextInt();

        int[] flatArray = new int[SIZE_X * SIZE_Y * SIZE_Z];
        set(99, 1, 2, 0, flatArray,SIZE_Y,SIZE_Z);
        System.out.println("Retrieved value: " + get(1, 2, 0, flatArray,SIZE_Y,SIZE_Z));
    }

}