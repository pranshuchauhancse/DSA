class CountNumbers {

    // Method to count digits in a number
    public int countDigit(int n) {

        int count = 0;   // variable to store number of digits

        // loop runs until the number becomes 0
        while (n > 0) {

            count++;           // increase digit count
            n = n / 10;        // remove the last digit
        }

        System.out.println(count);  // print the digit count
        return count;               // return the count
    }
}



//import java.util.Scanner;
//
//class CountNumbers {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);     // For user input
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();                    // Read number
//
//        int count = 0;                           // To store digit count
//
//        while (n > 0) {                          // Loop until number becomes 0
//            int ld = n % 10;                     // Extract last digit (optional)
//            count++;                              // Increase count
//            n = n / 10;                           // Remove last digit
//        }
//
//        System.out.println("Number of digits: " + count);
//    }
//}

