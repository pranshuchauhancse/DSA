import java.util.Scanner;

public class RRotateArrayInPlace {
    // Function to reverse part of array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (steps to rotate): ");
        int k = sc.nextInt();

        k = k % n; // Normalize k

        // Step 1: Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Print rotated array
        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
