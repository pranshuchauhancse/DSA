package Day_2;

import java.util.Scanner;
// Check Sorted Array
public class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hard-coded input
        int[] arr1 = {1, 2, 3, 4, 5};
        boolean sorted1 = true;

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                sorted1 = false;
                break;
            }
        }
        System.out.println("Hard-coded array sorted: " + sorted1);

        // User input
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean sorted2 = true;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                sorted2 = false;
                break;
            }
        }
        System.out.println("User array sorted: " + sorted2);
    }
}
