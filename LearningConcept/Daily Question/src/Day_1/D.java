package Day_1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

/*
        // Hard-coded input
        int[] arr1 = {3, 7, 2, 9, 5};

        System.out.print("Original array (Hard-coded): ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int start1 = 0, end1 = arr1.length - 1;
        while (start1 < end1) {
            int temp = arr1[start1];
            arr1[start1] = arr1[end1];
            arr1[end1] = temp;
            start1++;
            end1--;
        }

        System.out.print("Reversed array (Hard-coded): ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
*/

        // User input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Original array (User input): ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int start2 = 0, end2 = arr2.length - 1;
        while (start2 < end2) {
            int temp = arr2[start2];
            arr2[start2] = arr2[end2];
            arr2[end2] = temp;
            start2++;
            end2--;
        }

        System.out.print("Reversed array (User input): ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
