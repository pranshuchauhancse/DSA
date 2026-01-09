package Day_3;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 3. Remove duplicates from sorted array ----------
        int[] arr3 = {1, 1, 2, 2, 3, 4, 4};
        int j = 0;

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] != arr3[j]) {
                j++;
                arr3[j] = arr3[i];
            }
        }

        System.out.print("Remove duplicates: ");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

    }
}
