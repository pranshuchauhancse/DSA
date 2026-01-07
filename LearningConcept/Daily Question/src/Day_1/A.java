package Day_1;

import java.util.Scanner;
// Max Element
public class A {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        /*
        // ---------- 1. Hard-coded array ----------
        int[] arr1 = {3, 7, 2, 9, 5};

        int max1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }

        System.out.println("Max element (Hard-coded): " + max1);
        */

        // ---------- 2. User input array ----------
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int max2 = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }

        System.out.println("Max element (User input): " + max2);

        sc.close();
    }
}
