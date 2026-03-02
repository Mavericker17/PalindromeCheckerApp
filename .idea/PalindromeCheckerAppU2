import java.util.Scanner;

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Check palindrome
        boolean isPalindrome = input.equals(reversed);

        // Print result
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
