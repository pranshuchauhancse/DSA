package Day_1;

import java.util.Scanner;
// Reverse Array
public class D {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        // ---------- 1. Hard-coded array ----------
        int[] arr1 = {3, 7, 2, 9, 5};

        System.out.print("Original array (Hard-coded): ");
        printArray(arr1);

        reverseArray(arr1);

        System.out.print("Reversed array (Hard-coded): ");
        printArray(arr1);

        // ---------- 2. User input array ----------
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Original array (User input): ");
        printArray(arr2);

        reverseArray(arr2);

        System.out.print("Reversed array (User input): ");
        printArray(arr2);

        sc.close();
    }

    // Method to reverse array
    static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to print array
    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
