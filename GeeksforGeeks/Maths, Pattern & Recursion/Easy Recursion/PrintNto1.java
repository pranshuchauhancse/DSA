import java.util.jar.*;
public class PrintNto1 {

    // Recursive function
    public static int sum(int n) {
        if (n == 1) {   // base case
            return 1;
        }
        return n + sum(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = sum(n);

        System.out.println(result);
    }

}
