package strings;

/**
 * 125. Valid Palindrome (Easy)
 * https://leetcode.com/problems/valid-palindrome/
 *
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and
 * backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // YOUR CODE HERE
        // Hint: Use two pointers (start and end).
        // specific methods: Character.isLetterOrDigit(char),
        // Character.toLowerCase(char)
        for (int i = 0; i < s.length() / 2; i++) {
            if(Cha)
        }

        return false; // placeholder
    }

    public static void main(String[] args) {
        ValidPalindrome solver = new ValidPalindrome();

        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";

        System.out.println("Test 1: " + solver.isPalindrome(test1)); // Expected: true
        System.out.println("Test 2: " + solver.isPalindrome(test2)); // Expected: false
        System.out.println("Test 3: " + solver.isPalindrome(test3)); // Expected: true
    }
}
