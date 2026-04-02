import java.util.*;

public class Print1toN {

    public static void printNumbers(int n) {
        if (n == 0) {   // base case
            return;
        }

        printNumbers(n - 1);  // first go till 1
        System.out.print(n + " ");  // then print while coming back
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}