package Day_3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 1. Rotate array by 1 ----------
        int[] arr1 = {1, 2, 3, 4, 5};

        int last = arr1[arr1.length - 1];

        for (int i = arr1.length - 1; i > 0; i--) {
            arr1[i] = arr1[i - 1];
        }
        arr1[0] = last;

        System.out.print("Rotate by 1: ");
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
