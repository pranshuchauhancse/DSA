package Day_2;

import java.util.Scanner;
// Linear Search

public class D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr1 = {3, 5, 7, 9, 11};
        int key1 = 7;
        int found1 = -1;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == key1) {
                found1 = i;
                break;
            }
        }
        System.out.println("Hard-coded index: " + found1);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key2 = sc.nextInt();
        int found2 = -1;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == key2) {
                found2 = i;
                break;
            }
        }
        System.out.println("User input index: " + found2);
    }
}
