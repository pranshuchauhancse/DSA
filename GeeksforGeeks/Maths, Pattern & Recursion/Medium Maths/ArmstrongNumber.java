import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // Get the number of digits
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Add the digit raised to the power of the number of digits
            n /= 10; // Remove the last digit
        }
        boolean isArmstrong = (sum == originalNumber);
        System.out.println("Is the number an Armstrong number:- " + isArmstrong);
    }    
}
