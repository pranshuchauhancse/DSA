import java.util.*;

public class PrintNto1 {

    public static void printReverse(int n) {
        if (n == 0) {   // base case
            return;
        }

        System.out.print(n + " ");  // print first
        printReverse(n - 1);        // then recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printReverse(n);
    }
}