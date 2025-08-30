/// Method 1: Using Addition & Subtraction
import java.util.Scanner;

public class OSwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap without temp
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);

    }
}


/// Method 2: Using XOR
// import java.util.Scanner;

// public class SwapWithoutTemp2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number (a): ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number (b): ");
//         int b = sc.nextInt();

//         System.out.println("Before Swap: a = " + a + ", b = " + b);

//         // Swap without temp (XOR)
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println("After Swap: a = " + a + ", b = " + b);

//         sc.close();
//     }
// }
