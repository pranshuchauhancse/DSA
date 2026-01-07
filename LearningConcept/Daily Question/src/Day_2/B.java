package Day_2;

import java.util.Scanner;
// Second Largest Element

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = {10, 20, 5, 30, 25};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int x : arr1) {
            if (x > max) {
                smax = max;
                max = x;
            } else if (x > smax && x != max) {
                smax = x;
            }
        }
        System.out.println("Second largest (Hard-coded): " + smax);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        max = smax = Integer.MIN_VALUE;
        for (int x : arr2) {
            if (x > max) {
                smax = max;
                max = x;
            } else if (x > smax && x != max) {
                smax = x;
            }
        }
        System.out.println("Second largest (User input): " + smax);
    }
}
