import java.util.*;

public class TSortZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Two pointer approach
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                // swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Output sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
