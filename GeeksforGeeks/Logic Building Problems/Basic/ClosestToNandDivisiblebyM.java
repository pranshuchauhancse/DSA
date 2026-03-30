
import java.util.Scanner;

public class ClosestToNandDivisiblebyM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number N: ");
        int N = s.nextInt();
        System.out.println("Enter a number M: ");
        int M = s.nextInt();
        int closest = N;
        for (int i = N; i >= 0; i--) {
            if (i % M == 0) {
                closest = i;
                break;
            }
        }
        System.out.println("The closest number to " + N + " and divisible by " + M + " is: " + closest);
    }
}
