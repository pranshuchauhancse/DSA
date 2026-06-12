package Practise.CArrays.Theory;

import java.util.Scanner;



public class Five {
    // Question : Given an array of marks of students, if the marks are less than 40, print roll number of the student and marks.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt(); // Read the size of the array from user input
        int[] marks = new int[n]; // Create an array of the specified size

        System.out.println("Enter the marks of the students: ");
        for (int i=0; i<n; i++){
            marks[i] = sc.nextInt(); // Read each element of the array from user input
        }

        for (int i=0; i<n; i++){
            if (marks[i] < 40){
                System.out.println("Roll number: " + i + ", Marks: " + marks[i]);
            }
            
        }

    }
    
}
