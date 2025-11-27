public class ReverseANumber {

    public void reverseNumber(int n) {

        int reverse = 0;     // variable to store reversed number

        while (n > 0) {

            int lastdigit = n % 10;   // extract last digit
            n = n / 10;               // remove last digit from number

            reverse = (reverse * 10) + lastdigit;
            // shift existing digits left and add the new digit
        }

        System.out.println(reverse);  // print reversed number
    }
}



//import java.util.Scanner;
//
//public class ReverseANumber {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);   // To take user input
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();                  // Read number from user
//
//        int reverse = 0;                       // To store reversed number
//
//        while (n > 0) {
//            int lastdigit = n % 10;            // Get last digit
//            n = n / 10;                        // Remove last digit
//
//            reverse = (reverse * 10) + lastdigit;
//            // Add last digit to reversed number
//        }
//
//        System.out.println("Reversed number: " + reverse);
//    }
//}
