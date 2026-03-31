public class BSProblem2 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        //int fo = -1;
        int end = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                //fo =  mid;
                end = mid;
                right = mid- 1; // Target found at index mid
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        //return fo; // Return the index of the first occurrence of the target
        return end; // Return the index of the last occurrence of the target

    }

    public static void main(String[] args) {
        int[] sortedArray = {2,5,5,5,5,6,6,8,9,9,9}; 
        int target =15;
        System.out.println(binarySearch(sortedArray, target));
    }
}