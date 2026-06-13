package Practise.CArrays.Theory;

import java.util.Scanner;

public class Nine {
    // Second largest element in an array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // Read the size of the array from user input
        int[] arr = new int[n]; // Create an array of the specified size

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array from user input
        }

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int secondLargest = Integer.MIN_VALUE; // Initialize second largest to the smallest possible integer

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update second largest if it's greater than current second largest and not equal to largest
            }
        }
        System.out.println("Second largest element in the array: " + secondLargest);
    }
    
}
