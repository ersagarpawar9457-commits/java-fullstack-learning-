/**
 * Problem: Reverse String
 * Link: https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 * 
 * Write a function that reverses a string.
 * The input string is given as an array of characters.
 * You must do this IN-PLACE with O(1) extra memory.
 * 
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * 
 * Hint: Two pointers from both ends!
 */

public class ReverseString {

    /**
     * TODO: Write your solution here
     * 
     * Think about:
     * - Start from both ends
     * - What do you do at each step?
     * - When do you stop?
     */
    public void reverseString(char[] s) {
        // YOUR CODE HERE

    }

    // Test your solution
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();

        // Test Case 1
        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        solution.reverseString(s1);
        System.out.println("Test 1: " + String.valueOf(s1)); // Expected: olleh

        // Test Case 2
        char[] s2 = { 'H', 'a', 'n', 'n', 'a', 'h' };
        solution.reverseString(s2);
        System.out.println("Test 2: " + String.valueOf(s2)); // Expected: hannaH

        // Test Case 3
        char[] s3 = { 'S', 'a', 'g', 'a', 'r' };
        solution.reverseString(s3);
        System.out.println("Test 3: " + String.valueOf(s3)); // Expected: ragaS
    }
}
