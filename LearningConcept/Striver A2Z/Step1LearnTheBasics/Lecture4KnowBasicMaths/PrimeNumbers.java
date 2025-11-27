public class PrimeNumberCheck {

    // Method to check if a number is prime
    public void Primenumber(int n) {

        int count = 0;  // To count number of divisors (other than 1 and n)

        if (n <= 1) {   // 0 and 1 are not prime
            System.out.println(n + " is Not a Prime Number");
        } else {

            // Loop from 2 to n-1 to check for factors
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {  // If i divides n
                    count++;        // Increment count
                }
            }

            // If no divisors found (count == 0), number is prime
            if (count == 0) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is Not a Prime Number");
            }
        }
    }
}



//import java.util.Scanner;
//
//public class PrimeNumberCheck {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);       // Scanner for user input
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();                      // Read number from user
//
//        int count = 0;                             // To count number of divisors
//
//        if (n <= 1) {                              // 0 and 1 are not prime
//            System.out.println(n + " is Not a Prime Number");
//        } else {
//
//            // Loop from 2 to n-1 to check for factors
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    count++;                        // Increment count if a factor is found
//                }
//            }
//
//            // If no factors found, count remains 0 → prime
//            if (count == 0) {
//                System.out.println(n + " is a Prime Number");
//            } else {
//                System.out.println(n + " is Not a Prime Number");
//            }
//        }
//    }
//}
