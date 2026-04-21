import java.util.Arrays;


interface Function {
    int evaluate(int argument);
}

class Half implements Function {
    public int evaluate(int argument) {
        return argument / 2;
    }
}

public class Client {

    // A method that takes an arbitrary array of int values
    public static int[] calculateHalves(int[] inputValues) {
        // Create an array that has the same length
        int[] newArray = new int[inputValues.length];

        // Create an instance of Half
        Half halfInstance = new Half();

        // Loop through the array to process elements
        for (int i = 0; i < inputValues.length; i++) {
            // Use the instance to calculate the values for the new array
            newArray[i] = halfInstance.evaluate(inputValues[i]);
        }

        return newArray;
    }

    public static void main(String[] args) {
        // Test Data
        int[] myArray = {10, 25, 40, 7, 100};

        // Call the method
        int[] halvedArray = calculateHalves(myArray);

        // Print results to verify
        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Halved Array:   " + Arrays.toString(halvedArray));
    }
}