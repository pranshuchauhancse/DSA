public class CheckPalindrome {

    public void checkPalindrome(int n) {   // changed to void (since we only print)

        int duplicate = n;    // store original number
        int Reverse = 0;      // to store reverse of n

        // reverse the number
        while (n > 0) {
            int lastdigit = n % 10;      // extract last digit
            n = n / 10;                  // remove last digit
            Reverse = (Reverse * 10) + lastdigit;  // build reversed number
        }

        // compare reversed number with original number
        if (Reverse == duplicate) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}



//import java.util.Scanner;
//
//public class CheckPalindrome {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);   // For user input
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();                  // Read number from user
//
//        int duplicate = n;                     // Store original number
//        int Reverse = 0;                       // Variable for reversed number
//
//        // Reverse the number
//        while (n > 0) {
//            int lastdigit = n % 10;            // Extract last digit
//            n = n / 10;                        // Remove last digit
//            Reverse = (Reverse * 10) + lastdigit;  // Build reversed number
//        }
//
//        // Check palindrome
//        if (Reverse == duplicate) {
//            System.out.println("Palindrome Number");
//        } else {
//            System.out.println("Not a Palindrome");
//        }
//    }
//}
