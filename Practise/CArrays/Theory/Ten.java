package Practise.CArrays.Theory;

public class Ten {
    // count the number of elements in given array greater than a given number x
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2}; // Sample array
        int x = 4; // Given number

        int count = 0; // Initialize count to zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++; // Increment count if the element is greater than x
            }
        }
        System.out.println("Number of elements greater than " + x + ": " + count);
    }
    
}
