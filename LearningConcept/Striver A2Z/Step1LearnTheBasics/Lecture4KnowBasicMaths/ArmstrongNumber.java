public class ArmstrongNumber {

    // Method to check if a number is Armstrong
    public void armstrongNumber(int n) {

        int duplicate = n;   // Store the original number for comparison
        int sum = 0;         // Will store the sum of cubes of digits

        // Extract digits and calculate cube sum
        while (n > 0) {
            int lastdigit = n % 10;                 // Get the last digit
            sum = sum + (lastdigit * lastdigit * lastdigit); // Add cube of digit
            n = n / 10;                              // Remove the last digit
        }

        System.out.println("Sum of cubes: " + sum);  // Print the calculated sum

        // Check if original number equals the sum of cubes
        if (duplicate == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}



//import java.util.Scanner;
//
//public class ArmstrongNumber {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);          // For user input
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();                         // Read the number
//
//        int duplicate = n;                            // Store original number
//        int sum = 0;                                  // To store sum of cubes of digits
//
//        // Calculate sum of cubes of digits
//        while (n > 0) {
//            int lastdigit = n % 10;                   // Extract last digit
//            sum += lastdigit * lastdigit * lastdigit; // Cube and add to sum
//            n = n / 10;                               // Remove last digit
//        }
//
//        System.out.println("Sum of cubes: " + sum);  // Print sum
//
//        // Check if Armstrong
//        if (sum == duplicate) {
//            System.out.println("Armstrong Number");
//        } else {
//            System.out.println("Not an Armstrong Number");
//        }
//
//        sc.close();                                   // Close Scanner
//    }
//}
