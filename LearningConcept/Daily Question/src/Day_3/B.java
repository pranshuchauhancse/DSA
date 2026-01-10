package Day_3;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 2. Left rotate array by K ----------
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.print("Enter K: ");
        int k = sc.nextInt();
        k = k % arr2.length;

        for (int r = 0; r < k; r++) {
            int first = arr2[0];
            for (int i = 0; i < arr2.length - 1; i++) {
                arr2[i] = arr2[i + 1];
            }
            arr2[arr2.length - 1] = first;
        }

        System.out.print("Left rotate by K: ");
        for (int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();

        sc.close();
    }
}
