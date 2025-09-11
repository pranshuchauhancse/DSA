// Leetcode Problem Number : 2

// Package name (must match folder structure, else remove this line)
package LeetcodePractise;

import java.util.Arrays;

public class TwoSum {

    // Function to find two indices such that nums[i] + nums[j] = target
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // Check every pair of numbers
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // If pair matches the target, return indices
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // If no pair found, return empty array
        // (In LeetCode this case won't occur because solution is guaranteed)
        return new int[]{};
    }

    // Main method to test the function
    public static void main(String[] args) {
        TwoSum obj = new TwoSum(); // Create object of class

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call twoSum function
        int[] result = obj.twoSum(nums, target);

        // Print result in array format
        System.out.println(Arrays.toString(result));
    }
}
