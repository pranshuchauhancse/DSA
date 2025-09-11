import java.util.Scanner;

public class HTargetSum {

    public static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        // Loop through all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    ans++;
                }
            }
        }

        return ans;
    }

    // Main method -> program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Array elements input
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Target input
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int result = pairSum(arr, target);
        System.out.println("Total pairs = " + result);

        sc.close();
    }
}
