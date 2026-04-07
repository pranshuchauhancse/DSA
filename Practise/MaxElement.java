import java.util.*;

public class MaxElement {
    // Single Class Solution
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
        arr[0] = sc.nextInt();
        int max = arr[0];
        for (int i=1; i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
    
}
