import java.util.Scanner;

public class JUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find unique element(s)
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Unique element = " + arr[i]);
            }
        }

    }
}
