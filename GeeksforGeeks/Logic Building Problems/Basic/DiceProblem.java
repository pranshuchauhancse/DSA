import java.util.Scanner;

public class DiceProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of dice: ");
        int n = sc.nextInt();
        int ans = 0;
        if (n == 1) {
            ans = 6;
        }
        else if (n == 2) {
            ans = 5;
        }
        else if (n == 3) {
            ans = 4;
        }
        else if (n == 4) {
            ans = 3;
        }
        else if (n == 5) {
            ans = 2;
        }
        else {
            ans = 1;
        }
        System.out.println("Total possible outcomes when rolling " + n + " dice: " + ans);
    }
}
