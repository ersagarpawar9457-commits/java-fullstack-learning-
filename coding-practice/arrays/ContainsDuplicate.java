
/**
 * Problem: Contains Duplicate
 * Link: https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 * 
 * Given an integer array nums, return true if any value appears 
 * at least twice in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * 
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 * Hint: Think about using a Set!
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * TODO: Write your solution here
     * 
     * Think about:
     * - Which data structure doesn't allow duplicates?
     * - What does add() return when element already exists?
     */
    public boolean containsDuplicate(int[] nums) {
        // YOUR CODE HERE

        return false;
    }

    // Test your solution
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Test Case 1
        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println("Test 1: " + solution.containsDuplicate(nums1)); // Expected: true

        // Test Case 2
        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Test 2: " + solution.containsDuplicate(nums2)); // Expected: false

        // Test Case 3
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Test 3: " + solution.containsDuplicate(nums3)); // Expected: true
    }
}
