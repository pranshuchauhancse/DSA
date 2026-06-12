package Practise.CArrays.Theory;

public class Eight {
    // Finding the maximum element in an array
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50}; // Direct initialization of an array
        int max = arr[0]; // Initialize max with the first element of the array

        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
    
}
