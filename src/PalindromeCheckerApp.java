/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures the execution performance
 * of a selected palindrome validation algorithm.
 *
 * It captures start and end time using System.nanoTime()
 * and displays the total execution duration.
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Use existing strategy from UC12
        PalindromeStrategy strategy = new StackStrategy();

        // Start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}
