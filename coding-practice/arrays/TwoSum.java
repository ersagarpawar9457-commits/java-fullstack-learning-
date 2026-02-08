
/**
 * Problem: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * 
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input has exactly one solution.
 * You may not use the same element twice.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1] (because nums[0] + nums[1] == 9)
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * Hint: Think about using a HashMap!
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * TODO: Write your solution here
     * 
     * Think about:
     * - What data structure can help with O(1) lookup?
     * - What are you looking for at each step?
     */
    public int[] twoSum(int[] nums, int target) {
        // YOUR CODE HERE

        return new int[] { -1, -1 };
    }

    // Test your solution
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Test Case 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]"); // Expected: [0, 1]

        // Test Case 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]"); // Expected: [1, 2]

        // Test Case 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]"); // Expected: [0, 1]
    }
}
