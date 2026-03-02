/**
 * ==========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        // You can later replace with: new DequeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ==========================================================
 * INTERFACE - PalindromeStrategy
 * ==========================================================
 *
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ==========================================================
 * CLASS - StackStrategy
 * ==========================================================
 *
 * Stack-based implementation of palindrome validation.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}