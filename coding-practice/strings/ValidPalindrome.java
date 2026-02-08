/**
 * Problem: Valid Palindrome
 * Link: https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 * 
 * A phrase is a palindrome if it reads the same forward and backward.
 * Given a string s, return true if it is a palindrome.
 * Consider only alphanumeric characters and IGNORE CASES.
 * 
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true ("amanaplanacanalpanama" reads same both ways)
 * 
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * 
 * Example 3:
 * Input: s = " "
 * Output: true (empty string is palindrome)
 * 
 * Hints:
 * - Use two pointers from both ends
 * - Skip non-alphanumeric characters
 * - Character.isLetterOrDigit() and Character.toLowerCase() are useful!
 */

public class ValidPalindrome {

    /**
     * TODO: Write your solution here
     * 
     * Think about:
     * - How to skip special characters?
     * - How to compare ignoring case?
     */
    public boolean isPalindrome(String s) {
        // YOUR CODE HERE

        return true;
    }

    // Test your solution
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test Case 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Test 1: " + solution.isPalindrome(s1)); // Expected: true

        // Test Case 2
        String s2 = "race a car";
        System.out.println("Test 2: " + solution.isPalindrome(s2)); // Expected: false

        // Test Case 3
        String s3 = " ";
        System.out.println("Test 3: " + solution.isPalindrome(s3)); // Expected: true

        // Test Case 4
        String s4 = "madam";
        System.out.println("Test 4: " + solution.isPalindrome(s4)); // Expected: true
    }
}
