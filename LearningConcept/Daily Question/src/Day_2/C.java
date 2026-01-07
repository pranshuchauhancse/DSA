package Day_2;

import java.util.Scanner;
// Second Smallest Element

public class C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = {10, 20, 5, 30, 25};

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int x : arr1) {
            if (x < min) {
                smin = min;
                min = x;
            } else if (x < smin && x != min) {
                smin = x;
            }
        }
        System.out.println("Second smallest (Hard-coded): " + smin);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        min = smin = Integer.MAX_VALUE;
        for (int x : arr2) {
            if (x < min) {
                smin = min;
                min = x;
            } else if (x < smin && x != min) {
                smin = x;
            }
        }
        System.out.println("Second smallest (User input): " + smin);
    }
}
