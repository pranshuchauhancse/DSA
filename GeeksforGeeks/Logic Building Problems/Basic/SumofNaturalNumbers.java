import java.util.*;
class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum = 0;
        for(int i=0; i<=num; i++){
            sum += i;
        }
        System.out.println("The sum of first " + num + " natural numbers is: " + sum);
    }
}