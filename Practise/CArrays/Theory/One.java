package Practise.CArrays.Theory;

public class One {
    
    //Initialization and Printing of an array
    public static void main(String[] args) {
        int[] arr = new int[5]; // Declaration and initialization of an array of size 5
        arr[0] = 10; // Assigning values to the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Direct initialization of an array
        //int[] arr2 = {1, 2, 3, 4, 5};

        // Printing or Access the elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
    
}