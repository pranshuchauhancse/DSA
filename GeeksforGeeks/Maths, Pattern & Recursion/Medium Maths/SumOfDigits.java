import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit
            n /= 10; // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}
