// import java.util.Scanner;

// public class FArrayReference {

//     static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] arr = new int[5];

//         System.out.println("Enter 5 elements:");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Original array:");
//         printArray(arr);

//         int[] arr_2 = arr;

//         System.out.println("Copied array (reference copy):");
//         printArray(arr_2);

//         arr_2[0] = 0;
//         arr_2[1] = 0;

//         System.out.println("Original array after changing arr_2:");
//         printArray(arr);

//         System.out.println("Copied arr_2 after modification:");
//         printArray(arr_2);
//     }
// }






// Change Array Example
import java.util.Scanner;

public class FArrayReference {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println("Array changed inside changeArray() method");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        changeArray(arr);

        System.out.println("Array after calling changeArray():");
        printArray(arr);
    }
}
