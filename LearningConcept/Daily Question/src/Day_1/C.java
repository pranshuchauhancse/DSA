package Day_1;

import java.util.Scanner;
// Sum of Array
public class C {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        // ---------- 1. Hard-coded array ----------
        int[] arr1 = {3, 7, 2, 9, 5};

        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }

        System.out.println("Sum of array (Hard-coded): " + sum1);

        // ---------- 2. User input array ----------
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }

        System.out.println("Sum of array (User input): " + sum2);

        sc.close();
    }
}
