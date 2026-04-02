import java.util.Scanner;

public class PrimeTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // n is divisible by a number other than 1 and itself
                    break;
                }
            }
        }
        System.out.println("Is the number prime? " + isPrime);
    }
}
