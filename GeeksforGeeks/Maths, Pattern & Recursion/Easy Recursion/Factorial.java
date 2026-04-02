import java.util.*;

public class Factorial {
     public static int factorial(int n) {
        
        // Calculating factorial of number
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
​
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
