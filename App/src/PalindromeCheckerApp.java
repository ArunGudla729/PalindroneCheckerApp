/**
 * =====================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @ArunSriramGudla
 * @version 4.0
 */

/**
 * =====================================================
 * UC4: Character Array Based Palindrome Check
 * =====================================================
 * Goal:
 * Convert string to character array and compare characters
 * using two-pointer technique.
 *
 * Key Concepts:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Time Complexity Awareness (O(n))
 */

class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }

    /**
     * Checks whether a given string is a palindrome
     * using character array and two-pointer approach.
     */
    public static boolean isPalindrome(String str) {

        // Convert string to char array
        char[] characters = str.toCharArray();

        // Two pointers
        int start = 0;
        int end = characters.length - 1;

        // Compare characters
        while (start < end) {

            if (characters[start] != characters[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}