public class MaxSumSubarrayK {
    public static int findMaxSumSubarray(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Array null.");
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
