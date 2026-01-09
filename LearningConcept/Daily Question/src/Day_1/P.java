package Day_1;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {

        System.out.println("Pranshu Chauhan");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        System.out.println("Enter the array:");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
               even++;
            } else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
