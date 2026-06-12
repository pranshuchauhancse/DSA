package Practise.CArrays.Theory;

public class Eleven {
    // passing an array to a method
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2}; // Sample array
        printArray(arr); // Call the method and pass the array
    }
}
