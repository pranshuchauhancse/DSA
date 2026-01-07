package Day_2;

import java.util.Scanner;
// Count Occurrences
public class E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 2, 3, 2, 4, 2};
        int key1 = 2;
        int count1 = 0;

        for (int x : arr1) {
            if (x == key1) {
                count1++;
            }
        }
        System.out.println("Occurrences (Hard-coded): " + count1);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter element to count: ");
        int key2 = sc.nextInt();
        int count2 = 0;

        for (int x : arr2) {
            if (x == key2) {
                count2++;
            }
        }
        System.out.println("Occurrences (User input): " + count2);
    }
}
