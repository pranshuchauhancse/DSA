import java.util.Arrays;
import java.util.Scanner;

public class GArrayClone {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        int[] arr_2 = arr.clone();
        // int[] arr_2 = Arrays.copyOf(arr, arr.length);

        System.out.println("Copied array (deep copy using clone):");
        printArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Original array after changing arr_2:");
        printArray(arr);

        System.out.println("Copied arr_2 after modification:");
        printArray(arr_2);
    }
}
