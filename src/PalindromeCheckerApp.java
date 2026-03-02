import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Convert String to char array
        char[] characters = input.toCharArray();

        // Two pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
