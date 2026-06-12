package Practise.CArrays.Theory;

import java.util.Scanner;

public class Four {
    // Taking user input for array elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Read the size of the array from user input
        int[] arr = new int[n]; // Create an array of the specified size

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array from user input
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]); // Print each element of the array
        }
    }
}
