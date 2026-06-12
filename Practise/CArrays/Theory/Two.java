package Practise.CArrays.Theory;

public class Two {
    // Chnaging the value of an array element
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Direct initialization of an array

        // Changing the value of an array element
        arr[2] = 35; // Changing the value at index 2 from 30 to 35

        // Printing the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
    
}
