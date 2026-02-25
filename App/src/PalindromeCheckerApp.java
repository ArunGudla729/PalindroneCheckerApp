import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * =============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =============================================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome validation algorithms
 * can be selected dynamically at runtime using the Strategy Design Pattern.

 @ArunSriramGudla
 @Version 12.0
 */
public class PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    // Inject the strategy at runtime via constructor or setter
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.isValid(text);
    }

    public static void main(String[] args) {
        PalindromeCheckerApp app = new PalindromeCheckerApp();
        String testInput = "racecar";

        // 1. Using Stack Strategy
        app.setStrategy(new StackStrategy());
        System.out.println("Using StackStrategy: " + app.check(testInput));

        // 2. Using Deque Strategy
        app.setStrategy(new DequeStrategy());
        System.out.println("Using DequeStrategy: " + app.check(testInput));
    }
}

/**
 * =============================================================================
 * INTERFACE - PalindromeStrategy
 * =============================================================================
 * This interface defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean isValid(String text);
}

/**
 * =============================================================================
 * CLASS - StackStrategy
 * =============================================================================
 * Implements palindrome check using a Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return clean.equals(reversed.toString());
    }
}

/**
 * =============================================================================
 * CLASS - DequeStrategy
 * =============================================================================
 * Implements palindrome check using a Deque (Double-Ended Queue).
 */
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}