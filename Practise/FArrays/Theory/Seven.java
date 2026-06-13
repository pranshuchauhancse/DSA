package Practise.CArrays.Theory;

import java.util.Scanner;

public class Seven {
    // Linear search in an array
    // find x in arr and take input x from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt(); // Read the size of the array from user input
        int[] arr = new int[x]; // Create an array of the specified size

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array from user input
        }
        
        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt(); // Read the element to search from user input
        for (int i = 0; i < x; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    
}
