package Practise.CArrays.Theory;

public class Tweleve {
    // passing an array to a method swapping of numbers
    public static void swapFirstAndLast(int[] a) {
        int temp = a[0]; // Store the first element in a temporary variable
        a[0] = a[1]; // Assign the second element to the first position
        a[1] = temp; // Assign the value stored in temp (original first element) to the second position
    }
    
    public static void main(String[] args) {
        int[]  a = {1,2};
        System.out.println(a[0] + " " + a[1]);
        swapFirstAndLast(a); // Call the method to swap first and last elements
        System.out.println(a[0] + " " + a[1]); // Print the swapped array
        
    }
    
}
