public class RecursiveBS {
    public static int recursiveBinarySearch(int[] arr, int target, int left, int right){
        if (left > right) {
            return -1; // Target not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Target found at index mid
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, target, mid + 1, right); // Search in the right half
        } else {
            return recursiveBinarySearch(arr, target, left, mid - 1); // Search in the left half
        }
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target =0;
        while(target<=10){
            System.out.println(recursiveBinarySearch(sortedArray, target, 0, sortedArray.length - 1));
            target++;
        }
    }
    
}