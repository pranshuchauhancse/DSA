package Day_1;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        // ---------- 1. Hard-coded array ----------
        int[] arr1 = {3, 7, 2, 9, 5, 8};

        int even1 = 0, odd1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                even1++;
            } else {
                odd1++;
            }
        }

        System.out.println("Hard-coded array:");
        System.out.println("Even count: " + even1);
        System.out.println("Odd count: " + odd1);

        // ---------- 2. User input array ----------
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int even2 = 0, odd2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                even2++;
            } else {
                odd2++;
            }
        }

        System.out.println("User input array:");
        System.out.println("Even count: " + even2);
        System.out.println("Odd count: " + odd2);

        sc.close();
    }
}
