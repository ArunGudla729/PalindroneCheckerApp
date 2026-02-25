/**
 * ============================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 *  - removeFirst()
 *  - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @ArunSriramGudla
 * @version 8.0
 */

public class PalindromeCheckerApp {

    /**
     * Node class representing singly linked list node
     */
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level"; // predefined input (can modify)

        boolean result = isPalindrome(input);

        System.out.println("===== UC8: Linked List Based Palindrome Checker =====");
        System.out.println("Input: " + input);

        if (result) {
            System.out.println("Result: The given string IS a palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }
    }

    /**
     * Checks palindrome using singly linked list
     */
    public static boolean isPalindrome(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        // Step 1: Convert string to singly linked list
        Node head = null;
        Node tail = null;

        for (char ch : input.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using fast and slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half
        Node secondHalf = reverseList(slow);

        // Step 4: Compare first half and reversed second half
        Node firstHalf = head;
        Node tempSecond = secondHalf;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        return true;
    }

    /**
     * Reverses a linked list in-place
     */
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}