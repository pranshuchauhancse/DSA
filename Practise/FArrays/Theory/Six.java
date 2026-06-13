package Practise.CArrays.Theory;

public class Six {
    // sum of elements in an array
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Direct initialization of an array
        int sum = 0; // Variable to store the sum of elements

        // Calculate the sum of elements in the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each element to the sum
        }

        System.out.println("Sum of elements in the array: " + sum);
    }
    
}
