package Day_3;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Find missing number (1 to n) ----------
        int[] arr = {1, 2, 4, 5};

        int n = arr.length + 1;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        System.out.println("Missing number: " + (total - sum));
    }
}
