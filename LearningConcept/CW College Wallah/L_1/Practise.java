package L_1;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        System.out.println("Enter The Input:");
        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt(); // it will take only integer input
        String name = sc.next(); // it will take input until space
        String line = sc.nextLine(); // to take the input in the new line
        float marks = sc.nextFloat(); // it will take float input
        boolean check = sc.nextBoolean(); // it will take boolean input

        System.out.println("The Input is: " + Input);
        System.out.println("The Name is: " + name);
        System.out.println("The Line is: " + line);
        System.out.println("The Marks are: " + marks);
        System.out.println("The Check is: " + check);
    }
}
