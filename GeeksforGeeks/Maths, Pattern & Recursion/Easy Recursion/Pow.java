import java.util.*;
public class Pow {
    // pow(b,e)
    public static int pow(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * pow(b, e - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter exponent: ");
        int e = sc.nextInt();
        System.out.println(pow(b, e));
    }    
}
