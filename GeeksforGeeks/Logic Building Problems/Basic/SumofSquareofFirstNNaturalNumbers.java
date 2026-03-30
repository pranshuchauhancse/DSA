import java.util.*;
public class SumofSquareofFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i*i;
        }
        System.out.println("The sum of squares of first " + num + " natural numbers is: " + sum);
    }
    
}
