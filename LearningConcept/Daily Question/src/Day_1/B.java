package Day_1;

import java.util.Scanner;
// Min Element
public class B {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        // ---------- 1. Hard-coded array ----------
        int[] arr1 = {3, 7, 2, 9, 5};

        int min1 = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min1) {
                min1 = arr1[i];
            }
        }

        System.out.println("Min element (Hard-coded): " + min1);

        // ---------- 2. User input array ----------
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int min2 = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min2) {
                min2 = arr2[i];
            }
        }

        System.out.println("Min element (User input): " + min2);

        sc.close();
    }
}
