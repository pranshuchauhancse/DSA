package Day_3;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- 4. Find missing number (1 to n) ----------
        int[] arr4 = {1, 2, 4, 5};

        int n = arr4.length + 1;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int x : arr4) {
            sum += x;
        }

        System.out.println("Missing number: " + (total - sum));
    }
}
