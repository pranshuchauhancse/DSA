import java.util.Scanner;

public class SQueryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: create presence array
        boolean[] present = new boolean[100000]; 

        // Step 2: mark elements as present
        for (int i = 0; i < n; i++) {
            present[arr[i]] = true;
        }

        // Input queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter queries:");
        while (q-- > 0) {
            int x = sc.nextInt();
            if (present[x]) {
                System.out.println(x + " is present in array.");
            } else {
                System.out.println(x + " is NOT present in array.");
            }
        }

        sc.close();
    }
}
