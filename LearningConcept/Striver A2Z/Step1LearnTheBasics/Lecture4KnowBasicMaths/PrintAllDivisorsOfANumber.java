public class PrintAllDivisorsOfANumber {

    // Method to print all divisors of a number
    public void printDivisor(int n) {

        // Loop from 1 to n (cannot start from 0, division by zero is not allowed)
        for (int i = 1; i <= n; i++) {

            // Check if i divides n completely
            if (n % i == 0) {
                System.out.println(i);   // print the divisor
            }
        }
    }
}



//import java.util.Scanner;
//
//public class PrintAllDivisorsOfANumber {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);      // Scanner for user input
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();                     // Read number from user
//
//        System.out.println("Divisors of " + n + " are:");
//
//        // Loop from 1 to n to find divisors
//        for (int i = 1; i <= n; i++) {
//
//            if (n % i == 0) {                     // Check if i divides n completely
//                System.out.println(i);            // Print the divisor
//            }
//        }
//    }
//}
