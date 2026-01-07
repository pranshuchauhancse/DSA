package Day_1;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        System.out.println("Enter the Array:");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int start=0;
        int end = arr.length -1;
        for (int i=0; i<arr.length; i++){
            if (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println("Reverse Array");
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
