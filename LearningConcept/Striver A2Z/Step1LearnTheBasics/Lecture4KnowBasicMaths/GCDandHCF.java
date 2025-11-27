public class GCD_HCF {

    // Method to calculate and print GCD/HCF of two numbers
    public void GCD(int a, int b) {

        int min;   // To store the smaller number

        // Find smaller of a and b
        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        int gcd = 1;  // Initialize GCD/HCF to 1

        // Loop from 1 to min to find the greatest common factor
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {  // If i divides both numbers
                gcd = i;                      // Update gcd
            }
        }

        // Print the result
        System.out.println("GCD / HCF of " + a + " and " + b + " is: " + gcd);
    }
}



//import java.util.Scanner;
//
//public class GCD_HCF {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);      // Scanner for user input
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();                      // First number
//
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();                      // Second number
//
//        int min;                                   // To store smaller number
//
//        // Find smaller of a and b
//        if (a < b) {
//            min = a;
//        } else {
//            min = b;
//        }
//
//        int gcd = 1;                               // Initialize GCD/HCF to 1
//
//        // Loop from 1 to min to find greatest common factor
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0) {       // If i divides both numbers
//                gcd = i;                           // Update GCD
//            }
//        }
//
//        System.out.println("GCD / HCF of " + a + " and " + b + " is: " + gcd);
//
//    }
//}
