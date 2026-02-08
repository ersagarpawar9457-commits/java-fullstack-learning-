
/**
 * Problem: Valid Anagram
 * Link: https://leetcode.com/problems/valid-anagram/
 * Difficulty: Easy
 * 
 * Given two strings s and t, return true if t is an anagram of s.
 * An anagram is a word formed by rearranging the letters of another.
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * Hints:
 * - Both strings must have same characters with same frequency
 * - Option 1: Use int[26] array to count character frequencies
 * - Option 2: Use HashMap for any characters
 */

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /**
     * TODO: Write your solution here
     * 
     * Think about:
     * - What if lengths are different?
     * - How to count character frequencies?
     * - How to compare frequencies efficiently?
     */
    public boolean isAnagram(String s, String t) {
        // YOUR CODE HERE

        return false;
    }

    // Test your solution
    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();

        // Test Case 1
        System.out.println("Test 1: " + solution.isAnagram("anagram", "nagaram")); // Expected: true

        // Test Case 2
        System.out.println("Test 2: " + solution.isAnagram("rat", "car")); // Expected: false

        // Test Case 3
        System.out.println("Test 3: " + solution.isAnagram("listen", "silent")); // Expected: true

        // Test Case 4
        System.out.println("Test 4: " + solution.isAnagram("hello", "world")); // Expected: false
    }
}
